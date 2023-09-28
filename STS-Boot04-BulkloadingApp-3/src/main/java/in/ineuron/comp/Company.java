package in.ineuron.comp;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "org.info")
@PropertySource(value = "in/ineuron/commons/input.properties")
public class Company {

	private String name;
	private String location;
	private Integer size;

	static {
		System.out.println("Company.class file is loading...");
	}

	public Company() {
		System.out.println("Company :: Zero param constructor...");
	}

	public void setName(String name) {
		System.out.println("Company.setName()");
		this.name = name;
	}

	public void setLocation(String location) {
		System.out.println("Company.setLocation()");
		this.location = location;
	}

	public void setSize(Integer size) {
		System.out.println("Company.setSize()");
		this.size = size;
	}

	@Override
	public String toString() {
		return "Company1 [name=" + name + ", location=" + location + ", size=" + size + "]";
	}

}
