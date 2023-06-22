import {useState} from "react";

function Form() {

    function cadastrarUsuario(e) {
        e.preventDefault()
        console.log(`Usuario ${name} foi cadastrado com senha ${password}`)
        console.log("Usuario Cadastrado")
    }

    const [name, setName] = useState()
    const [password, setPassword] = useState()
    return (
        <div>
            <h1>Meu Cadastro:</h1>
            <form onSubmit={cadastrarUsuario}>
                <div>
                    <label htmlFor="name">Nome:</label>
                    <input
                        type="text"
                        id="name"
                        name="name"
                        onChange={(e) => setName(e.target.value)}
                        placeholder="Digite o seu nome"/>
                </div>
                <div>
                    <label htmlFor="password">Senha:</label>
                    <input
                        type="password"
                        id="password"
                        name="password"
                        onChange={(e) => setPassword(e.target.value)}
                        placeholder="Digite sua senha"/>
                </div>
                <div>
                    <input type="submit" value="cadastrar"/>
                </div>
            </form>
        </div>
    )
}

export default Form