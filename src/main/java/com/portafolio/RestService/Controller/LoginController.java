package com.portafolio.RestService.Controller;
import com.portafolio.RestService.Model.Usuario;
import com.portafolio.RestService.Service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class LoginController {
 /**
  @Autowired
  MovieService movieService;

  @GetMapping("/searchMovie")
  public String searchMovie(@RequestParam String name){
  return movieService.searchMovie(name);
  }
  */

 @Autowired
 private LoginService loginService;

 @GetMapping(value = "/usuarios")
 public List<Usuario> getAllUsers(){
   return loginService.findAll();
 }
}
