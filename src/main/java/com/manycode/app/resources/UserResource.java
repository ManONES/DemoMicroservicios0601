package com.manycode.app.resources;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import com.manycode.app.model.User;

@RestController
public class UserResource {
	private static Logger LOG = LoggerFactory.getLogger(UserResource.class);
	
    @Autowired
    WebClient.Builder webClientBuilder;  

    @RequestMapping("/user/{userId}")
    public User getUserRatings(@PathVariable("userId") String userId) {
//    	int iii = 0;
    	//		for (int ii = 0; ii < 2; ii++) {
    	//	        while (true) {
    	//			    iii =getRandomNumberInRange(1000, 2000);
    	//			    LOG.info("intento:" + iii);
    	//	            if (iii==1974) { break;}
    	//	        }
    	//		}
		
    	int iv = 0;
		for (int ii = 0; ii < 1000; ii++) {
	       
			    iv = iv + Integer.valueOf(iniciodos());
			    LOG.info("intento:" + ii);
	           
	       
		}       
				
    	
        User userRating2 = new User();
        userRating2.initData(userId + "::" + iv);
        return userRating2;
    }
    
    public String iniciodos() {
    	//UserRating userRating = webClientBuilder.build().get().uri("http://demo-microservicios-7-git-hola.apps.us-west-1.starter.openshift-online.com/user/MANYTHREE")
    	User userRating = webClientBuilder.build().get().uri("http://app0602-testpost01.apps.us-west-1.starter.openshift-online.com/user/MANYTHREE")
    			.retrieve().bodyToMono(User.class).block();          
    	return (userRating.getUserId());    	
    }
      
    
    @GetMapping(value ="/testdestino")
	public String welcome() {
		return "Hola al mundo de Many  con  microservicios 1841";
	}	
    
	private static int getRandomNumberInRange(int min, int max) {
		
		Random r = new Random();
		return r.ints(min, (max + 1)).limit(1).findFirst().getAsInt();
		
	}	
}
