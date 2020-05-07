<template>
<!-- 쉬운 방찾기 시작 -->
<div class="room_search">
<div class="room_search_title">
    <span>쉬운 방찾기</span>
    <p>방 찾기 초보를 위한 초간단 솔루션!</p>
</div>
<div class="room_slide">
    <div class="mask">
        <div class="list">
            <a :href="txtList.ref" v-for="(txtList, txtIdx) in getTextList" :key="txtIdx">
                <div class="product_box">
                    <div class="thumnail"></div>
                    <div class="cont">
                        <p>{{ txtList.conTxt01 }}</p>
                        <p>{{ txtList.conTxt02 }}</p>
                    </div>
                </div>
            </a>
        </div>
    </div>
    <button class="btn_moving">
        <svg width="10" height="16" viewBox="0 0 10 16">
            <path fill="none" fill-rule="evenodd" stroke="#666" d="M2 14l6-6-6-6"></path>
        </svg>
    </button>
</div>
<div class="room_page">
    <a href="javascript:void(null);" class="on">01</a>
    <a href="javascript:void(null);">02</a>
</div>
</div>
<!--// 쉬운 방찾기 끝 //-->
</template>

<script>

export default {
  name: 'containerComponent',

  computed: {
    getTextList() {
      return this.$data.txtList;
    },
  },

  methods: {

  },

  data() {
    return {
      txtList: [
        { conTxt01: '월세 + 관리비 ', conTxt02: ' 월 50 이하 원룸', ref: '#' },
        { conTxt01: '월세 + 관리비 ', conTxt02: ' 월 50 이하 원룸', ref: '#' },
        { conTxt01: '월세 + 관리비 ', conTxt02: ' 월 50 이하 원룸', ref: '#' },
        { conTxt01: '월세 + 관리비 ', conTxt02: ' 월 50 이하 원룸', ref: '#' },
        { conTxt01: '월세 + 관리비 ', conTxt02: ' 월 50 이하 원룸', ref: '#' },
        { conTxt01: '월세 + 관리비 ', conTxt02: ' 월 50 이하 원룸', ref: '#' },
        { conTxt01: '월세 + 관리비 ', conTxt02: ' 월 50 이하 원룸', ref: '#' },
        { conTxt01: '월세 + 관리비 ', conTxt02: ' 월 50 이하 원룸', ref: '#' },
      ],
    };
  },
};
</script>

<style scoped>

</style>
