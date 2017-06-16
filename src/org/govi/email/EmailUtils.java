package org.govi.email;

import javax.json.Json;
import javax.json.JsonObject;
import javax.mail.internet.InternetAddress;

public class EmailUtils {
	
	public static String parseEmailAddress(InternetAddress emailAddress){
		
		/**
		 * Email address can be in one of the following forms:
		 * "Govind Avireddi <avgovind@gmail.com>;"
		 * "govind.avireddi@gmail.com;"
		 * The resulting JSON output should have name and address as seperate items
		 */
		

		// sometimes getPersonal() can return null but .add() wont take null params.
		JsonObject jsonData = Json.createObjectBuilder()
				.add("Name", new String(emailAddress.getPersonal() + ""))
				.add("Address", new String(emailAddress.getAddress() + ""))
				.build();
		
		
		return jsonData.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
