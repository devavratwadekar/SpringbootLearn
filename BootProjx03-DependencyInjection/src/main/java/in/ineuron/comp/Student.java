package in.ineuron.comp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Student {

	@Autowired(required = true)
	@Qualifier(value = "java")
	public ICourse course;
	
	static {
		System.out.println("Student.class file is loading...");
	}

	public Student() {
		System.out.println("Student :: Zero param constructor...");
	}

	public void preparation(String examName) {
		System.out.println("Student.preparation()");
		System.out.println("Implementation class name is :: " + course.getClass().getName());

		String courseContent = course.courseContent();
		Float price = course.price();

		System.out.println("Course choose is :: " + courseContent + " Material price :; " + price);
	}

	@Override
	public String toString() {
		return "Student [course=" + course + "]";
	}

}
