package in.ineuron;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import in.ineuron.comp.WishMessageGenerator;

@SpringBootApplication
public class BootProjx02DependencyInjectionApplication {

	static {
		System.out.println("BootProjx02DependencyInjectionApplication.class file is loading...");
	}

	public BootProjx02DependencyInjectionApplication() {
		System.out.println("BootProjx02DependencyInjectionApplication :: Zero param Constructor)");
	}

	@Bean
	public LocalDateTime generateDateTime() {
		System.out.println("BootProjx02DependencyInjectionApplication.generateDateTime()");
		return LocalDateTime.now();
	}

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootProjx02DependencyInjectionApplication.class, args);

		WishMessageGenerator wmg = context.getBean(WishMessageGenerator.class);
		System.out.println(wmg);

		String wish = wmg.gerateWish("Subodh");
		System.out.println(wish);

		((ConfigurableApplicationContext) context).close();
	}

}
