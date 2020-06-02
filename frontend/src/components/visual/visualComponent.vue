<template>
  <div style="position: relative;">
    <div class="visual">
      <p class="visual_title">
        <span>어떤 동네, 어떤 방</span>에서
      </p>
      <p class="visual_title">살고 싶으신가요?</p>
      <div class="searchBox">
        <div class="searchBox_inputGroup">
          <!-- 돋보기 이미지를 svg로 그림. 이미지로 대체해도 될 듯함. -->
          <svg>
            <g>
              <circle></circle>
              <path></path>
            </g>
          </svg>
          <input id="visual_keyword" type="text" autocomplete="off" @input="handleInput" @focus="handleFocus" @blur="handleBlur">
          <button id="visual_btn" class="btn" @click="handleClick($event)">{{ searchText }}</button>
        </div>
        <div class="searchBox_searchList">
          <template v-if="isFocus">
            <div class="autoCompleteWrap">
              <template v-if="isSearch">
                <div class="autoCompleteContent">
                  <div class="autoCompleteContentHeader">
                    <img src="" alt="지역,지하철,대학교 아이콘">
                    <span style="vertical-align: middle;">지역, 지하철, 대학교</span>
                  </div>
                  <ul class="listWrap">
                    <li class="list" v-for="(apt, aptIdx) in getAptList" :key="aptIdx">
                      <p>{{ apt.adres_city }} {{ apt.adres_gu }} {{ apt.adres_dong }}</p>
                    </li>
                  </ul>
                </div>
                <div class="autoCompleteContent">
                  <div class="autoCompleteContentHeader">
                    <img src="" alt="오피스텔 아이콘">
                    <span style="vertical-align: middle;">오피스텔</span>
                  </div>
                  <ul class="listWrap">
                    <li class="list" v-for="(apt, aptIdx) in getAptList" :key="aptIdx">
                      <p>{{ apt.apt_nm }}</p>
                      <p>{{ apt.adres_city }} {{ apt.adres_gu }} {{ apt.adres_dong }}</p>
                    </li>
                  </ul>
                </div>
                <div class="autoCompleteContent">
                  <div class="autoCompleteContentHeader">
                    <img src="" alt="아파트 아이콘">
                    <span style="vertical-align: middle;">아파트</span>
                  </div>
                  <ul class="listWrap">
                    <li class="list" v-for="(apt, aptIdx) in getAptList" :key="aptIdx">
                      <p>{{ apt.apt_nm }}</p>
                      <p>{{ apt.adres_city }} {{ apt.adres_gu }} {{ apt.adres_dong }}</p>
                      <!-- <a> {{ apt.key1 }} {{ apt.key2 }} {{ apt.key3 }} ({{ apt.key4 }})</a> -->
                      <!-- <a> {{ apt.adres_city }} {{ apt.adres_gu }} {{ apt.adres_doro }} ({{ apt.adres_dong }})</a> -->
                    </li>
                  </ul>
                </div>
              </template>
              <template v-if="!isSearch">
                <div style="padding: 30px 50px;">
                  <div class="popularKeyword">
                    <h1>인기검색</h1>
                    <p>
                      <span class="keyword">판교동 원룸,</span>
                      <span class="keyword">잠실동 오피스텔,</span>
                      <span class="keyword">신사역 오피스텔</span>
                    </p>
                  </div>
                  <div class="recentKeyword">
                    <h1>최근 검색 기록</h1>
                    <ul class="recentKeywordList">
                      <li>
                        <div>이미지</div>
                        <div>검색어</div>
                        <div>지하철 호선</div>
                      </li>
                    </ul>
                  </div>
                </div>
              </template>
            </div>
          </template>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import com from '../../assets/common/common';

export default {
  name: 'visualComponent',

  computed: {
    getAptList() {
      return this.$store.getters.FetchedList;
    },
  },
  watch: {
  },

  methods: {
    handleInput: com.throttleAndDebounce().debounce(function sendKey() {
      const data = document.querySelector('[id="visual_keyword"]').value;
      // 여기선 왜 this.$store가 없을까요? -> 화살표함수를 쓰면 this를 못 쓰네요.
      this.$store.dispatch('FETCH_LIST', data)
        .then((res) => {
          console.log('fetch_list: ', res, this.$store.getters.FetchedList);
          this.isSearch = true;
          this.$data.aptList = this.$store.getters.FetchedList;
          console.log('$data.aptList: ', this.$data.aptList, '$store.getters: ', this.$store.getters.FetchedList);
          return res;
        })
        .catch((error) => { this.isSearch = true; console.error('fetch_list error: ', error); });
      /* axios.post('/service/member/find', {
        data,
      }).then((res) => {
        console.log('res: ', res, this);
        // this.getAptList2(data);
      }).catch(() => {
        this.isSearch = true;
      }); */
    }, 500),

    handleFocus(e) {
      const s = e.target.parentElement.parentElement;
      // console.log(s);
      this.isFocus = true;
      document.getElementsByTagName('body')[0].scrollIntoView(true);
      s.classList.add('fff');
    },

    handleBlur(e) {
      const s = e.target.parentElement.parentElement;
      // console.log(s);
      this.isFocus = false;
      this.isSearch = false;
      s.classList.remove('fff');
      e.target.value = '';
    },

    handleClick(e) {
      console.log('submit event: ', e, this);
      // const keyword = this.$refs.keyword.value;
      // const keyword2 = e.target.previousSibling.previousElementSibling.value;
      // console.log(keyword, keyword2, keyword === keyword2); // 같음
      // this.search(keyword);
    },
    getAptList2(data) {
      this.$store.dispatch('FETCH_LIST', data)
        .then((res) => {
          console.log('fetch_list: ', res);
          return res;
        })
        .catch((error) => { this.isSearch = true; console.error('fetch_list error: ', error); });
    },
  },

  data() {
    return {
      isSearch: false,
      isFocus: false,
      altText: '찾기 이미지',
      searchText: '방 찾기',
      imageText: '비주얼 이미지',
      kk: '',
      aptList: [/*
        { dorojuso: '서울특별시 강남구 삼성로 11', apt_nm: '디에이치 아너힐즈', adres_city: '서울', adres_gu: '강남구', adres_dong: '개포동', adres_doro: '삼성로', kaptaddr: '서울특별시 강남구 개포동 138 디에이치 아너힐즈' },
        { dorojuso: '서울특별시 성북구 한천로 713', apt_nm: '래미안퍼스트하이', adres_city: '서울', adres_gu: '성북구', adres_dong: '장위동', adres_doro: '한천로', kaptaddr: '서울특별시 성북구 장위동 173-114 래미안퍼스트하이' },
        { dorojuso: '서울특별시 강동구 고덕로 333', apt_nm: '고덕 그라시움 아파트', adres_city: '서울', adres_gu: '강동구', adres_dong: '고덕동', adres_doro: '고덕로', kaptaddr: '서울특별시 강동구 고덕동 212 고덕 그라시움 아파트' },
        { dorojuso: '서울특별시 성북구 돌곶이로8길 22', apt_nm: '래미안아트리치 ', adres_city: '서울', adres_gu: '성북구', adres_dong: '석관동', adres_doro: '돌곶이로8길', kaptaddr: '서울특별시 성북구 석관동 410 래미안아트리치 ' },
        { dorojuso: '서울특별시 구로구 항동로 72', apt_nm: '항동하버라인4단지아파트', adres_city: '서울', adres_gu: '구로구', adres_dong: '항동', adres_doro: '항동로', kaptaddr: '서울특별시 구로구 항동 238 항동하버라인4단지아파트' },
        { dorojuso: '서울특별시 은평구 응암로30길 16', apt_nm: '백련산 sk뷰 아이파크', adres_city: '서울', adres_gu: '은평구', adres_dong: '응암동', adres_doro: '응암로30길', kaptaddr: '서울특별시 은평구 응암동 767 백련산 sk뷰 아이파크' },
        { dorojuso: '서울특별시 구로구 연동로 234', apt_nm: '항동하버라인2단지', adres_city: '서울', adres_gu: '구로구', adres_dong: '항동', adres_doro: '연동로', kaptaddr: '서울특별시 구로구 항동  항동하버라인2단지' },
        { dorojuso: '서울특별시 동대문구 휘경로 60', apt_nm: '휘경동 sk뷰 아파트', adres_city: '서울', adres_gu: '동대문구', adres_dong: '휘경동', adres_doro: '휘경로', kaptaddr: '서울특별시 동대문구 휘경동 128-12 휘경동 sk뷰 아파트' },
        { dorojuso: '서울특별시 서초구 잠원로14길 32', apt_nm: '래미안 신반포 리오센트', adres_city: '서울', adres_gu: '서초구', adres_dong: '잠원동', adres_doro: '잠원로14길', kaptaddr: '서울특별시 서초구 잠원동 161 래미안 신반포 리오센트' },
      */],
    };
  },
};
</script>

<style scoped>

</style>
