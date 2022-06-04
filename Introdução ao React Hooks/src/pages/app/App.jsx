import {useState} from 'react';
import React from "react";
import styled from 'styled-components';
import luffyImg from '../../images/luffy.png'
import { Quotes } from "../../components/quotes/Quotes";
import { getQuote } from "../../services/"


const App = () => {

  const [quoteState, setQuoteState] = useState ({
    quote:'ok',
    speaker:'speaker'
  });

  const onUpdate = async () => {
    const quote = await getQuote();

    setQuoteState(quote);
  };
  
  return (
    <Content>
      <Quotes {...quoteState} onUpdate={onUpdate}/>
      <LuffyImg  src={luffyImg} alt="Luffy com a mão em seu chapéu."/>
    </Content>
  );
};

const Content = styled.div`
  height: 100vh;
  padding: 0 50px;
  display: flex;
  justify-content: center;
  align-items: center;
`;

const LuffyImg = styled.img`
  max-width: 100%;
  align-self: flex-end;
  position: relative;
  right: 210px;
`;

export default App;