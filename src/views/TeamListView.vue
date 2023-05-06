<script>
import TeamRow from '../components/TeamRow.vue'

export default{
    components: {
        TeamRow
    },
    data(){
        return{
            teams:[
                {
                    name: "The Kwarqs",
                    location: "Watertown, MA",
                    capabilities: ["score_high", "score_low", "cones", "cubes", "auto"],
                    index: 1
                },
                {
                    name: "The Highlanders", 
                    location: "Somerville, MA",
                    capabilities: ["score_high", "score_low"],
                    index: 2
                },
                {
                    name: "Mechanical Advantage", 
                    location: "Quincy, MA",
                    capabilities: ["score_high", "score_low", "cubes"],
                    index: 3
                }
            ],
            testProp: "asdf"
        }
    }
}
</script>


<template>
    <div>
        <h1>Team List</h1>
        <TeamRow v-for="team in teams" :teamm="team" :key="team.index"  />
    </div>



</template>