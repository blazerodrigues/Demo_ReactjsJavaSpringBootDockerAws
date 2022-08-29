import React, { useEffect, useState } from "react";
import EmployeeService from "../services/EmployeeService";

function EmployeeComponent() {
  const [employees, setEmployees] = useState([]);

  useEffect(() => {
    getEmployees();
  }, []);

  const getEmployees = () => {
    EmployeeService.getEmployees().then((response) => {
      setEmployees(response.data);
      console.log(response.data);
    });
  };

  return (
    <div className="container">
      <h1 className="text-center">Employees List</h1>
      <table className="table table-striped">
        <thead>
          <tr>
            <th>Employee ID</th>
            <th>Employee First Name</th>
            <th>Employee Last Name</th>
            <th>Employee Email Id</th>
          </tr>
        </thead>
        <tbody>
          {employees.map((employee) => {
            return (
              <tr key={employee.id}>
                <td>{employee.id}</td>
                <td>{employee.firstName}</td>
                <td>{employee.lastName}</td>
                <td>{employee.email}</td>
              </tr>
            );
          })}
        </tbody>
      </table>
    </div>
  );
}

export default EmployeeComponent;
