import {useState} from 'react';

function SmartCounter (){

  // Retorna um Vetor
  // 1. Variavel stateful
  // 2. Função amarrada a essa variavel que atualiza esse valor
  
  const [ quantity, upQuantity ] = useState(1);
 
  return(
    <>
      <h1>{quantity}</h1>
      <button onClick={() => upQuantity(quantity + 1)}>Aumentar</button>
    </>
  )
}

export default SmartCounter;