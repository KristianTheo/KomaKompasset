<template>
  <header class="header"><a href="#main-content" class="skipnav">Gå til
    sidens indhold</a>

    <!--1A: Portal header -->
    <div class="portal-header portal-header-compact">
      <div class="container portal-header-inner">
        <a href="javascript:void(0);" aria-label="Portalnavn" class="logo ">

        </a>
        <button class="function-link button-menu-open js-menu-open ml-auto d-print-none" aria-haspopup="menu" title="Åben mobil menu"><svg class="icon-svg" focusable="false" aria-hidden="true"><use xlink:href="#menu"></use></svg>Menu</button>

        <!-- 1B: Portal header: info + actions-->
        <div class="portal-info">

          <p class="user"><span class="username">Anders
                        Andersen</span> </p>

          <button class="button button-secondary d-print-none">
            Log af
          </button>
        </div>
      </div>
    </div>

    <!--2A: Solution header -->
    <div class="solution-header ">
      <div class="container solution-header-inner">
        <div class="solution-heading">
          <a href="#" class="">
            Komakompasset
          </a>
        </div>

        <!--2B: Solution header: Authority name + text-->
        <div class="solution-info ">
          <!-- nav-secondary -->

          <p class="h5 authority-name"> Styrelsen for Eksempler</p>

          <p>Support: 72 20 60 00 <span class="d-print-none">· <a href="javascript:void(0);" data-module="modal" data-target="modal-contact" class="function-link d-inline-block"><svg class="icon-svg" aria-hidden="true" focusable="false"><use xlink:href="#card-text"></use></svg>Kontakt</a></span>
          </p>

        </div>
      </div>
    </div>

    <div class="overlay"></div>
    <nav class=" nav">
      <!-- collapsible-->
      <button class="function-link button-menu-close js-menu-close" title="Luk mobil menu"><svg class="icon-svg" aria-hidden="true"><use xlink:href="#close"></use></svg>Luk</button>

      <div class="portal-info-mobile">
        <p class="user bold">Anders Andersen</p>
        <a href="#" class="button button-secondary button-signout">
          Log af
        </a>
      </div>

      <div class="solution-info-mobile">
        <p class="bold">Erhvervsministeriet</p>
        <p><a href="javascript:void(0);" data-module="modal" data-target="modal-contact" class="function-link d-inline-block"><svg class="icon-svg" aria-hidden="true"><use xlink:href="#card-text"></use></svg>Kontakt</a>
        </p>
      </div>
    </nav> <!-- collapsible nav end-->
  </header>
</template>

<script lang="ts">
import {Vue} from "vue-class-component";

export default class GlobalHeader extends Vue {
}
</script>

<style scoped>

</style>