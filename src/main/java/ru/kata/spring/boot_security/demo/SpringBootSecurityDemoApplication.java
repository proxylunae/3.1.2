package ru.kata.spring.boot_security.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class SpringBootSecurityDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSecurityDemoApplication.class, args);
		PasswordEncoder encoder = new BCryptPasswordEncoder();
		String raw = "admin";
		String hash = encoder.encode(raw);
		System.out.println("Хэш: " + hash);
		System.out.println("Сравнение: " + encoder.matches("admin", hash));
	}
}
