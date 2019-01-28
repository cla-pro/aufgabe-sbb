package ch.sbb.tms.rest;

import java.io.FileNotFoundException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.util.Objects;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;

import ch.sbb.tms.json.TrassenAPIResponse;
import io.micrometer.core.instrument.util.IOUtils;


public class TrasseServiceConsume {
	private String trassenServiceUrl = "http://nets-trassenservice-v1-test.app.ose.sbb-cloud.net/trassenservice/v1/trassen?since=-1&pageSize=1";
	
	private RestTemplate restTemplate; 

	@Test
	public void whenDeserializingToGenericObject_thenCorrect() throws FileNotFoundException {
		
		ResponseEntity<String> result = null;
		TrassenAPIResponse targetObject = null;
		try {
			result = restTemplate.exchange(new URI("trassenServiceUrl"), HttpMethod.GET, createRequest(), String.class);
		} catch (RestClientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// FileInputStream jsonIs = new FileInputStream("./src/test/resources/trassen_sample.json");
		// String result = IOUtils.toString(jsonIs, StandardCharsets.UTF_8);
		if(Objects.nonNull(result)) {
		targetObject = new Gson().fromJson(result.getBody(), TrassenAPIResponse.class);
		}
		Assert.assertNotNull(targetObject);

	}
	
	private HttpEntity<String> createRequest(){
		HttpHeaders headers = new HttpHeaders();
		headers.set(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON.toString());
		HttpEntity<String> template = new HttpEntity<>(headers);
		return template;
	}

}
