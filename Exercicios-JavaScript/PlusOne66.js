/**
 * @param {number[]} digits
 * @return {number[]}
 */
var plusOne = function (digits) {
  // Meus comentários, para facilitar meu entendimento:
  // Irá percorrer o loop de trás para frente, se for diferente de 9 (o último número), só adiciona mais um
  // caso seja nove, irá setar de 9, para 0, sair do loop e será realizado o unshift, adicionando na
  // primeira posição o número 1, se for 9, 3 , 9, por exemplo, ele vai verificar o nove, passar pra zero depois
  // passar para o próximo número, afinal ainda está percorrendo o loop, depois o próximo é 3, ou seja é adiciona mais um e retornado
  for (let i = digits.length - 1; i >= 0; i--) {
    if (digits[i] !== 9) {
      digits[i]++;
      return digits;
    } else {
      digits[i] = 0;
    }
  }
  digits.unshift(1);
  return digits;
};

// Testes com console.log
console.log(plusOne([1, 2, 3])); // Esperado: [1, 2, 4]
console.log(plusOne([4, 3, 2, 1])); // Esperado: [4, 3, 2, 2]
console.log(plusOne([9])); // Esperado: [1, 0]
console.log(plusOne([9, 9, 9])); // Esperado: [1, 0, 0, 0]
console.log(plusOne([9, 2, 9])); // Esperado: [9, 3, 0]
