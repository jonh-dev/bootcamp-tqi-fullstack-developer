import React, { Component } from 'react'
import ReactDom from 'react-dom'
// import Button from './Button'
// import ComponentA from './ComponentA'
// import ComponentB from './ComponentB'
import '../src'

//JSX
// function primeiroJSX(){
//     return(
//         <div>
//             Jonh - Introdução ao ReactJS
//         </div>
//     )
// }

// const App = () =>{

//     return(
//         <div className='App'>
//             {
//                 primeiroJSX()
//             }
//         </div>
//     )
// }

// Renderização

// const element = 'Digital Innovation'
// const element2 = <h2>Olá Turma!</h2>

// function App(){
//     return(
//         <div>
//             {element}
//             {element2}
//         </div>
//     )
// }

// Componentes

// function soma (a, b){
//     alert(a + b)
// }

// function App () {
    
//     return(
//         <div className='App'>
//             Hello World!
//             <Button onClick = {() => soma(10, 20)} name="João Carlos"/>
//             <ComponentA>
//                 <ComponentB>
//                     <Button onClick = {() => soma(10, 40)} name="Sael Freire"/>
//                 </ComponentB>
//             </ComponentA>
//         </div>
//     )
// }

// Life Cycle

class App extends Component {

constructor(props){
    super(props)

    this.state = {
        clock: 1000,
        copo:'água',
    }
}

    componentDidMount(){
        window.setTimeout(() => {
            this.setState({
                copo:'suco'
            })
        }, 3000)
    }

    alterarCopo = () => {
        this.setState({
            copo:'refrigerante'
        })
    }

    render(){
        const {clock, copo} = this.state
        return(
            <div>
                <h1>{this.state.clock}</h1>
                <button onClick={() => this.alterarCopo()}><h1>{copo}</h1></button>
            </div>
        )
    }
}



const rootElement = document.getElementById('root')
ReactDom.render(<App />, rootElement)