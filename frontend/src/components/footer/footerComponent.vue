<template>
    <div class="footer">
        <div class="footer_inner">
            <ul class="footer_corp_info">
                <li>
                  <div class="link_top">
                    <div class="link_info">
                      <a :href="link.ref" v-for="(link, linkIdx) in getLinkList.linkList" :key="linkIdx">{{ link.linkTxt }}</a>
                    </div>
                    <div class="top_move"></div>
                  </div>
                </li>
                <li>
                  <p> {{ conTxt }} </p>
                  <p> {{ copyRight }} </p>
                </li>
            </ul>
        </div>
    </div>
</template>

<script>

export default {
  name: 'footerComponent',

  computed: {
    getLinkList() {
      return {
        linkList: [
          { linkTxt: '회사소개', ref: '#' },
          { linkTxt: '이용약관', ref: '#' },
          { linkTxt: '개인정보처리방침', ref: '#' },
          { linkTxt: '매물관리규정', ref: '#' },
          { linkTxt: '자동저장서비스', ref: '#' },
        ],
      };
    },
  },

  methods: {

  },

  data() {
    return {
      conTxt: '(주)유니버스, 대표이사 : 홍길동, 사업자등록번호 : 214-86-00000, 통신판매업 신고번호 : 2020-강서-0509호, 대표전화 : 1588-0000, 팩스 : 02-0000-0000',
      copyRight: 'Copyright © UNIVERSE  Co.,Ltd. All rights reserved.',
    };
  },
};
</script>

<style lang="scss" scoped>
  // 특정 컴포넌트 사스 적용 방법..
  // @import '~@/assets/scss/footers.scss';
</style>
