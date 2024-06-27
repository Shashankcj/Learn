package ExampleOfCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class SortingCompleOblect {

	public static void main(String[] args) {
		
		Student s=new Student(1, 22, "A");
		Student s2=new Student(9, 24, "B");
		Student s3=new Student(8, 25, "C");
		Student s4=new Student(2, 21, "D");
		
		TreeSet<Student> a=new TreeSet<Student>();
		a.add(s);
		a.add(s2);
		a.add(s3);
		a.add(s4);
		System.out.println(a);
		
	}

}

class Student implements Comparable<Student> {
	int roll,age;
	String name;
	@Override
	public int compareTo(Student o) {
		if(this.roll>o.roll)
			return 1;
		else if(this.roll <o.roll)
			return -1;
		else 
			return 0;
	}
	
	public Student(int roll, int age, String name) {
		super();
		this.roll = roll;
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", age=" + age + ", name=" + name + "]";
	}
	
	
	
}