package net.tecgurus.app;

import net.tecgurus.model.User;

public class App {

	public static void main(String[] args) {
		User user = new User();
		user.setFirstName("Florentino");
		user.setLastName("Salazar");
		
		System.out.println("Created User: " + user.getFullName() + " First name: " + user.getFirstName() + " Last name: " + user.getLastName());
	}

}
