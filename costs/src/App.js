import {BrowserRouter as Router, Link, Route, Routes} from "react-router-dom";
import Home from "./components/pages/Home";
import Company from "./components/pages/Company";
import Contact from "./components/pages/Contact";
import NewProject from "./components/pages/NewProject";
import Container from "./components/layout/Container";

function App() {
    return (
        <Router>
            <div>
                <Link to="/">Home</Link>
                <Link to="/contact">Contato</Link>
                <Link to="/company">Empresa</Link>
                <Link to="/newproject">Novo Projeto</Link>
            </div>
            <Container container="container" customClass="min-height">
                <Routes>
                    <Route exact path="/" element={<Home/>}></Route>
                    <Route exact path="/contact" element={<Contact/>}></Route>
                    <Route exact path="/company" element={<Company/>}></Route>
                    <Route exact path="/newproject" element={<NewProject/>}></Route>
                </Routes>
            </Container>
            <footer><p>Footer</p></footer>
        </Router>
    );
}

export default App;
