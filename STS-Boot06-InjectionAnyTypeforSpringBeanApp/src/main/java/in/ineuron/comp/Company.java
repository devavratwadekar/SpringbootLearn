package in.ineuron.comp;

import org.springframework.stereotype.Component;

@Component("company")
public class Company {

	private String title;
	private String location;
	private Long size;

	public void setTitle(String title) {
		System.out.println("Company.setTitle()");
		this.title = title;
	}

	public void setLocation(String location) {
		System.out.println("Company.setLocation()");
		this.location = location;
	}

	public void setSize(Long size) {
		System.out.println("Company.setSize()");
		this.size = size;
	}

	@Override
	public String toString() {
		return "Company [title=" + title + ", location=" + location + ", size=" + size + "]";
	}

}
