package br.com.envia.email.builder;

import java.util.List;

public class EmailPersionalizadoBuilder extends EmailBuilder {
	
	private String assunto;
	private String conteudo;
	private List<String> contatos;
	
	public EmailPersionalizadoBuilder (String assunto, String conteudo, List<String>contatos){
		this.assunto = assunto;
		this.conteudo = conteudo;
		this.contatos = contatos;
	}

	@Override
	public List<String> getContatos() {
		// TODO Auto-generated method stub
		return contatos;
	}

	@Override
	public String getAssunto() {
		// TODO Auto-generated method stub
		return assunto;
	}

	@Override
	public String getConteudo() {
		// TODO Auto-generated method stub
		return conteudo;
	}
	
		
}
