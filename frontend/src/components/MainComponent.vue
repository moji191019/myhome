<template>
  <div id="wrap" class="wrap">
    <header-component></header-component>
    <visual-component></visual-component>
    <div class="main">main Content</div>
    <div class="footer">footer</div>
  </div>
</template>

<script>
import HeaderComponent from '@/components/header/headerComponent';
import VisualComponent from '@/components/visual/visualComponent';

export default {
  name: 'mainComponent',
  components: { HeaderComponent, VisualComponent },
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
