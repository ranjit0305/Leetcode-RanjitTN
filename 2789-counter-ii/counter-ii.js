/**
 * @param {integer} init
 * @return { increment: Function, decrement: Function, reset: Function }
 */
var createCounter = function (init) {
  let val = init;

  return {
    increment: function () {
      val += 1;
      return val;
    },
    reset: function () {
      val = init;
      return val;/**
 * @param {integer} init
 * @return { increment: Function, decrement: Function, reset: Function }
 */
var createCounter = function(init) {
    let num = init;


    return {
        increment: () => {
            num++;
            return num;
        },
        reset: () => {
            num = init;
            return num;
        },
        decrement: () => {
            num--;
            return num;
        }
    }    
};

/**
 * const counter = createCounter(5)
 * counter.increment(); // 6
 * counter.reset(); // 5
 * counter.decrement(); // 4
 */
    },
    decrement: function () {
      val -= 1;
      return val;
    },
  };
};

/**
 * const counter = createCounter(5)
 * counter.increment(); // 6
 * counter.reset(); // 5
 * counter.decrement(); // 4
 */