package com.ListDemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo3 {

	public static void main(String[] args) {
		
		List<String> obj1 = new ArrayList<String>();
		
		obj1.add("Mohit Chaturvedi");
		obj1.add(" JI ");
		obj1.add("You ");
		obj1.add("are");
		obj1.add(" Great.");
		
	
		/*int mylistsize = obj1.size();
		System.out.println(mylistsize);*/
		/*for(int i=0; i<mylistsize; i++) {
			
			obj1.get(i);
			System.out.println(obj1.get(i));
		}*/
		/*
		for(Object abc: obj1) {
			System.out.println(abc);
		}*/
		//System.out.println(obj1);
		
		
		// THis is known as inhance for loop, for this we don't requried size of any obj.
		for(String a:obj1) {
			System.out.print(a);
		}
	}

}
