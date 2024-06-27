package ExamplesOfStream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Example1 {

	public static void main(String[] args) {
		
		List<Student> l=new ArrayList<Student>();
		l.add(new Student(1, "Aa", 21));
		l.add(new Student(2, "B", 22));
		l.add(new Student(5, "D", 20));
		l.add(new Student(3, "C", 23));
		l.add(new Student(4, "D", 20));
		
		
		//map method is used for extarct and collectore for store value
//		Set<Integer> ls=l.stream()
//				.map(Student ->Student.age)
//				.collect(Collectors.toSet());
//		System.out.println(ls);
//		
		// convert list into map using stream
//		Map<Integer, String> m=l.stream()
//					.collect(Collectors.toMap(Student->Student.id,Student-> Student.name));
//		
//		System.out.println(m);
		
//		int  totalAge=l.stream()
//         //	.filter(s->s.age<=22)
//				.map(s->s.age)
//				//.map(Student::getAge)
//				.reduce(0,(sum,a)->sum+a);
//	
//		System.out.println(totalAge);
		
		//sorted using the stream
//		List<Integer> list=l.stream()
//				.map(s->s.age)
//				.sorted()
//				.collect(Collectors.toList());
//	
//				System.out.println(list);
//				
				
		//using foreach method in the stream
//		l.stream()
//		//.map(s->s.name)
//		//.forEach(name->System.out.println(name));
//		.forEachOrdered(s->System.out.println(s.id+" "+s.name+" "+s.age));
		
		
		boolean b=l.stream().allMatch(s->s.age>=20);
		System.out.println(b);
		
		boolean a=l.stream().anyMatch(s->s.name.equals("Z"));
		System.out.println(a);
		
	
		
//		l.stream()
//		.map(Student::getAge)
//		.sorted(Comparator.reverseOrder())
//		.forEach(System.out::println);
//		
		
		//It skips the index mention number 
//		 l.stream().skip(2)
//		 .map(Student::getAge)
//		 .forEach(System.out::println);
//		
		
		//It store or retrive mention items
//		l.stream().limit(3)
//		.forEach(s->System.out.println(s.name+" "+s.age));
//		
		//using the both limit and skip
		l.stream().limit(3).skip(2)
		.forEach(s->System.out.println(s.age));
		
		//it is used for sum and it can use int,long and double
//		int totalId=l.stream().collect(Collectors.summingInt(s->s.id));
//		System.out.println(totalId);
		
		//average
		System.out.println(l.stream()
		.collect(Collectors.averagingInt(s->s.age)));
		
		//count
		System.out.println(l.stream()
				.collect(Collectors.counting()));
		//finding unique
	List<Integer>	unique=l.stream().
		map(s->s.age).distinct().collect(Collectors.toList());
	System.out.println(unique);
	
	
	//finding min 
//	int min=l.stream().
//	map(s->s.age)
//	.min(Integer::compare)
//	.get();
//	
//	System.out.println(min);
//	
	
	String mins=l.stream().
	map(s->s.name)
	.min(String::compareTo)
	.get();
	
	System.out.println(mins);
	
	
	
	List<String> name=l.stream()
	.map(Student::getName)
	.collect(Collectors.toList());
	
	Optional<String> n=name.stream().reduce((s1,s2)->
		s1.length()> s2.length()?s1:s2
	);
	
	System.out.println(n);
	
	
		//it is used for finding min, max, avg, total and number of item
		 IntSummaryStatistics total=l.stream()
		.collect(Collectors.summarizingInt(s->s.age));
		 System.out.println(total);
	}

	

//	
//	Stream s1=Stream.of("Hii");
//	Stream s2=Stream.of("Raju");
//	
//	Stream.concat(s1, s2).forEach(e->System.out.println(e));
//		
			
	
}

class Student {
	int id;
	String name;
	int age;
	
	
	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
}
