package akaza.com.configuration;

import java.io.IOException;

import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.client.WebSocketClient;
import org.springframework.web.socket.client.standard.StandardWebSocketClient;
import org.springframework.web.socket.handler.TextWebSocketHandler;
import org.springframework.web.socket.messaging.WebSocketStompClient;

public class WebSocketHandler extends TextWebSocketHandler {
	@Override
	public void handleMessage(WebSocketSession session, WebSocketMessage<?> message) throws IOException {
// Handle incoming messages here
		String receivedMessage = (String) message.getPayload();
// Process the message and send a response if needed
		session.sendMessage(new TextMessage("Received: " + receivedMessage));
		System.out.println("received  : "+receivedMessage);
	}

	@Override
	public void afterConnectionEstablished(WebSocketSession session) {
System.out.println("Connection Established :)");
	}

	@Override
	public void afterConnectionClosed(WebSocketSession session, CloseStatus status) {
// Perform actions when a WebSocket connection is closed
	}
	private void sendmessage() {
		WebSocketClient client=new StandardWebSocketClient();
		WebSocketStompClient stompClient=new WebSocketStompClient(client);
	}
}