package akaza.com;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import akaza.com.entity.Adresse;
import akaza.com.entity.Bus;
import akaza.com.repository.AdresseRepository;
import akaza.com.repository.BusRepository;

@SpringBootApplication
public class BusTrackingApplication {

	public static void main(String[] args) {
		SpringApplication.run(BusTrackingApplication.class, args);
	}

	@Bean
	CommandLineRunner start(BusRepository busrepo, AdresseRepository adresseRepo) {
		return arg -> {
			busrepo.save(Bus.builder().Number("K321").address(null).build());
		};

	}

}
