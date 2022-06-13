import 'dkfds/dist/css/dkfds.min.css'
import 'dkfds/dist/css/dkfds-virkdk.min.css'

import { createApp } from 'vue'
import App from './App.vue'
import router from './router'

const app = createApp(App)

app.use(router)

app.mount('#app')
