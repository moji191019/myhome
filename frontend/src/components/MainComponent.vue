<template>
  <div id="wrap" class="wrap">
    <header-component></header-component>
    <visual-component></visual-component>
    <div class="main">main Content</div>
    <footer-component></footer-component>
  </div>
</template>

<script>
import HeaderComponent from '@/components/header/headerComponent';
import VisualComponent from '@/components/visual/visualComponent';
import footerComponent from '@/components/footer/footerComponent';

export default {
  name: 'mainComponent',
  components: { HeaderComponent, VisualComponent, footerComponent },
  computed: {

  },
  methods: {

  },
  data() {
    return {
    };
  },
};
</script>

<style lang="scss">
</style>
