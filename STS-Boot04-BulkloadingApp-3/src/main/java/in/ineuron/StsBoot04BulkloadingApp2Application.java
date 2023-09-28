package in.ineuron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import in.ineuron.comp.Company;

@SpringBootApplication
public class StsBoot04BulkloadingApp2Application {

	public static void main(String[] args) throws Exception {
		ApplicationContext context = SpringApplication.run(StsBoot04BulkloadingApp2Application.class, args);

		Company company = context.getBean(Company.class);
		System.out.println(company);

		((ConfigurableApplicationContext) context).close();
	}

}
