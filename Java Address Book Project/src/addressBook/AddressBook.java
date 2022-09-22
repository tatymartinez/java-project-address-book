package addressBook;

import java.util.ArrayList;

public class AddressBook {
	ArrayList<EntryAddress> addressBook = new ArrayList<>();

	public AddressBook() {
		
	}
	
	public AddressBook(ArrayList<EntryAddress> addressBook) {
		this.addressBook = addressBook;
	}
	
	public ArrayList<EntryAddress> getAddressBook() {
		return addressBook;
	}

	public void addAddress(EntryAddress entry) {
		this.addressBook.add(entry);
		System.out.println(addressBook.toString());
	}
	
	@Override
	public String toString() {
		return "AddressBook [addressBook=" + addressBook + "]";
	}
	
}
