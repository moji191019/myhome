<template>
    <div class="footer">
        <div class="footer_inner">
            <ul class="corp_info">
                <li>
                    <span v-for="(item, idx) in childText" :key="'a' + idx"> {{item.text}} </span>
                </li>
            </ul>
        </div>
    </div>
</template>

<script>

export default {
  name: 'footerComponent',

  computed: {
    childText() {
      const contArr = [];
      const conTxt = '(주)유니버스, 대표이사 : 홍길동, 사업자등록번호 : 214-86-00000, 통신판매업 신고번호 : 2020-강서-0509호, 대표전화 : 1588-0000, 팩스 : 02-0000-0000';
      const copyRight = 'Copyright © UNIVERSE  Co.,Ltd. All rights reserved.';
      contArr.push({ text: conTxt }, { text: copyRight });
      return contArr;
    },
  },

  methods: {

  },

  data() {
    return {
    };
  },
};
</script>

<style scoped>
ul{list-style:none}
.footer {padding: 18px 0;border-top:1px solid #e5e5e5;background:#fff;}
.footer_inner{max-width:980px; margin:0 auto;padding: 0 10px;box-sizing: border-box;}
.footer_inner:after{clear:both;content:'';display:block}
.corp_info {padding: 0; text-align:right}
.corp_info li {margin: 0 0 5px;}
.corp_info li span {padding: 0 0 0 20px;letter-spacing:-0.5px;font-size: 0.85em;color:#bbb;}
.corp_info li.copy {margin: 20px 0 0 0;}
.corp_info li.copy span {font-family:'Arial',sans-serif}
</style>
