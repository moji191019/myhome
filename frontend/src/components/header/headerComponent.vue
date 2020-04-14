<template>
  <div style="margin: 0; padding: 0;">
    <div class="header">
      <a>
        <img src="~@/assets/images/logo.png" class="header_log" alt="로고"><img/>
      </a>
      <div class="container">
        <ul class="myMenu">
          <li class="menu1">
              <a> Home </a>
                <ul class="menu1_s submenu">
                  <li v-for="(item, idx) in childMenu" :key="'a' + idx">
                    <a> {{item.text}} </a>
                  </li>
                </ul>
          </li>
        </ul>
        <ul>
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
