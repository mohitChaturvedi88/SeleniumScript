package com.Set;

import java.util.HashSet;

public class SetDemo1 {

	public static void main(String[] args) {
		
		HashSet<String> values = new HashSet<String>();
		values.add("Mohit");
		values.add("Chaturvedi");
		values.add("HashSet");
		values.add("Demo");
		
		System.out.println(values);
		
		//instance for loop
		for(String a:values) {
			System.out.println(a );
			
			/*Set stores values in unorder Collection
			Set doesn't allow to store duplicate values
			We can access set by index
			It's child class of collection
*/		}

	}

}
