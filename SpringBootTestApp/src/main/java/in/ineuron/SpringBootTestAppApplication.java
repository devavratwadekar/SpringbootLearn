package in.ineuron;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import in.ineuron.dao.IEmployeeDAO;
import in.ineuron.model.Employee;

// 31 March,2023
@SpringBootApplication
public class SpringBootTestAppApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootTestAppApplication.class, args);
		System.out.println("No of beans are :: " + Arrays.toString(context.getBeanDefinitionNames()));

		IEmployeeDAO dao = context.getBean(IEmployeeDAO.class);
		try {
			List<Employee> employees = dao.findAllDetails();
			employees.forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}

		((ConfigurableApplicationContext) context).close();
	}
}