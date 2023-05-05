<script>
    export default{
        data(){
            return {
                allCapabilities: ["score_high", "score_low", "cones", "cubes", "auto"]
            }
        },
        methods:{
            isCapable(capability){
                return this.teamm.capabilities.includes(capability)
            }
        },
        props: [ 'teamm']
    }
</script>
<template>
    <h2>{{ teamm.name }}</h2>
    <div>{{ teamm.location }}</div>
    <span :class="{capable: isCapable(capability), incapable: !isCapable(capability)}" v-for="capability in allCapabilities">
        {{ capability }} | 
    </span>

</template>

<style scoped>
    .capable{
        color: green
    }

    .incapable{
        color: red
    }
</style>