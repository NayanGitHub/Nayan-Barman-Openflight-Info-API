package com.flights.info.rest.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

@ApiIgnore
@RestController
public class BasicErrorController implements ErrorController {
	
	@RequestMapping("/error")
    public String handleError() {
        
        return "error";
    }
 
    @Override
    public String getErrorPath() {
    	
        return "/error";
    }

}
