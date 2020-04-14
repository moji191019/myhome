<template>
  <div id="wrap" class="wrap">
    <header-component></header-component>
    <visual-component></visual-component>
    <div class="main">main Content</div>
    <div class="footer">footer</div>
  </div>
</template>

<script>
import HeaderComponent from './header/headerComponent';
import VisualComponent from './visual/visualComponent';

export default {
  name: 'mainComponent',
  components: { HeaderComponent, VisualComponent },
  computed: {
    news() {
      console.log('this.$store.state.news', this.$store.state.news);
      return this.$store.state.news.data;
    },
  },
  created() {
    this.$store.dispatch('FETCH_NEWS');
  },
};
</script>

<style lang="scss">
</style>
