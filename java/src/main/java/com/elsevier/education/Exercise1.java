package com.elsevier.education;

/**

TODO: Make this class immutable.

*/
public  class Exercise1 {

	public final static class Person {
		
		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;
		
		private Person(Set<String> pn,String fn,String ln) {
			this.phoneNumbers=pn;
			this.firstName=fn;
			this.lastName=ln;
		}

		 public static Person createNewInstance(Set<String> pn,String fn,String ln)
		    {
			return new Person(pn, fn, ln);
		    }
		public Set<String> getPhoneNumbers() {
			return phoneNumbers;
		}
		
		
		public String getFirstName() {
			return firstName;
		}
		
		
		public String getLastName() {
			return lastName;
		}
		
	}
}
