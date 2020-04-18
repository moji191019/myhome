import index from '../api/index';

export default {
  FETCH_NEWS(context) {
    index.fetchNewsList()
      .then(response => context.commit('SET_NEWS', response.data))
      .catch(error => console.log(error));
  },
};
