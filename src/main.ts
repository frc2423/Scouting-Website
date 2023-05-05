import { createApp } from 'vue'
import { createPinia } from 'pinia'

import ScoutingApp from './ScoutingApp.vue'
import router from './router'

import './assets/main.css'

const app = createApp(ScoutingApp)

app.use(createPinia())
app.use(router)

app.mount('#app')
