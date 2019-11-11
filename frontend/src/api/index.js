import axios from 'axios'

//1. HTTP Request & Response 관련된 기본 설정
const config ={
baseUrl: 'http://localhost:8080/'
}
//2. API 함수들을 정리
function fetchNewsList(){
  return axios.get(`${config.baseUrl}test2`)
}
function fetchJobsList(){
  return axios.get(`${config.baseUrl}jobs/1.json`)
}
function fetchAskList(){
  return axios.get(`${config.baseUrl}ask/1.json`)
}
export {
  fetchNewsList,
  fetchJobsList,
  fetchAskList,
  // fetchUserInfo,
  // fetchAskDetail,
}
