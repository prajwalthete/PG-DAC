window.addEventListener("load", () => {
  loadMessages();
  loadEmojis();
});

async function addMessageToServer(reply) {
  let textRef = document.querySelector("#textId1");

  let url = `http://localhost:3000/message`;
  let data = {
    message: textRef.value,
    reply: reply ? 1 : 0,
  };

  await axios.post(url, data);
  textRef.value = "";

  // reload the messages
  loadMessages();
}

function handleEnterCode(event) {
  if (event.keyCode == 13) {
    addMessageToServer();
  }
}

async function loadMessages() {
  let url = `http://localhost:3000/messages`;
  let response = await axios.get(url);

  let parent = document.querySelector("#parent");
  for (let item of response.data) {
    let messageTimeStr = item.messageTime;
    let messageTime = new Date(messageTimeStr);
    let hour = messageTime.getHours();
    let minute = messageTime.getMinutes();

    let dclass = item.reply ? "justify-content-end" : "justify-content-start";

    let newElement = `<div class="d-flex ${dclass}">
                        <div class="d-flex justify-content-between align-items-center my-1">
                          <div class="badge text-bg-secondary fs-5">
                            ${item.message}
                            <span class="ms-4" style="font-size: 10px">${hour}:${minute} pm</span>
                          </div>
                        </div>
                      </div>
                      `;
    parent.innerHTML = newElement + parent.innerHTML;
  }
  console.log(response);
}

function loadEmojis() {
  let ref = document.querySelector("#emojiId1");

  for (let i = 0; i < 75; i++) {
    let counter = 12 + i;
    let newElement = `<span onclick="addEmoji(this)" class="fs-1" data-value="1285${counter}">&#1285${counter};</span>`;
    ref.innerHTML += newElement;
  }
}

function addEmoji(currentRef) {
  let emojicode = `&#${currentRef.dataset.value};`;
  let textRef = document.querySelector("#textId1");
  textRef.value = emojicode;
  addMessageToServer(false);

  let collapseRef = document.querySelector("#collapseExample");
  collapseRef.classList.remove("show");
  collapseRef.classList.add("hide");
}