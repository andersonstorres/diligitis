package com.diligitis.api.endpoint;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.diligitis.api.entity.User;
import com.diligitis.api.repository.UserRepository;

@RestController
@RequestMapping("/diligitis")
public class UserEndPoint {
	
	@Autowired
	private UserRepository userRepository;
	
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(method = RequestMethod.GET, value="/users" ,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<User> getUsers() {

		List<User> users = new ArrayList<User>();
		
		try {
			
			users = userRepository.findAll();
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
        
        return users;

    }

}