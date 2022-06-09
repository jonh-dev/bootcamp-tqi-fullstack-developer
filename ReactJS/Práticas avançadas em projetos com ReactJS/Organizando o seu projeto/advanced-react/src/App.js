import React, { useState } from 'react';
import PhotosGallery from '../src/Components/Gallery/index'
import Button from './Components/Button';
// import Calc from './Components/Calc';


function App() {

  // const [value, setValue] = useState(0)
  // const [min, setMin] = useState(0)
  // const [max, setMax] = useState(30)
 
  // const handleClick = () => {
  //   setMin(10)
  // }

  // const handleCalc = ({ target }) => {
  //   const value = target.value
  //   setValue(min + max + value)
  // }
  
  const photos = [
    'https://images.pexels.com/photos/574071/pexels-photo-574071.jpeg',
    'https://images.pexels.com/photos/574071/pexels-photo-574071.jpeg',
    'https://images.pexels.com/photos/574071/pexels-photo-574071.jpeg',
    'https://images.pexels.com/photos/574071/pexels-photo-574071.jpeg'
  ]
  
  return (
    <>

      <h1>Galeria de Fotos</h1>
      <PhotosGallery
        photos={photos}
      />

    </>
  );
}

export default App;
