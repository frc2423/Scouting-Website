<script>
    export default{
        data(){
            return {
                allCapabilities: ["score_high", "score_low", "cones", "cubes", "auto"]
            }
        },
        props: ['teamName', 'location']
    }
</script>
<template>
    <h2>{{ teamName }}</h2>
    <div>{{ location }}</div>
    <div class="incapable" v-for="capability in allCapabilities">
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