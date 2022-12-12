import java.util.ArrayList;

public class ContactService {
	private static ArrayList<Contact>contact = new ArrayList<Contact>();
	
	public static boolean CreateContact(String contactId, String firstName, String lastName, String phoneNumber, String address) {
		if(contactId.length()>10 && contactId != null || firstName.length()> 10 && firstName != null || lastName.length()> 10 && lastName != null || phoneNumber.length()> 10 && phoneNumber != null ||address.length()>30 && address != null) {
			return false;
		}else {
			Contact newContact = new Contact(contactId, firstName, lastName, phoneNumber, address);
			contact.add(newContact);
			//System.out.println(newContact);
			return true;
		} 
	}
	
	public static void FetchContact() {
		for(Contact AllContact: contact) {
			String IdContact = AllContact.getContactId();
			String FContact = AllContact.getFirstName();
			String LContact = AllContact.getLastName();
			String PNContact = AllContact.getPhoneNumber();
			String AContact = AllContact.getAddress();
			
			System.out.println(IdContact + " " + FContact + " " + LContact + " " + PNContact + " " + AContact);
		}
	}
	public static boolean DeleteContact(String contactId) {
		for(Contact AllContact: contact) {
			if(AllContact.getContactId().equals(contactId)) {
				//System.out.println(AllContact );
				contact.remove(AllContact);
				return true;
			}
		}
		return true;
	}
	
	public static boolean UpdateContactFirstName(String contactId, String firstName) {
		for(Contact AllContact: contact ) {
			//System.out.println(AllContact);
			if(AllContact.getContactId().equals(contactId)) {
				//AllContact.setFirstName(firstName);
				contact.get(1).setFirstName(firstName);
//				System.out.println("_____After Contact Update_____");
//				FetchContact();
			}
		}
		
		return true;
		
	}
	public static boolean UpdateContactLastName(String contactId, String lastName) {
		for(Contact AllContact: contact) {
			//System.out.println(AllContact);
			if(AllContact.getContactId().equals(contactId)) {
				contact.get(2).setLastName(lastName);
				
			}
		}
		return true;
		
	}
	
	public static boolean UpdateContactPhoneNumber(String contactId, String phoneNumber) {
		for(Contact AllContact: contact) {
			//System.out.println(AllContact);
			if(AllContact.getContactId().equals(contactId)) {
				contact.get(3).setPhoneNumber(phoneNumber);
				//contact.set(indexOf(firstName));
				//this is where i will put the update logic
				
			}
		}
		return true;
		
	}
	
	public static boolean UpdateContactAddress(String contactId, String address) {
		for(Contact AllContact: contact) {
			//System.out.println(AllContact);
			if(AllContact.getContactId().equals(contactId)) {
				contact.get(4).setAddress(address);
				
			}
		}
		return true;
	}

	

	

}
