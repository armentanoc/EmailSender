package br.ucsal.emailSender.infra;

import java.util.ArrayList;
import java.util.List;

public class EmailList {
	
	private List<String> emails = new ArrayList<String>();
	
	public EmailList() {
		emails.add("armentanocarolina@gmail.com");
		emails.add("anacarolinaarmentano.silva@ucsal.edu.br");
		emails.add("testarmentanoc@gmail.com.br");
		emails.add("testearmentanoc@ucsal.edu.br");
		emails.add("testearmentanoc@hotmail.com");
	}
	
	public List<String> getEmails() {
		return this.emails;
	}
}
