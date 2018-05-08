import java.util.Scanner;

public class AddRecord {
	



		private static Person [] people;

		public void allRecords() {
			Person temp;
			for(int i = 0; i < people.length; i++) {

				for (int j = i +1; i < people.length; i++) {

					if(people[i].getFirstName().charAt(0) > people [j].getFirstName().charAt(0)) {

						temp = people[i];
						people[i]= people[j];
						people[j]= temp;
					}

				}
			}
			for (int i = 0; i < people.length -1;i++ ) {
				System.out.println(people[i]);

			}

		}

		public void updatingRecord(String num) {
			Scanner input = new Scanner(System.in);
			
			for (int i = 0; i < people.length;i++) {
				
				if (num.trim().equals(people[i].getPhoneNumbers())){
					
					System.out.print("Enter first Name: ");
					people[i].setFirstName(input.nextLine());
					
					
					
					
					System.out.print("Enter middle name ");
					people[i].setMiddleName(input.nextLine());
					
					
					System.out.print("Enter last name: ");
					people[i].setLastName(input.nextLine());
					
					System.out.print("Enter phone number ex: 1236578978 ");
					people[i].setPhoneNumbers(input.nextLine());
					
					
					System.out.print("Enter the Street Address ");
					people[i].getAddress().setStreet(input.nextLine());
					
					System.out.print("Enter the City ");
					people[i].getAddress().setCity(input.nextLine());
					
					System.out.print("Enter the State Ex: MO ");
					people[i].getAddress().setState(input.nextLine());
					
					System.out.print("Enter Zip Code ");
					people[i].getAddress().setZip(input.nextLine());	
					
				}
				
			}

		}

		public void searchfullName(String fname1, String lname1) {


			for (int i = 0; i < people.length;i++) {
				if(people[i].getFirstName().trim().toUpperCase().equals(fname1.toUpperCase()) && people[i].getLastName().trim().toUpperCase().equals(lname1.toUpperCase())) {
					System.out.println(people[i]);
				}
			}
		}

		public void searchState(String state) {
			for (int i = 0; i <people.length; i++) {
				if(state.toUpperCase().trim().equals(people[i].getAddress().getState().toUpperCase().trim())) {
					System.out.print(people[i]);
					System.out.println();
				}
			}
		}


		public void searchCity(String city) {
			for (int i = 0; i <people.length; i++) {
				if(city.toUpperCase().trim().equals(people[i].getAddress().getCity().trim().toUpperCase())) {
					System.out.print(people[i]);

				}
			}
		}

		public void removeRecord (String pNum) {

			int j=0,temp=0;
			for( int i = 0; i < people.length; i++) {
				if(pNum.toUpperCase().trim().equals(people[i].getPhoneNumbers().trim().toUpperCase())){
					temp =i;

				}
			}

			for (int k = temp; k < people.length-1; k++) {

				people[k] = people[k+1];
				j++;

			}
			people[people.length-1] = null;
		}
		public void searchNum (String num) {

			for (int i = 0; i < people.length; i++) {

				if( num.toUpperCase().trim().equals( people[i].getPhoneNumbers().toUpperCase().trim())) {
					System.out.print(people[i]);
					System.out.println();
				}

			}
		}
		public void searchfirstName (String name) {

			for (int i = 0; i < people.length; i++) {

				if( name.toUpperCase().trim().equals( people[i].getFirstName().trim().toUpperCase())) {
					System.out.print(people[i]);
					System.out.println();

				}

			}
		}
		public void searchlastName (String lastName) {

			for (int i = 0; i < people.length; i++) {

				if( lastName.toUpperCase().trim().equals( people[i].getLastName().toUpperCase().trim())) {
					System.out.print(people[i]);
					System.out.println();
				}
			}
		}


		public void addPerson(Person p1) {
			if(people==null) {
				people = new Person[1];
			}else {
				people = expandArray(people);
			}
			people[people.length-1] = p1;
		}

		private  static Person[] expandArray(Person[] p2) {
			Person [] target = new Person[people.length +1];
			for(int i = 0; i < people.length; i++) {
				target[i] = people[i];
			}
			return target;
		}


	}
	
	
	
	


