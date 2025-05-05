/**
 * @param {number[]} nums
 * @return {number[]}
 */
var getConcatenation = function(nums) {
    let n = nums.length;
    for(let i=0;i<n;i++){
        nums[i + n] = nums[i];
    }
    return nums;
};

console.log(getConcatenation([1,2,1]));