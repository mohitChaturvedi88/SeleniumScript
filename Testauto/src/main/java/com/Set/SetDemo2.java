package com.Set;

import java.util.LinkedHashSet;

public class SetDemo2 {

	public static void main(String[] args) {
		
		LinkedHashSet<String> values = new LinkedHashSet<String>();
		values.add("Mohit");
		values.add("Chaturvedi");
		values.add("Chaturvedi");
		values.add("HashSet");
		values.add("Demo");
		
		System.out.println(values);
		
		//instance for loop
		for(String a:values) {
			System.out.println(a );
			
			/*LinkedHashSet stores values in the order Collection
			Set doesn't allow to store duplicate values
			
			It's child class of collection
*/		}

	}

}
