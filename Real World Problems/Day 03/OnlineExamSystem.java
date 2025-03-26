package Day_03;
import java.util.*;

class Exam{
	
	int examId;
	String subjects;
	final String duration="60 Min";
	
	Exam(int examId, String subjects){
		
		this.examId=examId;
		this.subjects=subjects;
		System.out.println("Exam ID: "+examId+" Subjects: "+subjects);
	}
	
	public final void displayInstructions() {
		System.out.println("Exam Instructions: Read all questions carefully before answering.");
	}
}

class ProgrammingExam extends Exam{

	ProgrammingExam(int examId, String subjects) {
		super(examId, subjects);
		
	}
	
}
public class OnlineExamSystem {

	public static void main(String[] args) {
		
		ProgrammingExam p = new ProgrammingExam(12, "MATHS");
		ProgrammingExam p1 = new ProgrammingExam(112, "Java");
		
		p.displayInstructions();
		p1.displayInstructions();
	}
}
