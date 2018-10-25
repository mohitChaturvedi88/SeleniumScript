package com.Set;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class ConvertSetIntoList {

	public static void main(String[] args) {
		
		LinkedHashSet<String> values = new LinkedHashSet<String>();
		values.add("Hi");
		values.add("test");
		values.add("hello");
		
		
		
		
		List<String> mylist = new ArrayList<String>(values);
		for(String a:mylist) {
			System.out.println(a);
		
	}

		
}

}