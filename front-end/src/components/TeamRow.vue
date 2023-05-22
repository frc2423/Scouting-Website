<script>
    export default{
        data(){
            return {
                allCapabilities: ["score_high", "score_low", "cones", "cubes", "auto"],
                editMode: false
            }
        },
        methods:{
            isCapable(capability){
                return this.teamm.capabilities.includes(capability)
            },
            toggleCapability(team, capability){
                let idx = team.capabilities.indexOf(capability)
                if(idx > -1){
                    team.capabilities.splice(idx, 1)
                } else{
                    team.capabilities.push(capability)
                }
            }
        },
        props: [ 'teamm']
    }
</script>
<template>
    <div>
        <div><input :disabled="!editMode" v-model="teamm.name"/></div>
        <div><input :disabled="!editMode" v-model="teamm.location"/></div>
        
        <span v-for="capability in allCapabilities" :key="capability">
            <button :disabled="!editMode" @click="toggleCapability(this.teamm, capability)" :class="{capable: isCapable(capability), incapable: !isCapable(capability)}">{{ capability }}</button>
        
        </span>
        
        <div>
            <button v-if="!editMode" @click="editMode = !editMode">Edit</button>
            <button v-else @click="editMode = !editMode">Save</button>
        </div>
    </div>

</template>

<style scoped>
    .capable{
        color: green;
    }

    .incapable{
        color: red
    }
</style>