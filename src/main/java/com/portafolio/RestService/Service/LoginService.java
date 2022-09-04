package com.portafolio.RestService.Service;

import com.portafolio.RestService.Model.Usuario;
import com.portafolio.RestService.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class LoginService {
/**
    @Autowired
    private RestTemplate restTemplate;

    public String searchMovie(String name) {
        String url = "https://www.omdbapi.com/?&apikey=104b177f&s=" + name;
        return restTemplate.getForObject(url, String.class);
    }
*/
    @Autowired
    private UsuarioRepository usuarioRepository;
    public List<Usuario> findAll(){
        return usuarioRepository.findAll();
    }
}
