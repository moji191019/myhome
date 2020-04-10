<template>
  <div>
    <div :key="item" v-for = "item in news">
      {{ item }}
    </div>
  </div>
</template>

<script>
export default {
  name: 'TestComp',
  computed: {
    news() {
      console.log('this.$store.state.news', this.$store.state.news);
      return this.$store.state.news;
    },
  },
  created() {
    this.$store.dispatch('FETCH_NEWS');
  },
};
</script>

<style scoped>

</style>
