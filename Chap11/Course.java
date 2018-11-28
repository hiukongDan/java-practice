import java.util.ArrayList;

public class Course{
	public static final long serialVersionUID = 42L;
	
	private String courseName;
	private ArrayList<String> students = new ArrayList<String>();
	
	public Course(String courseName){
		this.courseName = courseName;
	}
	
	public void addStudent(String student){
		this.students.add(student);
	}
	
	public ArrayList<String> getStudent(){
		return this.students;
	}
	
	public int getNumberOfStudents(){
		return this.students.size();
	}
	
	public String getCourseName(){
		return this.courseName;
	}
	
	public void dropStudent(String student){
		this.students.remove((Object)student);
	}
}
