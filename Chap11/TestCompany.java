public class TestCompany{
	public static void main(String[] args){
		Person p1 = new Person("Hiukong Dan", "State Rd. - 11", "86542230",
			"hiukongdan@mydomain.com");
		Student s1 = new Student("Hiukong Dan", "State Rd. - 11", "86542230",
			"hiukongdan@mydomain.com", 2);
		Employee e1 = new Employee("Hiukong Dan", "State Rd. - 11", "86542230",
			"hiukongdan@mydomain.com", "Tech", 20000, new MyDate(1, 0, 0));
		Faculty f1 = new Faculty("Hiukong Dan", "State Rd. - 11", "86542230",
			"hiukongdan@mydomain.com", "Tech", 20000, new MyDate(1, 0, 0),
			8.0, "staff");
		Staff s2 = new Staff("Hiukong Dan", "State Rd. - 11", "86542230",
			"hiukongdan@mydomain.com", "Tech", 20000, new MyDate(1, 0, 0),
			"Junior Programmer");
			
		System.out.println(p1.toString());
		System.out.println(s1.toString());
		System.out.println(e1.toString());
		System.out.println(f1.toString());
		System.out.println(s2.toString());
	}
}
