import React, { useState, useEffect } from 'react';


function App() {
  const [count, setCount] = useState(0);
  useEffect(() => {
    console.log("New Count : "+count )
    document.title = `You clicked ${count} times`;

    return () => handleStatusChange(count);
  });

  function handleStatusChange(count) {
    console.log("Previous count: " +count);
  }

  return (
    <div style={{color: "red",textAlign: 'center'}}>
      <p>You clicked {count} times</p>
      <button onClick={() => setCount(count + 1)}>
        Click me
      </button>
    </div>
    
  );
}

export default App;
