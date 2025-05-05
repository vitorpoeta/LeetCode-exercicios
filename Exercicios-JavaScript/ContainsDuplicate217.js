/**
 * @param {number[]} nums
 * @return {boolean}
 */
var containsDuplicate = function (nums) {
  let resultado = new Set();
  for (let i = 0; i < nums.length; i++) {
    if (resultado.has(nums[i])) {
      return true;
    }
    resultado.add(nums[i]);
  }
  return false;
};
console.log(containsDuplicate([1, 2, 3, 1]));
console.log(containsDuplicate([1, 2, 3, 4]));
console.log(containsDuplicate([1, 1, 1, 3, 3, 4, 3, 2, 4, 2]));
