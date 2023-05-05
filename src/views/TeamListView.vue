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
                    capabilities: ["score_high", "score_low", "cones", "cubes", "auto"]
                },
                {
                    name: "The Highlanders", 
                    location: "Somerville, MA",
                    capabilities: ["score_high", "score_low"]
                }
            ],
        }
    }
}
</script>


<template>
    <div>
        <h1>Team List</h1>
        <TeamRow v-for="team in teams" :key="team.name" :teamName="team.name" :location="team.location" />

    </div>
</template>