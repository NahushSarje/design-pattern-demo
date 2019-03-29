package com.designPattern.factoryMethod;

import com.designPattern.factoryMethod.message.JSONMessage;
import com.designPattern.factoryMethod.message.Message;

/**
 * Provides implementation for creating JSON messages
 */
public class JSONMessageCreator extends MessageCreator {

	@Override
	public Message createMessage() {
		
		return new JSONMessage();
	}
	
}
