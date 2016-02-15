package br.com.envia.email.builder;

import java.util.ArrayList;
import java.util.List;

public class EmailBoasVindasBuilder extends EmailBuilder{
	
	private String contato;
	
	public EmailBoasVindasBuilder(String contato){
		this.contato = contato;
	}

	@Override
	public List<String> getContatos() {
		List<String> contatos = new ArrayList<>();
		contatos.add(contato);
		return contatos;
	}

	@Override
	public String getAssunto() {
		return "Seja Bem vindo";
	}

	//Mesagem em HTML
	@Override
	public String getConteudo() {
		return "Bem vindo.";
	}
	
	
}
