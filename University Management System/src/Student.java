import java.util.ArrayList;
import java.util.List;

public class Student {
	private int studentId;
	private String firstName, lastName;
	private List<Course> courses;
	
	public Student(int studentId, String firstName, String lastName) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.courses = new ArrayList<>();
    }
	
	public int getStudentId() {
		return this.studentId;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public List<Course> getCourses(){
		return this.courses;
	}
	
	public void enroll(Course c) {
		this.courses.add(c);
	}
}
