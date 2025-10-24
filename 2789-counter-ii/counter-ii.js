/**
 * @param {integer} init
 * @return { increment: Function, decrement: Function, reset: Function }
 */
var createCounter = function(init) {
    let cache=init
    return {
        increment:function(){
            return ++init
        },
        reset:function(){
            init=cache
            return cache
        },
        decrement:function(){
            return --init
        }
    }
};

/**
 * const counter = createCounter(5)
 * counter.increment(); // 6
 * counter.reset(); // 5
 * counter.decrement(); // 4
 */