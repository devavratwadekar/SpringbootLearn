package in.ineuron.comp;

import org.springframework.stereotype.Component;

@Component(value = "java")
public class JavaCourseMaterial implements ICourse {

	static {
		System.out.println("JavaCourseMaterial.class file is loading...");
	}

	public JavaCourseMaterial() {
		System.out.println("JavaCourseMaterial :: Zero param constructor...");
	}

	@Override
	public String courseContent() {
		System.out.println("JavaCourseMaterial.courseContent()");
		return "1.oops 2.ExceptionHandling 3.Collection";
	}

	@Override
	public Float price() {
		System.out.println("JavaCourseMaterial.price()");
		return 400.0f;
	}

}
