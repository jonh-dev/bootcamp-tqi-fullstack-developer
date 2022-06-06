import { Fragment } from "react";

function Counter(){

  let quantify = 10;

  function upQuantity (){
    quantify = quantify + 1;
    document.getElementById('counter-box').innerHTML = quantify;
    console.log(quantify);
  }

  return(
    <>
      <h1 id="counter-box">{quantify}</h1>
      <button onClick={upQuantity}>Aumentar</button>
    </>
  )
}

export default Counter;