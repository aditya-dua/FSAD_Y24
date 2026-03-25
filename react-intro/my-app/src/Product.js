import logo from './logo.svg';
import './App.css';
import axios from 'axios';
import { useEffect, useState } from 'react';

function Product() {
  const [data,setData] = useState([]);
  const product={
    name:"iPhone 18 Fold Pro"
  }
  useEffect(()=>{
    axios.get("https://5ee9cb81ca5957001602a2af.mockapi.io/api/v1/product")
      .then(response =>{
        setData(response.data);
        console.log(response.data);
      })
      .catch(error => {
        console.log(error)
      })
      axios.delete("https://5ee9cb81ca5957001602a2af.mockapi.io/api/v1/product/12")
      .then(response =>{
        console.log("Delete Success")
        console.log(response.data);
      })
      .catch(error => {
        console.log(error)
      })

      axios.post("https://5ee9cb81ca5957001602a2af.mockapi.io/api/v1/product",{product})
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
        <p key={item.id}>Id: {item.id} Name : {item.name} - Price {item.price}</p>
      ))}
    </div>
  );
}

export default Product;
