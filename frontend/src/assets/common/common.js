const throttleAndDebounce = () => {
  let throttleCheck;
  let debounceCheck;

  return {
    throttle(callback, milliseconds) {
      return function () {
        if (!throttleCheck) {
          throttleCheck = setTimeout(() => {
            callback.apply(this, ...arguments);
            throttleCheck = false;
          }, milliseconds);
        }
      };
    },

    debounce(callback, milliseconds) {
      return function () {
        clearTimeout(debounceCheck);
        debounceCheck = setTimeout(() => {
          callback.apply(this, ...arguments);
        }, milliseconds);
      };
    },
  };
};

export default {
  throttleAndDebounce,
};
