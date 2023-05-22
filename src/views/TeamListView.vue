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
            teamFilter:""
        }
    },
    computed: {
        filteredTeams(){
            if(this.teamFilter == ""){
                return this.teams
            } else{
                return this.teams.map(team => team.name.toLowerCase()).filter(name => name.includes(this.teamFilter.toLowerCase()))
            }
        }
    }
}
</script>


<template>
    <div>
        <h1>Team List</h1>
        <div>
            <input v-model="teamFilter" placeholder="Filter by team name...">
        </div>
        
        <TeamRow v-for="team in filteredTeams" :teamm="team" :key="team.index"  />
    </div>



</template>