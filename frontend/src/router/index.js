import Vue from 'vue';
import Router from 'vue-router';
import MainComponent from '../components/MainComponent';
import TestComp from '../components/TestComp';

Vue.use(Router);

export default new Router({
  routes: [
    {
      path: '/',
      name: 'Main',
      component: MainComponent,
    }, {
      path: '/testComp',
      name: 'testComp',
      component: TestComp,
    },
  ],
});
