import { useEffect, useState } from 'react';
import { Link} from 'react-router-dom';
import {useNavigate} from 'react-router-dom';

import employeeService from '../services/employee.service';

const EmployeeList = () => {
  console.log('emplyee list');
  const [employees, setEmployees] = useState([]);

  const init = () => {
    employeeService.getAll()
      .then(response => {
        console.log('Printing employees data', response.data);
        setEmployees(response.data);
      })
      .catch(error => {
        console.log('Something went wrong', error);
      }) 
  }

  useEffect(() => {
    init();
  }, []);

  const handleDelete = (id) => {
    console.log('Printing id', id);
    employeeService.remove(id)
      .then(response => {
        console.log('employee deleted successfully', response.data);
        init();
      })
      .catch(error => {
        console.log('Something went wrong', error);
      })
  }


  return (
    <div className="container">
      <br></br>
      <h3>List of Employees</h3>
      <hr/>
      <div>
        <table className="table table-bordered table-striped">
          <thead className="thead-dark">
            <tr>
              <th>Name</th>
              <th>Location</th>
              <th>Department</th>
            </tr>
          </thead>
          <tbody>
          {
            employees.map(employee => (
              <tr key={employee.id}>
                <td>{employee.name}</td>
                <td>{employee.location}</td>
                <td>{employee.department}</td>
              </tr>
            ))
          }
          </tbody>
        </table>
        
      </div>
    </div>
  );
}

export default EmployeeList;