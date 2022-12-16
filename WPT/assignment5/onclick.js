function changeColor(p1color) {
  let h1ref = document.querySelector("#id1");
  h1ref.style.color = p1color;
}
function changeFontSize() {
  let h1ref = document.querySelector("h1");
  h1ref.style.fontSize = "64px";
}
function reset() {
  let h1ref = document.querySelector("h1");
  h1ref.style.color = "inherit";
  h1ref.style.fontSize = "32px";
}
