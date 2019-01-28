/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2016.
 */

package ch.sbb.tms.app;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring boot config for the application.
 * 
 * @author fsnets20
 *
 */
@SpringBootApplication
public class GleisBelegungApp {

    public static void main(String[] args) {
        SpringApplication.run(GleisBelegungApp.class, args);
    }
}
