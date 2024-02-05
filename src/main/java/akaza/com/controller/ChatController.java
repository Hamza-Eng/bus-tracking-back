package akaza.com.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
@RestController
@RequestMapping("")
public class ChatController {
	@GetMapping("")
	private String home() {
		return "hello from hamza";
	}
//
//	@MessageMapping("/chat.register")
//	@SendTo("/topic/public")
//	public BusStatue register(@Payload BusStatue chatMessage, SimpMessageHeaderAccessor headerAccessor) {
//		headerAccessor.getSessionAttributes().put("username", chatMessage.getSender());
//		return chatMessage;
//	}
//
//	@MessageMapping("/chat.send")
//	@SendTo("/topic/public")
//	public BusStatue sendMessage(@Payload BusStatue chatMessage) {
//		return chatMessage;
//	}
}