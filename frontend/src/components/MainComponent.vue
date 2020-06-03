<template>
  <div id="wrap" class="wrap">
    <header-component></header-component>
    <visual-component></visual-component>
    <container-component></container-component>
    <footer-component></footer-component>
    <login-component></login-component>
  </div>
</template>

<script>
import HeaderComponent from '@/components/header/headerComponent';
import VisualComponent from '@/components/visual/visualComponent';
import ContainerComponent from '@/components/container/containerComponent';
import footerComponent from '@/components/footer/footerComponent';
import loginComponent from '@/components/login/loginComponent';

export default {
  name: 'mainComponent',
  components: { HeaderComponent, VisualComponent, ContainerComponent, footerComponent, loginComponent },
  computed: {

  },
  methods: {

  },

  // created() {
  //   this.$store.dispatch('FETCH_NEWS');
  // },

  data() {
    return {
    };
  },
};
</script>

<style lang="scss">
</style>
