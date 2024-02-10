package akaza.com.app;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

import ch.qos.logback.core.net.server.Client;

@Controller
public class GreetingController {

	@MessageMapping("/hello")
	@SendTo("/topic/greetings") //Client subscribeClient in this topic
	public Greeting greeting(HelloMessage message) throws Exception {
		Thread.sleep(1000); // simulated delay
		System.out.println("name : " + message.getName());
		return new Greeting("Hello, " + HtmlUtils.htmlEscape(message.getName()) + "!");
	}

}
