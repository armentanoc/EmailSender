package br.ucsal.emailSender.domain;

public class EmailContent {

	private String subject;
	private String body;
	
	public EmailContent() {
		this.subject = "Teste Assunto";
		this.body = 
				"<h1>Título Email</h1>"
				+ "<p>Conteúdo Email</p>";
	}
	

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}
}
