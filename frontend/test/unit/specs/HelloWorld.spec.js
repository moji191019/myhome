import Vue from 'vue';
import MainComponent from '@/components/MainComponent';

describe('MainComponent.vue', () => {
  it('should render correct contents', () => {
    const Constructor = Vue.extend(MainComponent);
    const vm = new Constructor().$mount();
    expect(vm.$el.querySelector('.hello h1').textContent)
      .to.equal('Welcome to Your Vue.js App');
  });
});
