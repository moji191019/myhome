// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue';
import App from './App';
import router from './router';
import { store } from './store/index';
import globalContext from './assets/common/globalContext';

Vue.config.productionTip = false;
// Vue.mixin(globalContext);

/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  store,
  mixins: [globalContext],
  components: { App },
  template: '<App/>',
});
