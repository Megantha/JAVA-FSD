package Asistedprojects;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;
import java.util.LinkedList;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class CollectionAssist {
	public static void main(String[] args) {
		//Arraylist
		ArrayList<String> fruits = new ArrayList<String>();
		System.out.println("Size :"+fruits.size());
		
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add(null);
		
		System.out.println(fruits);
		
		//Vectorlist
		
		Vector<String> places = new Vector<String>();
		
		places.add("bangalore");
		places.add("chennai");
		
		System.out.println(places);
		places.remove(1);
		places.add("Mumbai");
		
		System.out.println(places);
		
		//Linkedlist
		LinkedList<Integer> num= new LinkedList<Integer>();
		num.add(55);
		num.add(65);
		num.add(75);
		num.add(85);
		

		System.out.println("First Element: "+num.getFirst());
		
		System.out.println("Last Element: "+num.getLast());
		
		num.add(3,0);
		
		Iterator<Integer> itr = num.iterator();
		
		while(itr.hasNext()) {
			System.out.println("using iterator: "+itr.next());
		}
		//HashSet
		
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(null);
		
		System.out.println(set);
		
		for(Integer i:set) {
			System.out.println("Using for loop: "+i);
		}
		 
		//LinkedHashSet
		
		LinkedHashSet<String> linkedset= new LinkedHashSet<String>();
		
		linkedset.add("A");
		linkedset.add("B");
		linkedset.add("C");
		linkedset.add("D");
		
        System.out.println("Size: "+linkedset.size());
		
		System.out.println(linkedset);
		
		
		System.out.println("Contains E: "+linkedset.contains("E"));
		
		linkedset.remove(null);
		
		System.out.println("After Remove: "+linkedset);
		
		//TreeSet
		
		Set<String> city = new TreeSet<String>(); 
		
		city.add("chennai");
		city.add("Pune");
		city.add("Noida");
		city.add("Hyderabad");
		
		System.out.println(city);
		
		System.out.println("Size: "+city.size());
		
		System.out.println("Contains: "+ city.contains("Noida"));
		
		
		
		
	}
	

}
