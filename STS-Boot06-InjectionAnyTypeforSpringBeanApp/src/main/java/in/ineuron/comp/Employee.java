package in.ineuron.comp;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "emp.info")
public class Employee {
	private String name;
	private long id;
	private String[] skills;
	private List<String> teamMembers;
	private Set<Long> phoneNumbers;
	private Map<String, Object> idDetails;
	private Company company;

	public void setCompany(Company company) {
		System.out.println("Employee.setCompany()");
		this.company = company;
	}

	public void setIdDetails(Map<String, Object> idDetails) {
		System.out.println("Employee.setIdDetails()");
		this.idDetails = idDetails;
	}

	public void setPhoneNumbers(Set<Long> phoneNumbers) {
		System.out.println("Employee.setPhoneNumbers()");
		this.phoneNumbers = phoneNumbers;
	}

	public void setTeamMembers(List<String> teamMembers) {
		System.out.println("Employee.setTeamMembers()");
		this.teamMembers = teamMembers;
	}

	public void setName(String name) {
		System.out.println("Employee.setName()");
		this.name = name;
	}

	public void setId(long id) {
		System.out.println("Employee.setId()");
		this.id = id;
	}

	public void setSkills(String[] skills) {
		System.out.println("Employee.setSkills()");
		this.skills = skills;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", skills=" + Arrays.toString(skills) + ", teamMembers="
				+ teamMembers + ", phoneNumbers=" + phoneNumbers + ", idDetails=" + idDetails + ", company=" + company
				+ "]";
	}

}
