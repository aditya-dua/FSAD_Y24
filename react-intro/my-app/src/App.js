import logo from './logo.svg';
import './App.css';
import axios from 'axios';
import { useEffect, useState } from 'react';

function App() {
  const [data,setData] = useState([]);

  useEffect(()=>{
    axios.get("https://jsonplaceholder.typicode.com/posts")
      .then(response =>{
        setData(response.data);
      })
      .catch(error => {
        console.log(error)
      })
  },[])
  
  return (
    <div className = "App">
      {data.map(item=>(
        <p key={item.id}>{item.title} - {item.id}</p>
      ))}
    </div>
  );
}

export default App;
