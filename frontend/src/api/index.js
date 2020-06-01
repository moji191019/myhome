import axios from 'axios';

// 1. HTTP Request & Response 관련된 기본 설정
// const config = {
//   baseUrl: 'http://localhost:3000/',
// };
// 2. API 함수들을 정리
export default {
  fetchNewsList() {
    return axios.get('/service/home/test2');
  },
  // fetchUserInfo,
  // fetchAskDetail,
  fetchMemberList(keyword) {
    return axios.post('/service/apart/find', { keyword });
  },
};
