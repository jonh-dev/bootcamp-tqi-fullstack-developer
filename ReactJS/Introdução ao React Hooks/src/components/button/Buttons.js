import styled from 'styled-components';

export const Button = styled.button`
  background: #37aef2;
  color: #fff;
  border: none;
  border-radius: 10px;
  font-size: 1.5em;
  margin-left: 10px;
  padding: 10px 20px;
  font-family: 'New Tegomin',serif;
  cursor: pointer;
  box-shadow: #332c3657 3px 3px 3px;
  &:hover {
    background-color: #04a2fc;
  }
  &:focus {
    outline: none;
  }
`;