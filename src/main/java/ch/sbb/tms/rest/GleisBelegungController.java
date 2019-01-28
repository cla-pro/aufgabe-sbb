/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2016.
 */

package ch.sbb.tms.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import ch.sbb.tms.model.GleisBelegung;

/**
 * Simple REST controller with Spring MVC. For a more complete REST sample refer
 * to <a href="https://code.sbb.ch/projects/KD_ESTA/repos/esta-cloud-demo-customer/browse/src/main/java/ch/sbb/esta/cloud/controller/CustomerController.java">CustomerController.java</a>
 *
 * @author ue64007 (Manuel Wallrapp), generated by ESTA Initializr
 * @since 1.0.0, 2017.
 */
@RestController
@CrossOrigin
public class GleisBelegungController {
 
	private String trassenServiceUrl = "http://nets-trassenservice-v1-test.app.ose.sbb-cloud.net/trassenservice/v1/trassen?since=-1&pageSize=1";
	
	private RestTemplate restTemplate; 
	
	@Autowired
	public GleisBelegungController(RestTemplate template) {
		this.restTemplate = template;
	}
	
	
    /**
     * 
     * @param name
     * @return
     */
    @RequestMapping(value="/greeting", method= RequestMethod.GET)
    public ResponseEntity<GleisBelegung> getGreeting(
    		@RequestParam(value = "an", required = true) String an, 
    		@RequestParam(value = "ab", required = true) String ab,
    		@RequestParam(value = "abkuerzung", required = true) String abkuerzung) {
    	
    	GleisBelegung gleisBelegung = new GleisBelegung();
        return new ResponseEntity<>(gleisBelegung, HttpStatus.OK);
    }
}
