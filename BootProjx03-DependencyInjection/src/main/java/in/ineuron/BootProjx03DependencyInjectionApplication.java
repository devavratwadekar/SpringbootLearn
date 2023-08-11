package in.ineuron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import in.ineuron.comp.Student;

@SpringBootApplication
public class BootProjx03DependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootProjx03DependencyInjectionApplication.class, args);

		Student student = context.getBean("student",Student.class);
		student.preparation("java");
		
		((ConfigurableApplicationContext) context).close();
	}

}
