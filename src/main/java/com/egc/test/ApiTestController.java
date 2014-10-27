package com.egc.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import domain.Voto;

@RestController
public class ApiTestController {
   
   

    @RequestMapping("/welcome")
    public String welcome(@RequestParam(value="name", required=false, defaultValue="people") String name) {
    	 String welcome="Hello "+name+", welcome to our API Test, yours can use this URL for get your name in the sentence:"
    	 		+ " http://localhost:8080/test/welcome?name=YourName";
    	 
    	 return welcome;
    }
    
    @RequestMapping("/test")
    public Voto test(@RequestParam(value="name", required=false, defaultValue="John Dou") String name) {
    	 Voto voto = new Voto();
    	 voto.setNombre(name);
    	 voto.setEdad(35);
    	 voto.setPoblacion("Sevilla");
    	 
    	 return voto;
    }
    
}