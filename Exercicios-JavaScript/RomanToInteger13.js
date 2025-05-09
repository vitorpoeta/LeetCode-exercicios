/**
 * @param {string} s
 * @return {number}
 */
var romanToInt = function(s) {
    const romano = {
        'I': 1,
        'V': 5,
        'X': 10,
        'L': 50,
        'C': 100,
        'D': 500,
        'M': 1000
    }

    let result = 0;

    for (let i = 0; i < s.length; i++) {
        const cur = romano[s[i]];
        const next = romano[s[i + 1]];

        if (cur < next) {
            result += next - cur;
            i++;
        } else {
            result += cur;
        }
    }
    // Outra solução que vi e achei interessante, parece mais simples
    // let value = 0;

    // for (let i = 0; i < s.length; i++) {
    //     let current = roman[s[i]];
    //     let next = roman[s[i + 1]];

    //     if (next > current) {
    //         value -= current;
    //     } else {
    //         value += current;
    //     }
    // }
    return result;
};