/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2016.
 */

package ch.sbb.tms.rest;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import ch.sbb.tms.app.GleisBelegungApp;
import ch.sbb.tms.rest.GleisBelegungController;

/**
 * Integration tests for {@link GleisBelegungController}.
 *
 * @author
 * @since
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=RANDOM_PORT, classes = { GleisBelegungApp.class})
@ActiveProfiles("test")
public class SampleControllerITTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testBasicGet() {
        final String result = restTemplate.getForObject("/greeting", String.class);
        Assert.assertTrue(result.contains("Hallo Welt"));
    }

    @Test
    public void testBasicGetWithName() {
        final String result = restTemplate.getForObject("/greeting?name=Globi", String.class);
        Assert.assertTrue(result.contains("Hallo Globi"));
    }

}