async function getAllMessages() {
  let url = `http://localhost:3000/messages`;

  let response = await fetch(url);
  let results = await response.json();

  console.log(results);
}

async function getAllMessagesUsingAxios() {
  let url = `http://localhost:3000/messages`;

  let response = await axios.get(url);
  console.log(response.data);
}

async function sendMessageToServer() {
  let url = `http://localhost:3000/message`;

  const data = {
    message: "FRA vs ARG",
    reply: 0,
  };

  await axios.post(url, data);
}
