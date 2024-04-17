import { BrowserRouter, Routes, Route } from 'react-router-dom';
import EmployeeList from './components/EmployeesList';
import NotFound from './components/NotFound';
import 'bootstrap/dist/css/bootstrap.min.css';
import Layout from "./pages/Layout";
import Home from "./pages/Home";
import Blogs from "./pages/Blogs";
import Contact from "./pages/Contact";
import NoPage from "./pages/NoPage";

function App() {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<EmployeeList />}>
        </Route>
      </Routes>
    </BrowserRouter>
  );
}


export default App;