<template>
  <footer>
    <div class="footer">
      <div class="container">
        <ul class="align-text-left unstyled-list inline-list">
          <li class=""><span class="h5 weight-semibold">Eksempelstyrelsen</span>
          </li>
          <li class=""><a class="function-link" href="mailto:support@example.dk">support@example.dk</a>
          </li>
          <li class=""><a class="function-link" href="tel:12345678">12 34 56 78</a></li>
          <li class="d-print-none"><a href="#" class="function-link icon-link">Tilgængelighedserklæring<svg class="icon-svg" focusable=">false" aria-hidden="true"><use xlink:href="#open-in-new"></use></svg></a>
          </li>
          <li class="d-print-none"><a href="#" class="function-link">Privatlivspolitik
            (cookies)</a></li>
        </ul>
      </div>
    </div>

  </footer>
</template>

<script lang="ts">
import {Vue} from "vue-class-component";

export default class GlobalFooter extends Vue {
}
</script>

<style scoped>

</style>