# Envio-de-Email :envelope: 
### Esta é uma aplicação java, para envio de email usando a API sendgrid.
* Não contém telas gráficas, estou usando "System.out.println", sendo assim toda à interação será via console da IDE.
* O projeto foi organizado de forma que seja fácil de se entender. 

#### 1. br.com.envia.email.builder - :package: package contém as classes:
###### Classes que serão  responsáveis pela gestão do conteúdo de mensagem e dados do destinatário junto ao assunto do e-mail.
* EmailBoasVindasBuilder
* EmailBuilder 
* EmailPersionalizadoBuilder

#### 2. br.com.envia.email.app - :package: package contém a classe: 
###### Classe principal, nela está o conteúdo que será apresentado no console da IDE. 
* App

#### 3. br.com.envia.email.controller - :package: package contém a classe: 
###### Classe responsável por receber o código de validação da API, está classe é padrão não muda tando o seu formato.
* EmailController

```java
  
  package br.com.envio.email.controller;

import com.sendgrid.SendGrid;
import com.sendgrid.SendGrid.Email;
import com.sendgrid.SendGrid.Response;

public class EmailController {
		
	private static final String API_KEY = "código gerando dentro do portal do SENDGRID";
	
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


```
