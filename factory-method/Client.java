package com.designPattern.factoryMethod;

import com.designPattern.factoryMethod.message.Message;

public class Client {

	public static void main(String[] args) {
		
		printMessage(new JSONMessageCreator());
		printMessage(new TextMessageCreator());
	}
	
	public static void printMessage(MessageCreator creator) {
		
		// Accessing Factory Method
		Message message = creator.getMessage();
		System.out.println(message.getContent());
	}
}
