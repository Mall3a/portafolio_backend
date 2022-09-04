package com.portafolio.RestService.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;


import java.util.Collections;
import java.util.List;
/*
    This class configures CORS, and specifies which methods are allowed
    along with which origins and headers
 */
@Configuration
public class CorsConfig {
    public CorsFilter corsFilter(){
        CorsConfiguration config = new CorsConfiguration();
        config.setAllowedOrigins(List.of("http://localhost:3000","https://g15f555dd431949-maipograndebdd.adb.sa-santiago-1.oraclecloudapps.com"));
        config.setAllowedMethods(List.of("GET","POST","PUT","OPTIONS","DELETE","PATCH"));
        config.setAllowedOrigins(Collections.singletonList("*"));
        config.addAllowedHeader("*");
        config.addExposedHeader("location");
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", config);
        CorsFilter filter = new CorsFilter(source);
        return filter;
    }

}