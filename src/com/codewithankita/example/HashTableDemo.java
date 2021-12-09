package com.codewithankita.example;

import java.util.HashMap;
import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
	
		Hashtable<String,Integer> marks = new Hashtable<>();
		
		marks.put("Naveen", 100);
		marks.put("Tom", 200);
		marks.put("Lisa", 300);
		marks.put("Peter", 400);
		//marks.put(null, 500);
	
		System.out.println(marks.get("Naveen"));
		System.out.println(marks.get("Peter"));
		System.out.println(marks.get("Test"));
		
		HashMap<String,Integer> map = new HashMap<>();
		
		map.put(null, null);
		
		System.out.println(10+30+"Ankita");
		System.out.println("Ankita"+10+30);
		System.out.println(10*30+"Ankita");
		System.out.println("Ankita"+10*30);
		
		Thread t1 = new MyThread();
		t1.run();
		t1.run();
		
		int a[] = new int[] {5,7,2,6,1,9};
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i] +  " ");
		}
		int temp;
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[j] > a[i])
				{
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}	
		}
		System.out.println();
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
	}

}
