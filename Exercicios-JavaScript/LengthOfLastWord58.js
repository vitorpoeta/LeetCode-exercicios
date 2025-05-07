/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLastWord = function (s) {
  let x = s
    .trim()
    .split(" ")
    .filter((word) => word.length > 0);
  let ultimaPos = x[x.length - 1];
  return ultimaPos.length;
};
