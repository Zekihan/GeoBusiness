import express from "express";
import MongoClient from "mongodb";

const app = express();
const port = 5000;

const uri =
  "mongodb+srv://DBADMIN:Z357x159.@business.pid7b.mongodb.net/<dbname>?retryWrites=true&w=majority";

app.get("/", (request, response) => {
  const client = new MongoClient.MongoClient(uri, { useNewUrlParser: true });
  client.connect((err) => {
    client
      .db("business")
      .collection("business")
      .find()
      .toArray()
      .then((results) => {
        console.log(results);
        client.close();
        response.send(JSON.stringify(results));
      })
      .catch((error) => {
        console.error(error);
        client.close();
      });
  });
});

app.get("/test", (request, response) => {
  const userRegex = new RegExp("t", "i");
  var query = { name: userRegex };
  const client = new MongoClient.MongoClient(uri, { useNewUrlParser: true });
  client.connect((err) => {
    client
      .db("business")
      .collection("business")
      .find(query)
      .toArray()
      .then((results) => {
        console.log(results);
        client.close();
        response.send(JSON.stringify(results));
      })
      .catch((error) => {
        console.error(error);
        client.close();
      });
  });
});

app.listen(port, (err) => {
  if (err) {
    return console.log("something bad happened", err);
  }

  console.log(`server is listening on ${port}`);
});
