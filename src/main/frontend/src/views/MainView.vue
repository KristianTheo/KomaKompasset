<template>
  <main>
    <HelloWorld :msg="'Velkommen til KomaKompasset'" />
  </main>
</template>

<script lang="ts">
import { Options, Vue } from 'vue-class-component'
import { Prop } from "vue-property-decorator";
import axios from "axios";
import HelloWorld from "@/components/HelloWorld.vue";

@Options({
  components: {
    HelloWorld
  }
})
export default class MainView extends Vue {

}

</script>
