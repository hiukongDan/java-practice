import java.util.ArrayList;
public class TestCourse{
	public static void main(String[] args){
		Course c1 = new Course("Math");
		c1.addStudent("Marry");
		c1.addStudent("Joseph");
		c1.addStudent("Clinton");
		
		System.out.println("Number of students: " + c1.getNumberOfStudents());
		System.out.println("Course name: " + c1.getCourseName());
		
		System.out.println("Drop Clinton");
		c1.dropStudent("Clinton");
		ArrayList<String> al = c1.getStudent();
		for (int i = 0; i < c1.getNumberOfStudents(); i++)
			System.out.println(i + " " + al.get(i));
	}
}
