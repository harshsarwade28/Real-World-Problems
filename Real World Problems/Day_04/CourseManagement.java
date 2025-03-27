package Day_04;


class course{
	
	int courseId;
	String courseName;
	int duration;
	
	course(int courseId, String courseName, int duration){
		this.courseId=courseId;
		this.courseName=courseName;
		this.duration=duration;
		System.out.println("CourseID: "+courseId+" Course Name: "+courseName+" duration in Weeks: "+duration);
	}
}

class SpecializedCourse extends course{
	
	String certificationName;
	
	SpecializedCourse(int courseId, String courseName, int duration, String certificationName){
		super(courseId, courseName, duration);
		this.certificationName=certificationName;
	}
	
	void display() {
		System.out.println("Extract Course Done: "+certificationName);
	}
	
}
public class CourseManagement {

	public static void main(String[] args) {
		
		SpecializedCourse s = new SpecializedCourse(1, "DAC", 10, "JAVA-FULLSTACK");
		s.display();
		course c = new course(2, "DAC", 8);
		
	}
}
