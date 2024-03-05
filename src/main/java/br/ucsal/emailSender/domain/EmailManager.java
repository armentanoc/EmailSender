package br.ucsal.emailSender.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.apache.commons.validator.routines.EmailValidator;

public class EmailManager {

	private List<String> listaEmails = new ArrayList<>();
	private final Scanner sc = new Scanner(System.in);
	
	private EmailContent emailContent;
	private EmailSender emailSender;
	private String host;
	private String username;
	private String password;
	
	public EmailManager(String host, String username, String password) {
		
		this.host = host;
		this.username = username;
		this.password = password;
		this.emailSender = new EmailSender(this.host, this.username, this.password);
		this.emailContent = new EmailContent();
	 
	}

	public void coletarEmails() {

		String email;

		do {
			System.out.println("Digite os enderecos de e-mail para envio (digite 'SAIR' para finalizar):");
			email = sc.nextLine();
			if (!email.equalsIgnoreCase("SAIR")) {
				if (EmailValidator.getInstance().isValid(email)) {
					this.listaEmails.add(email);
                } else {
                    System.err.println("Email invalido. Tente novamente.");
                }
			}

		} while (!email.equalsIgnoreCase("SAIR"));
	}

	public void enviarEmails() {
		for (String email : this.listaEmails) {
			this.emailSender.sendEmail(email, this.emailContent);
		}
	}
	
	public void enviarEmails(List<String> externalEmailList) {
		this.listaEmails = externalEmailList;
		enviarEmails();
	}
}
