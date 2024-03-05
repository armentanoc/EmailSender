package br.ucsal.emailSender.application;

public class ParteCinco implements Runnable {

	private String recipient;
	
	 public ParteCinco(String recipient) {
	        this.recipient = recipient;
	    }

	@Override
	public void run() {
		System.out.println("Preparando para enviar e-mail para: " + this.recipient);
		try {
			Thread.sleep(500);
			System.err.println("\u001B[32mE-mail enviado com sucesso para: " + this.recipient + "\u001B[0m");
		} catch (InterruptedException e) {
			System.err.println("A thread foi interrompida durante a espera.");
		}
	}
}
