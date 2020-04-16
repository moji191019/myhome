/* eslint-disable eqeqeq */
<template>
  <div style="position: relative;">
    <div class="visual">
      <img src="@/assets/images/happyHouse.png" class="visual_img" :alt="imageText">
    </div>
    <div class="searchBox_layer">
      <div class="searchBox_bg">
          <div class="searchBox">
              <div class="searchBox_inputGroup">
                <div style="padding: 10px;">
                  <img src="@/assets/images/searchIcon.png" :alt="altText">
                </div>
                <input type="text" autocomplete="off" :placeholder="placeHolderText" ref="keyword" @keyup="handleKeyUp($event)">
                <button class="btn" @click="handleClick($event)">{{ searchText }}</button>
              </div>
          </div>
      </div>
    </div>
  </div>
</template>

<script>
import axios from 'axios';

export default {
  name: 'visualComponent',

  computed: {

  },

  methods: {
    handleKeyUp(e) {
      console.log('keyup event: ', e);
      return this.$refs.keyword.value;
    },
    handleClick(e) {
      console.log('submit event: ', e, this);
      const k1 = this.$refs.keyword.value;
      const k2 = e.target.previousSibling.previousElementSibling.value;
      console.log(k1, k2, k1 === k2); // 같음
      // axios.post(url[, data[, config]]);
      axios.post('/member/find', {
        keyword: this.$refs.keyword.value,
      })
        .then((res) => {
          console.log('res: ', res);
        })
        .catch((rej) => {
          console.error('rej: ', rej);
        });
    },
  },

  data() {
    return {
      placeHolderText: '관심지역 또는 매물번호를 입력해 주세요',
      altText: '찾기 이미지',
      searchText: '매물 검색',
      imageText: '비주얼 이미지',
    };
  },
};
</script>

<style scoped>

</style>
