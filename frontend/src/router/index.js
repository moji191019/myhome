import Vue from 'vue';
import Router from 'vue-router';
import HelloWorld from '@/components/HelloWorld';
import testComp from '@/components/TestComp';

Vue.use(Router);

export default new Router({
  routes: [
    {
      path: '/',
      name: 'Home',
      component: HelloWorld,
    }, {
      path: '/testComp',
      name: 'testComp',
      component: testComp,
    },
  ],
});
