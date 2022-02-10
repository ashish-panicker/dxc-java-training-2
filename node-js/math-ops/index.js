const { add, divide, multiply, subtract } = require("./operations");
const minmist = require("minimist");
const ProgressBar = require("progress");
const https = require("https");

// import { add, divide, multiply, subtract } from './operations'

// console.log(add(1, 2));
// console.log(subtract(1, 2));
// console.log(multiply(1, 2));
// console.log(divide(1, 2));

const arguments = process.argv.slice(2);
let modifiedArgs = minmist(arguments);

// arguments.forEach(function (item, value) {
//   console.log(item, value);
// });

console.log(modifiedArgs["type"]);
console.log(modifiedArgs["db"].host);

// const pogressBar = new ProgressBar("[:bar]", { total: 100 });
// const timer = setInterval(function () {
//   pogressBar.tick();
//   if (pogressBar.complete) {
//     clearInterval(timer);
//   }
// }, 100);

var req = https.request({
  host: "download.github.com",
  port: 443,
  path: "/visionmedia-node-jscoverage-0d4608a.zip",
});

req.on("response", function (res) {
  var len = parseInt(res.headers["content-length"], 10);

  console.log();
  var bar = new ProgressBar("  downloading [:bar] :rate/bps :percent :etas", {
    complete: "=",
    incomplete: " ",
    width: 20,
    total: len,
  });

  res.on("data", function (chunk) {
    bar.tick(chunk.length);
  });

  res.on("end", function () {
    console.log("\n");
  });
});

req.end();
