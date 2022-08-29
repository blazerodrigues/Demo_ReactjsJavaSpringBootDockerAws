//axios library installed using "npm add axios". AXIOS will help us to make HTTP requests to REST API
import axios from 'axios';

const EMPLOYEES_REST_API_URL = 'http://localhost:8080/api/employees';

//creating a class
class EmployeeService{

    getEmployees(){
        return axios.get(EMPLOYEES_REST_API_URL); //Get Request to the REST API
    }

}

//exporting default - object of thr class EmployeeService
export default new EmployeeService();