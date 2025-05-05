/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isAnagram = function(s, t) {
    if (s.length != t.length) {
        return false;
    }
    let a = s.split("").sort();
    let b = t.split("").sort();
    if(a.toString() === b.toString()){
        return true;
    }
    return false;
};
console.log(isAnagram("anagram", "nagaram"));
console.log(isAnagram("rat","car"));