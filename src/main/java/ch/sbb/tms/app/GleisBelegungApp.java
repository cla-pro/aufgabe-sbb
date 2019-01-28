/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2016.
 */

package ch.sbb.tms.app;


import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.sbb.tms.model.Betriebspunkt;
import ch.sbb.tms.model.GleisBelegung;
import ch.sbb.tms.model.Standort;

/**
 * Spring boot config for the application.
 * 
 * @author fsnets20
 *
 */
@SpringBootApplication
public class GleisBelegungApp {

	GleisBelegung gleisBelegung1 = new GleisBelegung();
	
    public static void main(String[] args) {
    	
    	
        SpringApplication.run(GleisBelegungApp.class, args);
    }
    
    /**
     * 
     */
    private void setupDummyData() {
    	

    	gleisBelegung1.setTrassenId("Tressen1");
    	
    	List<Betriebspunkt> betriebspunkts = new ArrayList<>();    	
    	Betriebspunkt bp1 = new Betriebspunkt();
    	bp1.setAbkuerzung("Bern");
    	
    	Betriebspunkt bp2 = new Betriebspunkt();
    	bp2.setAbkuerzung("Zuerich");
    	
    	Betriebspunkt bp3 = new Betriebspunkt();
    	bp3.setAbkuerzung("Lusanne");
    	
    	List<Standort> standorts = new ArrayList<>();
    	Standort so1 = new Standort();
    	so1.setBetriebspunkt(bp1);
    	
    	
    	Standort so2 = new Standort();
    	Standort so3 = new Standort();
    	
    	
    	
    	
    }
}
