package addressBook;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {
	static AddressBook addressBook = new AddressBook();
		
	public static void main(String[] args) {
		boolean running = true;
		
		while(running) {
		Scanner in = new Scanner(System.in);
		
		
		displayMenu();
		
		int choice = in.nextInt();
		switch(choice) {
			case 1: 
				addressBook.addAddress(addEntry()); 
				break;
				
			case 2:
				System.out.println(removeEntry());
				break;
				
			case 3:
				System.out.println(searchEntry());
				break;
			
			case 4: 
				printAddressBook();
				break;
				
			case 5: 
				deleteAddressBook();
				break;
				
			case 6:
				System.out.println("Thanks, have a great day!");
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
		
		EntryAddress newEntry = new EntryAddress(firstNameInput, lastNameInput, phoneNumberInput, emailAddressInput);
		
		return newEntry;
	}
	
	public static String removeEntry() {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter an entry's email to remove: ");
		String emailInput = in.nextLine();
		
		int i=0; 
		for(EntryAddress entry : addressBook.getAddressBook()) {
			if (emailInput.equals(entry.getEmailAddress())) {
				addressBook.getAddressBook().remove(i);
				return "Address has been deleted. /n" + entry.toString();
			}
			i++;
		}
		return "Address was not found.";
	}
	
	public static String searchEntry() {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please provide email address for contact: ");
		String searchType = in.nextLine();
		
		for(EntryAddress entry : addressBook.getAddressBook()) {
			if (searchType.equals(entry.getEmailAddress())) {
				return entry.toString();
			}
		}
		return "Address was not found.";
		
	}
	
	public static void printAddressBook() {
		Scanner in = new Scanner(System.in);
		int i=0;
		
		if(!addressBook.getAddressBook().isEmpty()) { 
			for(i=0; i < addressBook.getAddressBook().size(); i++) {
				System.out.println(addressBook.getAddressBook().get(i));
			}
			
		} else {
			System.out.println("Address book is empty.");
		}
		
	}
	
	public static void deleteAddressBook() {
		if(!addressBook.getAddressBook().isEmpty()) {
			addressBook.getAddressBook().clear();
			System.out.println("Address book cleared!");
		} else {
			System.out.println("Invalid entry.");
		}
		
	}
	
}
