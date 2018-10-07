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

import com.diligitis.api.entity.Usuario;
import com.diligitis.api.repository.UsuarioRepository;

@RestController
@RequestMapping("/diligitis")
public class UsuarioEndPoint {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(method = RequestMethod.GET, value="/usuarios" ,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Usuario> getUsuarios() {

		List<Usuario> usuarios = new ArrayList<Usuario>();
		
		try {
			
			usuarios = usuarioRepository.findAll();
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
        
        return usuarios;

    }

}
