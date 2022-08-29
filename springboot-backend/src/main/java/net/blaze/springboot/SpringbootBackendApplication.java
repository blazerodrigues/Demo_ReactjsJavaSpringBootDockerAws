package net.blaze.springboot;

import net.blaze.springboot.Repository.EmployeeRepository;
import net.blaze.springboot.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {
	//CommandLineRunner interface has a RUN method, that will run ONCE when the application starts
	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception{
		Employee e1 = Employee.builder()
				.firstName("John").lastName("Fernandes").email("john@gmail.com").build();
		Employee e2 = Employee.builder()
				.firstName("Mary").lastName("Rodrigues").email("mary@gmail.com").build();
		Employee e3 = Employee.builder()
				.firstName("Anne").lastName("D'Souza").email("anne@gmail.com").build();
		Employee e4 = Employee.builder()
				.firstName("Peter").lastName("Lobo").email("peter@gmail.com").build();
		Employee e5 = Employee.builder()
				.firstName("Jenny").lastName("Lopes").email("jenny@gmail.com").build();

		Employee e6 = Employee.builder()
				.firstName("Henry").lastName("D'Silva").email("henry@gmail.com").build();
		Employee e7 = Employee.builder()
				.firstName("Amelia").lastName("Borges").email("amelia@gmail.com").build();
		Employee e8 = Employee.builder()
				.firstName("James").lastName("Azavedo").email("james@gmail.com").build();
		Employee e9 = Employee.builder()
				.firstName("Emma").lastName("Colaco").email("emma@gmail.com").build();
		Employee e10 = Employee.builder()
				.firstName("Oliver").lastName("Coutinho").email("oliver@gmail.com").build();

		employeeRepository.save(e1);
		employeeRepository.save(e2);
		employeeRepository.save(e3);
		employeeRepository.save(e4);
		employeeRepository.save(e5);
		employeeRepository.save(e6);
		employeeRepository.save(e7);
		employeeRepository.save(e8);
		employeeRepository.save(e9);
		employeeRepository.save(e10);

	}
}
