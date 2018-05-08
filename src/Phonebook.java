import java.util.Scanner;

public class Phonebook {
	
	
	public static void main(String[] args) {
		displayMenu();
	}

	public static void displayMenu() {

		Scanner in = new Scanner(System.in);
		Scanner inString = new Scanner(System.in);
		AddRecord phoneBook = new AddRecord();
		boolean changed = false;

		while(true) {
			
			System.out.println();
			System.out.println("Enter 1 to add new record. ");
			System.out.println("Enter 2 to Delete a record");
			System.out.println("Enter 3 to search by first name ");
			System.out.println("Enter 4 to search by last name");
			System.out.println("Enter 5 to update an existing record");
			System.out.println("Enter 6 to search by  full name");
			System.out.println("Enter 7 to search for existing records");
			System.out.println("Enter 8 to search by phone number");
			System.out.println("Enter 9 to search by city");
			System.out.println("Enter 10 to search by State");
			System.out.println("press 11 to exit program");

			int choice = in.nextInt();

			switch (choice) {

			case 1 : 
				System.out.print("Enter first Name: ");
				String firstname = inString.nextLine();
				System.out.print("Enter middle name ");
				String middleName =inString.nextLine();
				System.out.print("Enter last name: ");
				String lastName = inString.nextLine();
				System.out.print("Enter phone number ex: 1236578978 ");
				String phoneNumber = inString.nextLine();
				System.out.print("Enter the Street Address ");
				String streetAddress = inString.nextLine();
				System.out.print("Enter the City ");
				String city = inString.nextLine();
				System.out.print("Enter the State Ex: MO ");
				String state = inString.nextLine();
				System.out.print("Enter Zip Code ");
				String zip = inString.nextLine();

				Person c1 = new Person();
				c1.setFirstName(firstname);
				c1.setMiddleName(middleName);
				c1.setLastName(lastName);
				c1.setPhoneNumbers(phoneNumber);
				c1.getAddress().setCity(city);
				c1.getAddress().setState(state);
				c1.getAddress().setStreet(streetAddress);
				c1.getAddress().setZip(zip);
				System.out.println();
				System.out.println("The new record is: " + firstname +" "+ middleName +" "+ lastName +" "+ streetAddress +" "+ city + " "+ state + " "+ phoneNumber); 
				System.out.println();

				phoneBook.addPerson(c1);
				break;

			case 2 : 
				System.out.println("Enter the record phone number you would like to delete ");
				String pNum = inString.next();
				

				phoneBook.removeRecord(pNum);
				break;
			case 3 : 
				System.out.println("What's the first name you would like to search ");
				String searchName = inString.nextLine();
				phoneBook.searchfirstName(searchName);
				break;

			case 4 : 
				System.out.println( "What's the last name you would like to search ");
				String searchlastName = inString.next();
				phoneBook.searchlastName(searchlastName);
				break;
			case 5:
				
				
				
				break;
			case 6 :
				 System.out.println("Enter the first name to search ");
				 String fname2 = inString.nextLine();
				 System.out.println("Enter the last name to search  ");
				 String lname2 = inString.nextLine();
				 
				 phoneBook.searchfullName(fname2, lname2);
				break;
				

			case 7: 
				System.out.println( );
				phoneBook.allRecords();	
				System.out.println();
				break;

			case 8 : 
				System.out.println("Enter the the phone number your would like to search ");
				String phoneNum = inString.next();
				if(phoneNum.length()!= 9)
					System.out.println("Please enter a digit number");
			
					
				phoneBook.searchNum(phoneNum);
				break;

			case 9 : 
				System.out.println("Enter the name of city ");
				String city1 = inString.nextLine();
				phoneBook.searchCity(city1);
				System.out.println();
				break;

			case 10 : 
				System.out.println("Enter the state you would like to search ");
				String state1 = inString.next();
				phoneBook.searchState(state1);
				break;

			case 11 : 
				System.out.println("Exit Phonebook: ");
				System.exit(0);
				break;

			default:

				System.out.println("Enter a number betweent 1-11");

			}
		}
	}

}


