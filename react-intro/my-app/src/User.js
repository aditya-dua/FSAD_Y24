import logo from './logo.svg';
import './App.css';
import axios from 'axios';
import { useEffect, useState } from 'react';

function User() {
  const [data,setData] = useState([]);
  const user={
    name:"KL Univ Demo User"
  }
  useEffect(()=>{
    axios.get("https://jsonplaceholder.typicode.com/users")
      .then(response =>{
        setData(response.data);
        console.log(response.data);
      })
      .catch(error => {
        console.log(error)
      })

      axios.post("https://jsonplaceholder.typicode.com/users",{user})
        .then(res=>{
          console.log(res);
          console.log(res.data);
        })
        .catch(error => {
        console.log(error)
        })
  },[])
  
  return (
    <div className = "App">
      {data.map(item=>(
        <p key={item.id}>{item.name} - {item.id} - {item.email}</p>
      ))}
    </div>
  );
}

export default User;
