const globalContext = {
  data() {
    return {
      toggleStatus: false,
    };
  },
  created() {
    console.log('mixins globalContext created');
  },
};

export default globalContext;
