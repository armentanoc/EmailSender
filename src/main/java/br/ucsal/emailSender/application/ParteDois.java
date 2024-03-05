package br.ucsal.emailSender.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ParteDois {

	public static void executar() {
		ArrayList emailList = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		
        String email;
        do {
            System.out.println("Digite os endereços de e-mail para envio (digite 'SAIR' para finalizar):");
            email = sc.nextLine();

            // Apenas enviar o e-mail se o usuário não digitou "SAIR"
            if (!email.equalsIgnoreCase("SAIR")) {
            	emailList.add(email);
            }
            
        } while (!email.equalsIgnoreCase("SAIR"));
        
		enviarEmails(emailList);
		System.out.println("Finalizado. Todos os e-mails foram enviados (ou pelo menos tentamos).");
	}

	private static void enviarEmails(List<String> listaEmails) {
		for (String email : listaEmails) {
			enviarEmail(email);
		}
	}

	private static void enviarEmail(String email) {
		System.out.println("Preparando para enviar e-mail para: " + email);
		try {
			Thread.sleep(5000);
			System.err.println("E-mail enviado com sucesso para: " + email);
		} catch (InterruptedException e) {
			System.err.println("A thread foi interrompida durante a espera.");
		}
	}
}