<template>
  <div style="position: relative;">
    <div class="visual">
      <img src="~@/assets/images/happyHouse.png" class="visual_img" alt="비주얼 이미지"><img/>
    </div>
    <div class="searchBox_layer">
      <div class="searchBox_bg">
          <div class="searchBox">
            <form action="#" class="searchForm" ref="searchForm">
              <div class="searchBox_inputGroup">
                <input type="text" autocomplete="off" placeholder="관심지역 또는 매물번호를 입력해 주세요" ref="keyword" v-on:keyup="getKeyword">
                <!-- <input type="submit" value="매물검색"> -->
                <span class="btn" v-on:click="submit">매물 검색</span>
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
  methods: {
    getKeyword() {
      console.log(event, this.$refs.keyword.value);
      return this.$refs.keyword.value;
    },
    submit(event) {
      console.log('submit event: ', event, this);
      this.$refs.searchForm.submit();
    },
  },
};
</script>

<style lang="scss">

</style>
