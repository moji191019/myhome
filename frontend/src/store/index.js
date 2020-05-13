import Vue from 'vue';
import Vuex from 'vuex';
import mutations from './mutations';
import actions from './actions';

Vue.use(Vuex);

// eslint-disable-next-line import/prefer-default-export
export const store = new Vuex.Store({
  state: {
    news: [],
    jobs: [],
    ask: [],
    list: [],
  },
  getters: {
    FetchedAsk(state) {
      return state.ask;
    },
    FetchedList(state) {
      return state.list;
    },
  },
  mutations,
  actions,
});
