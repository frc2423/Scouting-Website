<script setup lang='ts'></script>

<template>
<body>
<script lang="js">
// create a new table element
var table = document.createElement('table');

// create three rows
for (var i = 0; i < 3; i++) {
  var row = document.createElement('tr');

  // create two cells for each row
  for (var j = 0; j < 2; j++) {
    var cell = document.createElement('td');
    cell.textContent = 'Row ' + i + ', Column ' + j;
    row.appendChild(cell);
  }

  // add the row to the table
  table.appendChild(row);
}

// add the table to the page
document.body.appendChild(table);
</script>
HIIIIII IT WORK
</body>
</template>