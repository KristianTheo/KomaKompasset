<template>
  <div class="greetings">
    <h1 class="green">{{ msg }}</h1>

    <h3>
      {{ messageFromBackend }}
    </h3>
  </div>
</template>
<script lang="ts">
import { Options, Vue } from 'vue-class-component'
import { Prop } from "vue-property-decorator";
import axios from "axios";

@Options({})
export default class HelloWorld extends Vue {
  @Prop()
  msg = ''

  messageFromBackend = ''

  async created() {
    await axios.get("http://localhost:3333/helloworldmessage")
        .then((response) => {
          this.messageFromBackend = response.data
        })
        .catch((error) => {
          console.error("Der skete en fejl... Har du husket at starte backend? " + error)
        })
  }
}
</script>
<style scoped>
h1 {
  font-weight: 500;
  font-size: 2.6rem;
  top: -10px;
}

h3 {
  font-size: 1.2rem;
}

.greetings h1,
.greetings h3 {
  text-align: center;
}

@media (min-width: 1024px) {
  .greetings h1,
  .greetings h3 {
    text-align: left;
  }
}
</style>
