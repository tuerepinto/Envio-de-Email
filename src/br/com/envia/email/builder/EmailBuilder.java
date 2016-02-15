package br.com.envia.email.builder;

import java.util.List;

import com.sendgrid.SendGrid.Email;

public abstract class EmailBuilder {

	public abstract List<String> getContatos();

	public abstract String getAssunto();

	public abstract String getConteudo();

	public Email build(){
		
		Email email = new Email();
		email.setSubject(getAssunto());
		email.setFrom("tuerepinto@gmail.com");
		email.setHtml(getConteudo());
		
		for (String contato : getContatos()){
			email.addTo(contato);
		}
		
		return email;
	}

}
