import vue from '@vitejs/plugin-vue'
<script setup lang='ts'></script>


<script>
export default {
// create a new table element
var table = document.createElement('table');

// create three rows
for (var i = 0; i &lt; 3; i++) {
  var row = document.createElement('tr');

  // create two cells for each row
  for (var j = 0; j &lt; 2; j++) {
    var cell = document.createElement('td');
    cell.textContent = 'Row ' + i + ', Column ' + j;
    row.appendChild(cell);
  }

  // add the row to the table
  table.appendChild(row);
}

// add the table to the page
document.body.appendChild(table);
}
</script>

<style>
.my-component {
    table {
        color: white;
    }
}

</style> 