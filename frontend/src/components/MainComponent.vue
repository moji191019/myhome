<template>
  <div class="wrapper">
    <div style="grid-column: 1 / 4; grid-row: 1;">Header</div>
    <div style="grid-column: 1; grid-row: 2;">Left</div>
    <div style="grid-column: 2; grid-row: 2;">Main</div>
    <div style="grid-column: 3; grid-row: 2;">Right</div>
    <div style="grid-column: 1 / 4; grid-row: 3;">Footer</div>
  </div>
</template>

<script>
export default {
  name: 'mainComponent',
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
.wrapper {
  display: grid;
  grid-column-gap: 6px;
  grid-row-gap: 6px;
  grid-template-columns: 150px 1fr 150px;
  grid-template-rows: 100px 1fr 100px;
}
</style>
