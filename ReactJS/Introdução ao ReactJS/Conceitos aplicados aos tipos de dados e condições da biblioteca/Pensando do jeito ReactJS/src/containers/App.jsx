import React from "react";
import mock from '../mock';
import Button from '../components/Button';

const App = () => {
  
  const handleClick = (id) => {
    console.log('Deletar cliente')
    alert(`ID do cliente: ${id}`)
  }

  const renderCustomer = (customer, index) => {
    return(
      <div key={`customer-${customer.id}`}>
        <li>{customer.name} <Button onClick={() => handleClick(customer.id)}>Deletar Cliente</Button></li>
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
      {mock.map(renderCustomer)}
      </div>
    </div>
  );
};

export default App;