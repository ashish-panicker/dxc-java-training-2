let userScore = 0;
let computerScore = 0;

const userScoreSpan = document.getElementById("user-score");
const compuertScoreSpan = document.getElementById("computer-score");
const scoreBoardDiv = document.querySelector(".score-board");
const resultDiv = document.querySelector(".result");
const rockDiv = document.getElementById("r");
const paperDiv = document.getElementById("p");
const scissorsDiv = document.getElementById("s");

const getComputerChoice = () => {
  const choices = ["r", "p", "s"];
  let choice = Math.floor(Math.random() * choices.length);
  console.log(choices[choice]);
  return choices[choice];
};

const convertToText = (letter) => {
  switch (letter) {
    case "r":
      return "Rock";
    case "s":
      return "Scissors";
    default:
      return "Paper";
  }
};

const smallUser = "user".fontsize(3).sub();
const smallComputer = "comp".fontsize(3).sub();

const userWin = (userChoice, computerChoice) => {
  const userChoiceDiv = document.getElementById(userChoice);
  userScore++;
  userScoreSpan.textContent = userScore;
  resultDiv.innerHTML = `${convertToText(
    userChoice
  )} ${smallUser} beats ${convertToText(
    computerChoice
  )}${smallComputer}.You Win!`;
  userChoiceDiv.classList.add("green-glow");
  setTimeout(() => userChoiceDiv.classList.remove("green-glow"), 400);
};

const computerWin = (userChoice, computerChoice) => {
  const userChoiceDiv = document.getElementById(userChoice);
  computerScore++;
  compuertScoreSpan.textContent = computerScore;
  resultDiv.innerHTML = `${convertToText(
    computerChoice
  )}${smallComputer} beats ${convertToText(userChoice)}${smallUser}`;
  userChoiceDiv.classList.add("red-glow");
  setTimeout(() => userChoiceDiv.classList.remove("red-glow"), 400);
};

const draw = (userChoice, computerChoice) => {
  const userChoiceDiv = document.getElementById(userChoice);
  resultDiv.innerHTML = `${convertToText(
    userChoice
  )}${smallUser} same as ${convertToText(computerChoice)}${smallComputer}`;
  userChoiceDiv.classList.add("grey-glow");
  setTimeout(() => userChoiceDiv.classList.remove("grey-glow"), 400);
};

const game = (userChoice) => {
  let computerChoice = getComputerChoice();
  switch (userChoice + computerChoice) {
    case "rs":
    case "pr":
    case "sp":
      userWin(userChoice, computerChoice);
      break;
    case "rp":
    case "ps":
    case "sr":
      computerWin(userChoice, computerChoice);
      break;
    case "rr":
    case "pp":
    case "ss":
      draw(userChoice, computerChoice);
      break;
  }
};

const main = () => {
  rockDiv.addEventListener("click", () => {
    game("r");
  });
  paperDiv.addEventListener("click", () => {
    game("p");
  });
  scissorsDiv.addEventListener("click", () => {
    game("s");
  });
};

main();
