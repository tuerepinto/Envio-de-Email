package br.com.envio.email.controller;

import com.sendgrid.SendGrid;
import com.sendgrid.SendGrid.Email;
import com.sendgrid.SendGrid.Response;

public class EmailController {
		
	private static final String API_KEY = 
			"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";
	
	public static void SendEmail (Email email){
		try {
			
			SendGrid sdg = new SendGrid(API_KEY);
			Response response = sdg.send(email);
			System.out.println(response.getMessage());
			
		} catch (Exception ex) {
			System.err.println(ex.getMessage());
		}
	}

}
