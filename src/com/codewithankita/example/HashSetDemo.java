package com.codewithankita.example;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
	
	public static void main(String[] args) {
		
		Set set1 = new HashSet();
		Set set2 = new HashSet(20);
		Set set3 = new HashSet(25,0.9f);
		Set set4 = new HashSet(new HashSet(10));
		
		String s1 = "Anki";
		s1.concat("ta");
		HashSetDemo obj = new HashSetDemo();
		obj.hey(10,20,30,'c');
	}

	void hey(int... s)
	{
		System.out.println("in hey : "+(char)s[4]);
	}
}
