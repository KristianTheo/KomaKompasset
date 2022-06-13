<template>
  <GlobalHeader />
  <GlobalIcons />
  <main class="container page-container pt-4 pt-lg-6" id="main-content">
    <RouterView />
  </main>
  <GlobalFooter />
</template>
<script lang="ts">
import { RouterLink, RouterView } from 'vue-router'
import GlobalHeader from "@/components/GlobalHeader.vue";
import GlobalFooter from "@/components/GlobalFooter.vue";
import GlobalIcons from "@/components/GlobalIcons.vue";
import {Options, Vue} from "vue-class-component";

@Options({
  components: {
    GlobalHeader,
    GlobalFooter,
    GlobalIcons

  }
})
export default class App extends Vue {

}
</script>
<style>
@import './assets/base.css';

</style>
