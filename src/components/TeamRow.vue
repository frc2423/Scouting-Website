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
        props: ['teamName', 'location', 'teamm', 'capabilities']
    }
</script>
<template>
    <h2>{{ teamm.name }}</h2>
    <div>{{ teamm.location }}</div>
    <div :class="{capable: isCapable(capability), incapable: !isCapable(capability)}" v-for="capability in allCapabilities">
        {{ capability }}
    </div>

</template>

<style scoped>
    .capable{
        color: green
    }

    .incapable{
        color: red
    }
</style>