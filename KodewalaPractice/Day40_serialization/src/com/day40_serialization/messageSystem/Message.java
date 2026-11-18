package com.day40_serialization.messageSystem;

import java.io.Serializable;

public class Message implements Serializable {

	private String messageId;
	private String message;
	private String sender;

	public Message(String messageId, String message, String sender) {

		this.messageId = messageId;
		this.message = message;
		this.sender = sender;
	}

	public String getMessageId() {
		return messageId;
	}

	public String getMessage() {
		return message;
	}

	public String getSender() {
		return sender;
	}
}