import './App.css';
import SayMyName from "./components/SayMyName";
import Pessoa from "./components/Pessoa";
import List from "./components/List";
import Frase from "./components/Frase";

function App() {
    const nome = 'Mariah'
    return (
        <div className="App">
            <Frase/>
            <Frase/>
            <SayMyName nome="Marcos"/>
            <SayMyName nome="Ana"/>
            <SayMyName nome={nome}/>
            <Pessoa nome="Marcos" idade="30" profissao="Programador" foto="https://via.placeholder.com/150"/>
            <List/>
        </div>
    );
}

export default App;
