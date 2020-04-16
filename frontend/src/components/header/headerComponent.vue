<template>
  <div style="margin: 0; padding: 0;">
    <div class="header">
      <a>
        <img src="~@/assets/images/logo.png" class="header_log" alt="로고"><img/>
      </a>
      <div>
        <ul class="header_mainmenu">
          <li v-for="(menu, menuIdx) in getMenuList" :key="menuIdx">
            <a>{{ menu.name }}</a>
              <template v-if="menu.children">
                  <ul class="header_submenu">
                    <li v-for="(submenu, name, submenuIdx) in menu.children"
                        :key="submenuIdx">
                        <a :title="name"> {{submenu.name}} </a>
                    </li>
                  </ul>
              </template>
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
    getMenuList() {
      return this.$data.navList;
    },
  },

  methods: {

  },

  data() {
    return {
      isOpen: false,
      active: false,
      navList: [
        { url: '#', name: 'About Us' },
        {
          url: '#',
          name: 'Story',
          children: [
            {
              url: 'https://twitter.com/andrejsharapov',
              name: 'Twitter',
              target: '_blank',
            },
            {
              url: 'https://dribbble.com/andrejsharapov',
              name: 'Dribbble',
              target: '_blank',
            },
            {
              url: 'https://www.behance.net/andrejsharapov',
              name: 'Behance',
              target: '_blank',
            },
            {
              url: 'https://www.instagram.com/andrej.sharapov/',
              name: 'Instagram',
              target: '_blank',
            },
          ],
        },
        { url: '#', name: 'Price' },
        {
          url: '#',
          name: 'Services',
          children: [
            {
              url: 'https://twitter.com/andrejsharapov',
              name: 'Twitter',
              target: '_blank',
            },
            {
              url: 'https://dribbble.com/andrejsharapov',
              name: 'Dribbble',
              target: '_blank',
            },
            {
              url: 'https://www.behance.net/andrejsharapov',
              name: 'Behance',
              target: '_blank',
            },
            {
              url: 'https://www.instagram.com/andrej.sharapov/',
              name: 'Instagram',
              target: '_blank',
            },
          ],
        },
        { url: '#', name: 'Testimonials' },
        { url: '#', name: 'Contact Us' },
      ],
    };
  },
};
</script>

<style scoped>

</style>
