const globalContext = {
  data() {
    return {
      loginPop: false,
    };
  },
  created() {
    console.log('mixins globalContext created');
  },
};

export default globalContext;
