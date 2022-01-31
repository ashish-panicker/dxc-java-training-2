console.log("script loaded.....");

let options = ["r", "p", "s"];
let userWins = 0
let systemWins = 0

const rockButton = document.getElementById("rock")
const paperButton = document.getElementById("paper")
const scissorsButton = document.getElementById("scissors")
const messagePara = document.getElementById("message")
const userWin = document.getElementById("user-win")
const systemWin = document.getElementById("system-win")

function getComputerChoice() {
  let randomNumber = Math.floor(Math.random() * 3);
  return options[randomNumber];
}

function scoreboard() {
  userWin.innerHTML = userWins
  systemWin.innerHTML = systemWins
}

scoreboard()

rockButton.addEventListener("click", function () {
  playGame("r", getComputerChoice());
});

paperButton.addEventListener("click", function () {
  playGame("p", getComputerChoice());
});

scissorsButton.addEventListener("click", function () {
  playGame("s", getComputerChoice());
});

function playGame(userChoice, systemChoice) {
  let res = userChoice + systemChoice;
  switch (res) {
    case "rs":
    case "pr":
    case "sp":
      console.log("You win!");
      messagePara.innerText = "You win!";
      userWins++;
      scoreboard()
      break;
    case "rp":
    case "ps":
    case "sr":
      console.log("You lose!");
      messagePara.innerText = "You lose!";
      systemWins++;
      scoreboard()
      break;
    case "rr":
    case "pp":
    case "ss":
      console.log("Draw!");
      messagePara.innerText = "Oppsie!!!! Draw!";
      break;
  }
}
