package ExampleOfCollections;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class SortingComparator {

	public static void main(String[] args) {
	
		
		
		Students s=new Students(1, 22, "A");
		Students s2=new Students(9, 24, "B");
		Students s3=new Students(8, 25, "C");
		Students s4=new Students(2, 21, "D");
		
		List<Students> l=new LinkedList<Students>();
		l.add(s2);
		l.add(s3);
		l.add(s4);
		l.add(s);
		System.out.println(l);
		
//		Collections.sort(l, new Comparator<Students>() {
//			
//			@Override
//			public int compare(Students o1, Students o2) {
//			
//					if(o1.roll>o2.roll)
//						return 1;
//					else if(o1.roll <o2.roll)
//						return -1;
//					else 
//						return 0;
//			}	
//			
//		});
		Comparator<Students> cm2=Comparator.comparing(Students::getName); 
		Collections.sort(l, cm2);
		System.out.println(l);
	}

}

class Students{
	int roll,age;
	String name;
	public Students(int roll, int age, String name) {
		super();
		this.roll = roll;
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Students [roll=" + roll + ", age=" + age + ", name=" + name + "]";
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}