package br.ucsal.emailSender.application;
import java.util.List;

import br.ucsal.emailSender.domain.*;

public class ParteTres {

	static String host = "smtp.gmail.com";
	static String username = "testarmentanoc@gmail.com";
	static String password = "nkjm adoj exkt abkv";
	// app password specifically to EmailSender
	
	public static void executar(List<String> emailList) {
		EmailManager emailManager = new br.ucsal.emailSender.domain.EmailManager(host, username, password);
		emailManager.enviarEmails(emailList);
	}

	public static void executar() {

		EmailManager emailManager = new EmailManager(host, username, password);
		emailManager.coletarEmails();
		emailManager.enviarEmails();
	}
}
