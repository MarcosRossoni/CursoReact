import './App.css';
import SayMyName from "./components/SayMyName";
import Pessoa from "./components/Pessoa";

function App() {
    const nome = 'Mariah'
    return (
        <div className="App">
            <SayMyName nome="Marcos"/>
            <SayMyName nome="Ana"/>
            <SayMyName nome={nome}/>
            <Pessoa nome="Marcos" idade="30" profissao="Programador" foto="https://via.placeholder.com/150"/>
        </div>
    );
}

export default App;
