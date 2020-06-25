<template>
  <div id="app">
    <router-view/>
  </div>
</template>

<script>
import globalContext from './assets/common/globalContext';

export default {
  name: 'App',
  mixins: [globalContext],
};
</script>
