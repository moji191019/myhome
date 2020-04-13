<template>
  <div id="wrap" class="wrap">
    <header-component></header-component>
    <div class="visual">visual Content</div>
    <div class="main">main Content</div>
    <div class="footer">footer</div>
  </div>
</template>

<script>
import HeaderComponent from './header/headerComponent';

export default {
  name: 'mainComponent',
  components: { HeaderComponent },
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
