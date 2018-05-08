
public class Person {
	
	
	
	private String firstName;
	private String lastName;
	private String middleName;
	private Address address = new Address();
	private String phoneNumbers;
	
	
	public Person(String firstName, String lastName, Address address, String phoneNumbers) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.phoneNumbers = phoneNumbers;
	
	}
	
	




	public Person() {
		
	}
	
	@Override
	public String toString() {
		return firstName + " " + lastName + " " + middleName + ", "
				+ address + ", " + phoneNumbers;
	}
	
	public String getPhoneNumbers() {
		return phoneNumbers;
		
	}

	






	public String getMiddleName() {
		return middleName;
	}




	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}




	public void setPhoneNumbers(String phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
	
	
}


