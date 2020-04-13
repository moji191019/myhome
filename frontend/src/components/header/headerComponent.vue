<template>
  <div>
    <div class="header">
      <a>
        <img src="~@/assets/images/logo.png" class="log" alt="로고"><img/>
      </a>
      <div class="menu">
        <ul>
          <li v-for="(item, idx) in childMenu" :key="'a' + idx">
            <a> {{item.text}} </a>
          </li>
        </ul>
      </div>
    </div>
  </div>
</template>

<script>

export default {
  name: 'headerComponent',

  computed: {
    childMenu() {
      console.log('childMenu');
      const menuArr = [];

      for (let i = 0; i < 3; i += 1) {
        menuArr.push({ text: `aaa${i}` });
      }
      console.log('menuArr', menuArr);
      return menuArr;
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

</style>
