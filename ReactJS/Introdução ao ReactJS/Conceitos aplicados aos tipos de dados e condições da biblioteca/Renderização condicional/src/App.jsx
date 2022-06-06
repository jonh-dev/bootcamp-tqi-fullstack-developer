import React from "react";

const buttonA = <button>Histórico dos Clientes</button>

const buttonB = <button>Cadastrar Cliente</button>

const hasCustomer = false

const App = () => {

  const renderShowHistory = () => (
    <div>
      Clique no botão abaixo para vizualizar o histórico de clientes. <br /><br />
      {buttonA}
    </div>
    )

    const renderAddCustomer = () => (
      <div>
        Clique no botão abaixo para cadastrar o cliente. <br /><br />
        {buttonB}
      </div>
      )

    const customer = 'João Carlos Schwab Zanardi'

    const showCustomer = () => {

      if (!hasCustomer) return null

      return (
        <div>
          <h1>Nome do Cliente: {customer}</h1>
        </div>
      )

    }

  return (
    <div>
      <p>Digital Innovation One</p>
      <p>Bem vindo a nossa aula =D.</p>
      {hasCustomer ? renderShowHistory () : renderAddCustomer()}
      <div>
      {showCustomer()}
      </div>
    </div>
  );
};

export default App;