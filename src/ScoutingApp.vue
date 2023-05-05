<script setup lang="ts">
import { RouterLink, RouterView } from 'vue-router'
import HelloWorld from './components/HelloWorld.vue'
</script>

<template>
  <div>
    <nav>
        <RouterLink to="/about">About</RouterLink>
        <RouterLink to="/teamlist">Team List</RouterLink>
    </nav>
  </div>

  <RouterView />
</template>

<style scoped>

</style>
