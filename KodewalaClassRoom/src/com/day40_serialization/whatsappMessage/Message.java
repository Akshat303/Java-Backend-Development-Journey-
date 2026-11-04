package com.day40_serialization.whatsappMessage;

import java.io.Serializable;

public class Message implements Serializable {
	
//	private static final long serialVwesionUID =1L;

	private String messageId;
	private String message;

	public Message(String messageId, String message) {
		super();
		this.messageId = messageId;
		this.message = message;
	}

	public String getMessageId() {
		return messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Message [messageId=" + messageId + ", message=" + message + "]";
	}
}
