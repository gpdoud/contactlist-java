package maxtrain.gregdoud;

public class Mainline {
	
	private ContactList contacts = new ContactList();

	private void add() {
		String firstName = Console.getString("Enter first name : ");
		String lastName = Console.getString("Enter last name  : ");
		String email = Console.getString("Enter email      : ");
		String phone = Console.getString("Enter phone      : ");
		
		String msg = "FirstName: " + firstName;
		msg += ", LastName: " + lastName;
		msg += ", Email: " + email;
		msg += ", Phone: " + phone;
		
		print(msg);
		
		Contact contact = new Contact(firstName, lastName, email, phone);
		contacts.add(contact);
		print("Added contact. We have " + contacts.size() + " contact(s).");
	}
	
	private void run() {
		print("Welcome to the Contact List Application");
		int response = 0;
		boolean done = false;
		while(!done) {
			response = Console.getInt("Enter option (1): ");
			switch(response) {
				case 0: done = true; break;
				case 1: add(); break;
			}
		}
		print("Done ...");
	}
	
	public void print(String message) {
		System.out.println(message);
	}
	
	public static void main(String[] args) {
		(new Mainline()).run();
	}

}
