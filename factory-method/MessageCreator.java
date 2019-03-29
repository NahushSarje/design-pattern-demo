package com.designPattern.factoryMethod;

import com.designPattern.factoryMethod.message.Message;

/**
 * This is our abstract "creator". 
 * The abstract method createMessage() has to be implemented by
 * its subclasses.
 * This class going to have our facory Method
 */
public abstract class MessageCreator {

	public Message getMessage() {
		
		Message message = createMessage();
		message.addDefaultHeaders();
		message.encrypt();
		
		return message;
	}
	
	// Factory Method
	protected abstract Message createMessage();
}
