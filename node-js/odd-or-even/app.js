
const chalk = require("chalk");

function checkOddOrEven(num) {
  if (num % 2 == 0) {
    return chalk.bgGreen.white(`${num} is even`);
  } else {
    return chalk.bgRed.white(`${num} is odd`);
  }
}

console.log(checkOddOrEven(2))
console.log(checkOddOrEven(3))
console.log(checkOddOrEven(4))
console.log(checkOddOrEven(5))
