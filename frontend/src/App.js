import React, { useState } from 'react';
import './App.css';
import http from "./api/userApi";


// import axios from "axios";

export function createUser(user) {
  return http.post("/users", user);
}


function App() {

  
const [username, setUsername] = useState("");
  const [password, setPassword] = useState("");

  const handleSubmit = async (e) => {
    e.preventDefault();

    const payload = { username, password };

    const response = await createUser(payload);
    console.log("User created:", response.data);
  };


  return (

    <div>

      
          <form onSubmit={handleSubmit}>

                <input placeholder="Username" onChange={(e) => setUsername(e.target.value)} />

                <input type="password" placeholder="Password" onChange={(e) => setPassword(e.target.value)} />

                <button type="submit">Register</button>

          </form>


    </div>
    
  );
}

export default App;
