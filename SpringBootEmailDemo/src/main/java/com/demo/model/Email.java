package com.demo.model;

public class Email {

	private String recipientEmailId;
	private String emailSubject;
	private String emailMessage;

	public String getRecipientEmailId() {
		return recipientEmailId;
	}

	public void setRecipientEmailId(String recipientEmailId) {
		this.recipientEmailId = recipientEmailId;
	}

	public String getEmailSubject() {
		return emailSubject;
	}

	public void setEmailSubject(String emailSubject) {
		this.emailSubject = emailSubject;
	}

	public String getEmailMessage() {
		return emailMessage;
	}

	public void setEmailMessage(String emailMessage) {
		this.emailMessage = emailMessage;
	}

}
