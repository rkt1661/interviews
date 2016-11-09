package com.elsevier.education;

import java.util.*;

/**

can run with gradlew clean build; java -cp build/classes/main com.elsevier.education.Exercise3

TODO We should be able to call people.add() twice but end with only one object in it.

*/
public class Exercise3 {

	public static void main(String[] args) {
	
		Set<Person> people = new HashSet<Person>();
	
		Person p1 = new Person(1);
		people.add(p1);
		people.add(p1);
		
		System.out.println(people.size());
		
	}
	
	public static class Person {
	
		private static Random generator = new java.util.Random();
		private Integer id;
		
		public Person(int newId) {
			id = newId;
		}
		
		public int hashCode() {
			return id ;
		}
		
		public boolean equals(Object other) {
			boolean result = false;
		if (other == null || other.getClass() != getClass()) {
			result = false;
		} else {
			Person person = (Person) other;
			if (this.id.compareTo(person.id)==0) {
				result = true;
			}
		}
		return result
			
		}
	}
}
