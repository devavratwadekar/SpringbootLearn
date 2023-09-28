package in.ineuron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import in.ineuron.comp.BillGenerate;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);

		BillGenerate billGenerate = context.getBean(BillGenerate.class);
		System.out.println(billGenerate);

		((ConfigurableApplicationContext) context).close();
	}

}
