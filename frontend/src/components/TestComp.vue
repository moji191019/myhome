<template>
  <div v-for="item in news">
    {{ item }}
  </div>
</template>

<script>
export default {
  name: 'TestComp',
  computed: {
    news() {
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
