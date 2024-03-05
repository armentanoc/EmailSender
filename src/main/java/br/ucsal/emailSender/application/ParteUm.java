package br.ucsal.emailSender.application;

import java.util.Scanner;

public class ParteUm {

	public static void executar() {
		Scanner scanner = new Scanner(System.in);
        String email;
        do {
            System.out.println("Digite os endereços de e-mail para envio (digite 'SAIR' para finalizar):");
            email = scanner.nextLine();

            // Apenas enviar o e-mail se o usuário não digitou "SAIR"
            if (!email.equalsIgnoreCase("SAIR")) {
                enviarEmail(email);
            }
            
        } while (!email.equalsIgnoreCase("SAIR"));

        System.out.println("Finalizado. Todos os e-mails foram enviados (ou pelo menos tentamos).");
	}
	
    private static void enviarEmail(String email) {
        System.out.println("Preparando para enviar e-mail para: " + email);
        try {
            // Simular o tempo de envio do e-mail
            Thread.sleep(5000);
            System.err.println("E-mail enviado com sucesso para: " + email);
        } catch (InterruptedException e) {
            System.err.println("A thread foi interrompida durante a espera.");
        }
    }
}
