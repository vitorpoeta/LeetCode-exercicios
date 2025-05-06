/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function (x) {
  let y = x;
  if (y.toString().split("").reverse().join("") === x.toString()) {
    return true;
  }
  return false;
};

console.log(isPalindrome(10));
console.log(isPalindrome(121));
console.log(isPalindrome(-121));
