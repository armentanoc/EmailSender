package br.ucsal.emailSender;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import br.ucsal.emailSender.application.ParteTres;
import br.ucsal.emailSender.infra.EmailList;

public class Main {

	public static void main(String[] args) {
		
		EmailList emailList = new EmailList();
		List<String> recipients = emailList.getEmails();
		
		// ParteUm.executar();
		// ParteDois.executar();
		ParteTres.executar();

		/*
		 * for (String recipient : recipients) { new Thread(new
		 * ParteQuatro(recipient)).start(); }
		 */

		/*
		 * ExecutorService executor = Executors.newFixedThreadPool(10);
		 * 
		 * for (String recipient : recipients) executor.execute(new
		 * ParteCinco(recipient));
		 * 
		 * executor.shutdown();
		 */
	}
}