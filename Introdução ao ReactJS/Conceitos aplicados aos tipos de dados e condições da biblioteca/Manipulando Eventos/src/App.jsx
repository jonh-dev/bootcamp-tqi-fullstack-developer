import React from "react";

const listCustomer = [
  {
    id: 1,
    name: 'João Carlos',
    skill:['Learning Fron-End and FullStack']
  },
  {
    id: 2,
    name: 'Mayara Freire',
    skill:['Psicopegoga']
  },
  {
    id: 3,
    name: 'Sael Freire',
    skill:['Chorar, cagar e dormir']
  },
  {
    id: 4,
    name: 'Miucha',
    skill:['Dormir, comer e cagar']
  }
]



const App = () => {
  
  const handleClick = (e, id) => {
    console.log('Deletar cliente')
    alert(`ID do cliente: ${id}`)
  }

  const renderCustomer = (customer, index) => {
    return(
      <div key={`customer-${customer.id}`}>
        <li>{customer.name}<button onClick={(e) => handleClick(e, customer.id)}>Deletar cliente</button></li>
        {customer.skill.map(renderSkill)}
      </div>
    )
}

  const renderSkill = (skill, index) => {
    return (
      <div style={{paddingLeft:'30px', margin:'10px'}} key={`skill-${index}`}>
        <li>{skill}</li>
      </div>
     )
  }

  return (
    <div>
      <p>Digital Innovation One</p>
      <p>Bem vindo a nossa aula =D.</p>
      <div>
      {listCustomer.map(renderCustomer)}
      </div>
    </div>
  );
};

export default App;