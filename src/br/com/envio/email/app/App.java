package br.com.envio.email.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.sendgrid.SendGrid.Email;

public class App {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("Nova Menssagem");
		System.out.println("Assunto: ");
		String assunto = scn.nextLine();

		System.out.println("Destinatario: ");
		String destinatario = scn.nextLine();

		System.out.println("Mesagem: ");
		String mesagem = scn.nextLine();

		List<String> contato = new ArrayList<>();
		contato.add(destinatario);
		
		System.out.println("Deseja enviar Boas Vindas?");
		if(scn.nextLine().equalsIgnoreCase("s")){
			
		}
		
		scn.close();
	}
}
