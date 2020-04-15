<template>
  <div>
    <div class="visual">
      <img src="~@/assets/images/happyHouse.png" class="visual_img" alt="비주얼 이미지"><img/>
    </div>
    <div class="searchBox_back"></div>
    <div class="searchBox">
      <form action="#" name="searchForm" class="searchForm">
        <input type="text" name="keyword" placeholder="관심지역 또는 매물번호를 입력해 주세요">
        <input type="submit" value="매물검색">
      </form>
    </div>
  </div>
</template>

<script>

export default {
  name: 'visualComponent',
};
</script>

<style scoped>
</style>
