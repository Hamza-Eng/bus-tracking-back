package akaza.com.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {
	@Configuration
	@EnableWebSocketMessageBroker
	public class WebSocketConfiguration implements WebSocketMessageBrokerConfigurer {
// this project will hep very much : https://github.com/dailycodebuffer/Spring-MVC-Tutorials/tree/master/spring-websocket
// and youtube :  https://www.youtube.com/watch?v=n6ZqOwreFTA
		@Override
		public void registerStompEndpoints(StompEndpointRegistry registry) {
			registry.addEndpoint("/stomp-endpoint").withSockJS();
		}

		@Override
		public void configureMessageBroker(MessageBrokerRegistry registry) {
			registry.enableSimpleBroker("/topic");
			registry.setApplicationDestinationPrefixes("/app");

		}

	}
}