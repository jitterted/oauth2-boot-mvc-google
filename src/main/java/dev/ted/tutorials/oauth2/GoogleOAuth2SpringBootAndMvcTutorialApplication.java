package dev.ted.tutorials.oauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;

@EnableOAuth2Sso
@SpringBootApplication
public class GoogleOAuth2SpringBootAndMvcTutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoogleOAuth2SpringBootAndMvcTutorialApplication.class, args);
	}

}
