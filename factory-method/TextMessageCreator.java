package com.designPattern.factoryMethod;

import com.designPattern.factoryMethod.message.Message;
import com.designPattern.factoryMethod.message.TextMessage;

/**
 * Provides implementation for creating Text messages
 */
public class TextMessageCreator extends MessageCreator {

	@Override
	public Message createMessage() {
		
		return new TextMessage();
	}
}
