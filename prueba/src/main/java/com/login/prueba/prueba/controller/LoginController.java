package com.login.prueba.prueba.controller;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import com.login.prueba.prueba.User;
import com.login.prueba.prueba.utils.ApiResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.authentication.OAuth2AuthenticationDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * LoginController
 */
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class LoginController {

    @Autowired
    private RestTemplateBuilder restTemplate;

    @RequestMapping(value="/userLogin")
	public ApiResponse user(OAuth2Authentication principal) {

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
        
        ApiResponse responseLogin = getTokenLogin(user.getEmail());
		
		return responseLogin;
    }

    public ApiResponse getTokenLogin(String email) {
        return restTemplate.build().postForObject("http://localhost:9002/user/login/google/"+email, null, ApiResponse.class);
    }
    
}