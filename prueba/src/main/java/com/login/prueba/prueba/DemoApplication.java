package com.login.prueba.prueba;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.authentication.OAuth2AuthenticationDetails;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@RequestMapping(value="/user")
	public User user(OAuth2Authentication principal) {

		List array = new ArrayList(((LinkedHashMap) ((UsernamePasswordAuthenticationToken) ((OAuth2Authentication) principal).getUserAuthentication()).getDetails()).values());;

		User user = new User();
		user.setId((String)array.get(0));
		user.setEmail((String)array.get(1));
		user.setCompleteName((String)array.get(3));
		user.setFirstName((String)array.get(4));
		user.setLastName((String)array.get(5));
		user.profileImage((String)array.get(6));
		user.setTokenType(((OAuth2AuthenticationDetails) principal.getDetails()).getTokenType());
		user.setTokenValue(((OAuth2AuthenticationDetails) principal.getDetails()).getTokenValue());
		return user;
	}

}
