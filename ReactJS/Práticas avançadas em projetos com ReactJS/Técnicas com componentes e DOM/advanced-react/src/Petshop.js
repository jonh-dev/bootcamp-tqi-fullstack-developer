import React from "react";
import PropTypes from "prop-types";

function Petshop (props) {
  
  const { dogs, cats, customers, customerName, onClick } = props

  return (
    <div>
      <div>
        <h1>Dogs: {dogs}</h1>
        <h2>Cats: {cats}</h2>
      </div>
      <div>
        Quantidade de clientes: {customers}
      </div>
      <div>
        Nome do cliente: {customerName}
      </div>
      <button onClick={onClick}>Iniciar banho</button>
    </div>
  )
}

Petshop.defaultProps = {
  cats: 0,
  customers: []
}

Petshop.propTypes = {
  dogs: PropTypes.number.isRequired,
  cats: PropTypes.number,
  customers: PropTypes.array,
  customerName: PropTypes.string.isRequired,
  onClick: PropTypes.func.isRequired
}

export default Petshop