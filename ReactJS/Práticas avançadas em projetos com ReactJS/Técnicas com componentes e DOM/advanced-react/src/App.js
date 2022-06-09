// Fragments

// import React, { Fragment } from 'react'

// const store = [{
//   type:'Roupa',
// },{
//   type:'Calçado',
// },{
//   type:'Camiseta'
// }]

// function Column({type}) {
//   return (
//     <tbody>
//         <td>{type}</td>
//     </tbody>
//   )
// }

// function App() {

//   const renderColumns = (element, key) => (
  
// <Fragment key={`column-${key}`}>
//     <Column type={element.type}/>
//   </Fragment>

//   )
//   return (
//     <table>
//         {store.map(renderColumns)}
//     </table>
//   );
// }

// export default App;

// Render Props

// import React, { PureComponent } from 'react'
// import Counter from './Counter'

// const Buttons = ({ increment, decrement, count }) => (
//   <div>
//     <h1>Valor Atual: {count}</h1>
//     <div>
//       <button onClick={increment}>Adicionar 1</button>
//     </div>
//     <div>
//       <button onClick={decrement}>Remover 1</button>
//     </div>
//   </div>
// )

// export default class App extends PureComponent {
//   render () {
//     return (
//       <div>
//         <Counter render={
//           ({ increment, decrement, count}) => (
//             <Buttons
//             increment={increment}
//             decrement={decrement}
//             count={count}
//             />
//           )
//         }>

//         </Counter>
//       </div>
//     )
//   }
// }

// TypeChecking PropTypes

// import React from 'react'
// import Petshop from './Petshop'

// function App (){
//   const handleClick  = () =>{
//     console.log('Iniciando Banho...')
//   }

//   return (
//     <Petshop 
//       dogs={2}
//       customerName={'Jonh'}
//       onClick={handleClick}
//     />
//   )
// }

// export default App

// Refs DOM

import React, { useEffect, useRef, useState } from "react";

function App () {
  const inputRef = useRef()
  const count = useRef(1)
  const [value, setValue] = useState (false)

  const handleClick = () => {
    inputRef.current.focus()
    console.log('inputRef.current', inputRef.current)
  }

  useEffect(() => {
    setTimeout(() => {
      console.log('Passou aqui')
      count.current = 300
      setValue (true)
    }, 3000)
  })

  return (
    <>
      <h1>Valor de Count: {count.current}</h1>
      Foco: <input ref={inputRef}></input>
      <br></br>
      <br></br>
      <br></br>
      <button onClick={handleClick}>Focar</button>
    </>
  )
}

export default App