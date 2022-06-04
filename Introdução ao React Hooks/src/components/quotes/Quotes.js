import React from "react";
import styled from "styled-components";
import { string, func } from 'prop-types';
import { Button } from "../../components/button/Buttons";

export const Quotes = ({quote, speaker, onUpdate }) =>{
  return (
    <Wrapper>
      <Quote>{quote}</Quote>
      <Speaker>- {speaker}</Speaker>
      <Button onClick = {onUpdate}>Mude de frase</Button>
    </Wrapper>
  );
};

Quotes.propTypes = {
  quote: string,
  speaker: string,
  onUpdate: func
};

const Wrapper = styled.div`
  flex: 1;
  display: flex;
  flex-direction: column;
  align-items: center;
  padding-left: 40px;
`;

const Quote = styled.p`
  font-size: 2em;
  margin: 0;
`;

const Speaker = styled(Quote)`
  text-align: right;
  margin-bottom: 50px;
`;