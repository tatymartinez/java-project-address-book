package addressBook;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {
	
	public static void main(String[] args) {
		boolean running = true;
		
		while(running) {
		Scanner in = new Scanner(System.in);
		AddressBook addressBook = new AddressBook();
		
		displayMenu();
		
		int choice = in.nextInt();
		switch(choice) {
			case 1: 
				addressBook.setAddressBook(addEntry()); 
				break;
				
			case 2:
				//removeEntry();
				break;
				
			case 3:
				//searchEntry();
				break;
			
			case 4: 
				//printAddressBook();
				break;
				
			case 5: 
				//deleteAddressBook();
				break;
				
			case 6:
				//quitProgram();
				running = false;
				break;
				
			default:
				System.out.println("Invalid Entry");
				break;
				
			}
			
		}

	}
	
	public static void displayMenu() {
		Scanner in = new Scanner(System.in);
		
		System.out.println("What would you like to do?");
		System.out.println("1. Add an entry");
		System.out.println("2. Remove an entry");
		System.out.println("3. Search for a specific entry");
		System.out.println("4. Print Address Book");
		System.out.println("5. Delete Book");
		System.out.println("6. Quit");
	}
		

	public static EntryAddress addEntry() {
		Scanner in = new Scanner(System.in);
		
		System.out.println("What is your first name?");
		String firstNameInput = in.nextLine();
		
		System.out.println("What is your last name?");
		String lastNameInput = in.nextLine();
		
		System.out.println("What is your phone number?");
		String phoneNumberInput = in.nextLine();
		
		System.out.println("What is your email address?");
		String emailAddressInput = in.nextLine();
		
		EntryAddress entry1 = new EntryAddress(firstNameInput, lastNameInput, phoneNumberInput, emailAddressInput);
		
		return entry1;
	}
	
	public static void removeEntry() {
		
	}
	
	
}
