function SeuNome({setNome}) {

    return (
        <div>
            <p>Digite o seu nome: </p>
            <input
                type="text"
                onChange={(e) => setNome(e.target.value)}
                placeholder="Qual é o seu nome?"/>
        </div>
    )
}

export default SeuNome