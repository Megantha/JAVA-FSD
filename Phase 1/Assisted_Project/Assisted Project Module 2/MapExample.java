package Asistedprojects;

import java.util.*;

public class MapExample {
	public static void main(String[] args) {
		//Hashmap
		HashMap<Integer,String> n=new HashMap<Integer,String>();
		n.put(1,"Tom");
		n.put(2,"Jerry");
		n.put(3,"Mummy");
		n.put(4,"Bheem");
		
		System.out.println("\nThe elements of Hashmap are");
		
		for(Map.Entry m:n.entrySet()) {
			System.out.println(m.getKey()+""+m.getValue());
		}
		
		//HashTable
		Hashtable<Integer,String> h=new Hashtable<Integer,String>();
		h.put(5,"Chutki");
		h.put(6,"Jaggu");
		h.put(7,"Raju");
		
		System.out.println("\nThe elements of hashtable are");
		for(Map.Entry o:h.entrySet()) {
		System.out.println(o.getKey()+""+o.getValue());
			
		}
		//TreeMap
		
		TreeMap<Integer,String> o=new TreeMap<Integer,String>();
		o.put(8,"Indumati");
		o.put(9,"kalia");
		o.put(10,"Dholu-Bholu");
		
		System.out.println("\nThe elements of Treemap are");
		for(Map.Entry l:o.entrySet()) {
		System.out.println(l.getKey()+""+l.getValue());
		}
		
		
		
		
				
		
		
		
	}

	
	

}
