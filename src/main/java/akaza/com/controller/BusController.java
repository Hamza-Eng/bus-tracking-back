package akaza.com.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.persistence.criteria.Path;

@RestController
@RequestMapping("bus")
public class BusController {

	@MessageMapping("/hello")//Path : app/hello 
	@SendTo("/topic/greetings")
	public String greet(String message) throws InterruptedException {
		Thread.sleep(2000);
		return "hello from hamza";
	}
//	@MessageMapping("/bus")
//	@SendTo("/topic/Bus")
//	public Bus register(@Payload Bus chatMessage, SimpMessageHeaderAccessor headerAccessor) {
//		headerAccessor.getSessionAttributes().put("username", "hamza test sender name");
//		return chatMessage;
//	}
//
//	@MessageMapping("/updateBusLocation")
//	@SendTo("/topic/BusLocation")
//	public Bus updateLocation(@Payload Bus bus) {
//		return bus;
//	}
//
//	@MessageMapping("/bus")
//	@SendTo("/topic/public")
//	public Bus sendMessage(@Payload Bus chatMessage) {
//		return chatMessage;
//	}
//
//	@Autowired
//	private BusRepository repository;
//
//	@GetMapping("")
//	private String ping() {
//		return "hello from bus controller ";
//	}

}