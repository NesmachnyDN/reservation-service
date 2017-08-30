package com.example.reservationservice;

import java.util.stream.Stream;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ReservationServiceApplication {
    @Bean
    CommandLineRunner commandLineRunner(ReservationRepository reservationRepository){
        return Strings  -> {
            Stream.of("Дмитрий", "Семен", "Михалыч", "Валера","Кирил", "Себастьян", "Матеус", "Нео")
                    .forEach(n -> reservationRepository.save(new Reservation(n)));
            };
    }

	public static void main(String[] args) {
		SpringApplication.run(ReservationServiceApplication.class, args);
	}
}
