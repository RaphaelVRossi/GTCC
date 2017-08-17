package br.com.rvr.gtcc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.query.Jpa21Utils;

@SpringBootApplication
public class GtccApplication {

	public static void main(String[] args) {
		SpringApplication.run(GtccApplication.class, args);
	}
}
