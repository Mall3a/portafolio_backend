package com.portafolio.RestService.Controller;
//import com.portafolio.RestService.Service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
}
