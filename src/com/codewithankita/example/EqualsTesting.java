package com.codewithankita.example;

import java.util.Objects;

public class EqualsTesting {

	public static void main(String[] args) {
	
		String p2 = null;
	
		System.out.println(Objects.hashCode(p2));
		System.out.println(p2.hashCode());
		
		/* 
		 * what must be hashcode of null objects in Java? 
		 * 
		 * As the javadoc says: Objects.hashCode(Object o)
		 * Returns the hash code of a non-null argument and 0 for a null argument.
		 * p2.hashCode() throws a NullPointerException because you are trying to access a method of a null object.
		 * 
		 * How would you calculate hashCode of an object that doesn't even exists? 
		 * When p2 is null, invoking any method on it will throw a NPE. 
		 * That isn't giving you any particular value of a hashCode.
		 * 
		 * Objects.hashCode() is just a wrapper method, which performs a pre-check for null values, 
		 * and for reference that is not null, it returns the same value as p2.hashCode() as in this case. 
		 * Here's the source code of the method:
		 * public static int hashCode(Object o) {	
		 * 	return o != null ? o.hashCode() : 0;	
		 * }
		 * 
		 * If this is the case, will this not affect the key look-up in HashMap where null Key-value pairs are allowed?
		 * (It might either hash to bucket 0 or throw a NPE)?
		 * If you will search around, you'll notice that HashMap has a special handling for null keys. 
		 * null values are fine as you don't compute hash code for them in a HashMap. 
		 * This is the reason why null keys work fine in HashMap.
		 * 
		 * */

	}

}
