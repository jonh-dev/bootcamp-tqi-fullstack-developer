import { createGlobalStyle } from 'styled-components';
import bgImg from '../../images/bg.jpg'

export const GlobalStyle = createGlobalStyle`

  body {
    background: url(${bgImg});
    background-position: center;
    background-size: cover;
    color: #ffffff;
    padding: 0;
    margin: 0;
    font-family: 'New Tegomin', serif;
    overflow: hidden;
  }
`;