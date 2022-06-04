import React from "react";
import { createRoot } from 'react-dom/client';
import { GlobalStyle } from "../src/components/globalStyle/GlobalStyle";
import App from "../src/pages/app/App";

const container = document.getElementById('app');
const root = createRoot(container);

root.render (
  <React.StrictMode>
    <GlobalStyle />
    <App />
  </React.StrictMode>
)