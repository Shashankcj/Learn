package ExamplesOfStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Example2 {

	public static void main(String[] args) {

		List<Integer> l1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		List<Integer> l2 = Arrays.asList(11, 12, 13, 14, 15, 16, 17, 18, 19);

		List<Integer> l3 = Arrays.asList(21, 22, 23, 24, 25, 26, 27, 28, 29);

		List<Integer> ne=new ArrayList<Integer>();
		ne.addAll(l1);
		ne.addAll(l2);
		ne.addAll(l3);
		System.out.println(ne);
		
		Iterator<Integer> it=l1.iterator();
		
		List<Integer> itr= StreamSupport.stream(Spliterators.spliteratorUnknownSize(it, Spliterator.ORDERED),false)
		.collect(Collectors.toList());
		
		System.out.println(itr);
		
		List<List<Integer>> list = Arrays.asList(l1, l2, l3);

		System.out.println(list);

		List<Integer> finalList = list.stream()
				.flatMap(l -> l.stream())
				.collect(Collectors.toList());

		System.out.println(finalList);

		System.out.println(l1.stream()
				.noneMatch(s -> s > 10));

		List<String> n = Stream.of("One", "Two", "Three", "Four", "Five").filter(a -> a.length() > 3)
				.peek(e -> System.out.println(e))
//		.map(s->s.toUpperCase())
//		.peek(q->System.out.println(q))
				.collect(Collectors.toList());

		System.out.println(n);

		List<String> si = Arrays.asList("alpha", "beta", "gamma");

		String c = si.stream().map(s -> s.toString()).collect(Collectors.joining(" 1 "));

		System.out.println(c);

		List<String> ar = Stream.of("One", "Two", "Three", "Four", "Five")
				.collect(Collectors.toCollection(ArrayList::new));

		System.out.println(ar);

		// two lists covert into map
		List<String> s1 = List.of("One", "Two", "Three");
		List<Integer> l4 = new ArrayList<Integer>();
		l4.addAll(l1);

		l4.addAll(l2);
		l4.addAll(l3);
		List<Integer> s = List.of(0, 1, 2);

		System.out.println("  l4 is " + l4);
		Map<Integer, String> map = s.stream()
				// .collect(Collectors.toMap(i1::get, s1::get));
				.collect(Collectors.toMap(i -> l4.get(i), i -> s1.get(i)));

		System.out.println(map);
		
		System.out.println(s1.stream()
				.collect(Collectors
						.maxBy(Comparator.comparing(l->l))));
		
		

		Map<String, List<Integer>> m = new HashMap<String, List<Integer>>();
		m.put("a", List.of(1, 2, 3, 4));
		m.put("b", List.of(11, 12, 13, 14));
		m.put("c", List.of(21, 22, 23, 24));

		List<Collection<List<Integer>>> h = List.of(m.values());
		System.out.println(h);

		List<String> r = h.stream().
				flatMap(a -> a.stream()).
				flatMap(b -> b.stream()).
				map(z -> z + "0")
				.collect(Collectors.toList());

		System.out.println(r);
		
		
		List<Float> random=Stream.generate(new Random()::nextFloat)
		.limit(5)
		.collect(Collectors.toList());
		
		
		System.out.println(random);
		
		Stream.Builder<String> a=Stream.builder();
		Stream<String> stream=a.add("Raju").add("Ravi").build();
		
		stream.forEach(System.out::println);
		
		Stream<String> a1= Stream.of("Raju","Ravi");
		a1.forEach(System.out::println);
		
		
		
	}

}
