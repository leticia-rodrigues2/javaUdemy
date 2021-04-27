package udemyList;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class exemplo1 {

	public static void main(String[] args) {
	List <String>list = new ArrayList< > ();
	
	list.add("Maria");
	list.add("Theo");
	list.add("Ravi");
	list.add("Leticia");
	list.add(2, "Marco");
	
	
	System.out.println(list.size());
	
	
	
	for (String x : list) {
		System.out.println(x);
	}
	
	System.out.println("------------------------------");
	
//	list.remove(1);
	list.removeIf(x -> x.charAt(0)== 'M');
	
	for (String x : list) {
		System.out.println(x);
	
	}
	
	System.out.println("------------------------------");

	
	System.out.println("index of Bob" + list.indexOf("Bob"));
	System.out.println("index of Theo" + list.indexOf("Theo"));

	
	System.out.println("------------------------------");

	
	List <String> result = list.stream().filter( x->x.charAt(0)== 'R').collect(Collectors.toList());
	
	for (String x : result) {
		System.out.println(x);
	
	}
	System.out.println("------------------------------");
	
	// entrar o primei elemento com T
	
	
	String name = list.stream().filter( x->x.charAt(0)== 'T').findFirst().orElse(null);
	String name2 = list.stream().filter( x->x.charAt(0)== 'A').findFirst().orElse(null);
System.out.println(name);
System.out.println(name2);
	
	}

}
