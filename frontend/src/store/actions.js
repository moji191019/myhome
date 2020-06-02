import index from '../api/index';

export default {
  FETCH_NEWS(context) {
    index.fetchNewsList()
      .then(response => context.commit('SET_NEWS', response.data))
      .catch(error => console.log(error));
  },
  FETCH_LIST(context, payload) {
    index.fetchApartList(payload)
      .then(response => context.commit('SET_LIST', response.data))
      .catch(error => console.error(error));
  },
};
