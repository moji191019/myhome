/* eslint-disable eqeqeq */
<template>
  <div style="position: relative;">
    <div class="visual">
      <p class="visual_title">
        <span>어떤 동네, 어떤 방</span>에서
      </p>
      <p class="visual_title">살고 싶으신가요?</p>
      <div class="searchBox">
        <div class="searchBox_inputGroup">
          <svg width="18" height="18" viewBox="0 0 18 18">
            <g fill="none" fill-rule="evenodd" stroke="#222">
              <circle cx="7.5" cy="7.5" r="6.5"></circle>
              <path d="M12 12l5 5"></path>
            </g>
          </svg>
          <input id="visual_keyword" type="text" autocomplete="off" @input="handleInput" >
          <button id="visual_btn" class="btn" @click="handleClick($event)">{{ searchText }}</button>
        </div>
        <div class="searchBox_searchList">
          <template v-if="isSearch">
            <ul class="aptList">
              <li v-for="(apt, aptIdx) in getAptList" :key="aptIdx">
                <a> {{ apt.adres_city }} {{ apt.adres_gu }} {{ apt.adres_doro }} ({{ apt.adres_dong }})</a>
              </li>
            </ul>
          </template>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import axios from 'axios';
import com from '../../assets/common/common';

export default {
  name: 'visualComponent',

  computed: {
    getAptList() {
      return this.$data.aptList;
    },
  },
  watch: {
  },

  methods: {
    handleInput: com.throttleAndDebounce().debounce(function sendKey() {
      const data = document.querySelector('[id="visual_keyword"]').value;
      axios.post('/service/member/find', {
        data,
      }).then((res) => {
        console.log('res: ', res);
      }).catch(() => {
        this.isSearch = true;
      });
    }, 500),

    handleClick(e) {
      console.log('submit event: ', e, this);
      // const keyword = this.$refs.keyword.value;
      // const keyword2 = e.target.previousSibling.previousElementSibling.value;
      // console.log(keyword, keyword2, keyword === keyword2); // 같음
      // this.search(keyword);
    },

    getAptList2() {
      return this.$data.aptList;
    },
  },

  data() {
    return {
      isSearch: false,
      altText: '찾기 이미지',
      searchText: '방 찾기',
      imageText: '비주얼 이미지',
      kk: '',
      aptList: [
        { dorojuso: '서울특별시 강남구 삼성로 11', apt_nm: '디에이치 아너힐즈', adres_city: '서울', adres_gu: '강남구', adres_dong: '개포동', adres_doro: '삼성로', kaptaddr: '서울특별시 강남구 개포동 138 디에이치 아너힐즈' },
        { dorojuso: '서울특별시 성북구 한천로 713', apt_nm: '래미안퍼스트하이', adres_city: '서울', adres_gu: '성북구', adres_dong: '장위동', adres_doro: '한천로', kaptaddr: '서울특별시 성북구 장위동 173-114 래미안퍼스트하이' },
        { dorojuso: '서울특별시 강동구 고덕로 333', apt_nm: '고덕 그라시움 아파트', adres_city: '서울', adres_gu: '강동구', adres_dong: '고덕동', adres_doro: '고덕로', kaptaddr: '서울특별시 강동구 고덕동 212 고덕 그라시움 아파트' },
        { dorojuso: '서울특별시 성북구 돌곶이로8길 22', apt_nm: '래미안아트리치 ', adres_city: '서울', adres_gu: '성북구', adres_dong: '석관동', adres_doro: '돌곶이로8길', kaptaddr: '서울특별시 성북구 석관동 410 래미안아트리치 ' },
        { dorojuso: '서울특별시 구로구 항동로 72', apt_nm: '항동하버라인4단지아파트', adres_city: '서울', adres_gu: '구로구', adres_dong: '항동', adres_doro: '항동로', kaptaddr: '서울특별시 구로구 항동 238 항동하버라인4단지아파트' },
        { dorojuso: '서울특별시 은평구 응암로30길 16', apt_nm: '백련산 sk뷰 아이파크', adres_city: '서울', adres_gu: '은평구', adres_dong: '응암동', adres_doro: '응암로30길', kaptaddr: '서울특별시 은평구 응암동 767 백련산 sk뷰 아이파크' },
        { dorojuso: '서울특별시 구로구 연동로 234', apt_nm: '항동하버라인2단지', adres_city: '서울', adres_gu: '구로구', adres_dong: '항동', adres_doro: '연동로', kaptaddr: '서울특별시 구로구 항동  항동하버라인2단지' },
        { dorojuso: '서울특별시 동대문구 휘경로 60', apt_nm: '휘경동 sk뷰 아파트', adres_city: '서울', adres_gu: '동대문구', adres_dong: '휘경동', adres_doro: '휘경로', kaptaddr: '서울특별시 동대문구 휘경동 128-12 휘경동 sk뷰 아파트' },
        { dorojuso: '서울특별시 서초구 잠원로14길 32', apt_nm: '래미안 신반포 리오센트', adres_city: '서울', adres_gu: '서초구', adres_dong: '잠원동', adres_doro: '잠원로14길', kaptaddr: '서울특별시 서초구 잠원동 161 래미안 신반포 리오센트' },
      ],
    };
  },
};
</script>

<style scoped>

</style>
