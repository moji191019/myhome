<template>
  <div style="position: relative;">
    <div class="visual">
      <img src="@/assets/images/happyHouse.png" class="visual_img" :alt="imageText"><img/>
    </div>
    <div class="searchBox_layer">
      <div class="searchBox_bg">
          <div class="searchBox">
            <form action="#" class="searchForm" ref="searchForm">
              <div class="searchBox_inputGroup">
                <div>
                  <img src="@/assets/images/searchIcon.png" :alt="altText">
                </div>
                <input type="text" autocomplete="off" :placeholder="placeHolderText" ref="keyword" @keyup="handleKeyUp">
                <button class="btn">{{ SearchText }}</button>
              </div>
            </form>
          </div>
      </div>
    </div>
  </div>
</template>

<script>

export default {
  name: 'visualComponent',

  computed: {

  },

  methods: {
    handleKeyUp() {
      return this.$refs.keyword.value;
    },
    handleClick(event) {
      console.log('submit event: ', event, this);
      this.$refs.searchForm.submit();
    },
  },

  data() {
    return {
      placeHolderText: '관심지역 또는 매물번호를 입력해 주세요',
      altText: '찾기 이미지',
      SearchText: '매물 검색',
      imageText: '비주얼 이미지',
    };
  },
};
</script>

<style scoped>

</style>
