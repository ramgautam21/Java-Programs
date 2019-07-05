import java.util.*;
class Student{
	private String name;
	private int id;
	private String dept;
	public Student(String name,int id,String dept){
		this.name = name;
		this.id = id;
		this.dept = dept;
	}
}

class Department{
	private String name;
	private List<Student> students;
	public Department(String name,List<Student>students){
		this.name = name;
		this.students = students;
	}
	public List<Student> getStudents(){
		return this.students;
	}
	public int getTotalStudents(){
		int noOfStudent = 0;
		for(Student s:this.students){
			noOfStudent++;
		}
		return noOfStudent;
	}
}

public class AggDemo{
	public static void main(String[] args) {
		Student s = new Student("A",1,"CSE");
		Student s1 = new Student("A",2,"CSE");
		Student s2 = new Student("A",3,"CSE");
		List <Student> cse_students = new ArrayList<Student>();
		cse_students.add(s); 
		cse_students.add(s1); 
		cse_students.add(s2);
		Department d = new Department("CSE",cse_students);
		System.out.println("Total number of Students: "+d.getTotalStudents());
		 
	}
}