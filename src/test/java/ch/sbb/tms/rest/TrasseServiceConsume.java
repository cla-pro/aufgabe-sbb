package ch.sbb.tms.rest;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

import java.io.FileNotFoundException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Objects;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestClientException;

import com.google.gson.Gson;

import ch.sbb.tms.app.GleisBelegungApp;
import ch.sbb.tms.json.TrassenAPIResponse;
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=RANDOM_PORT, classes = { GleisBelegungApp.class})
@ActiveProfiles("test")
public class TrasseServiceConsume {
	private String trassenServiceUrl = "http://nets-trassenservice-v1-test.app.ose.sbb-cloud.net/trassenservice/v1/trassen?since=-1&pageSize=1";

	@Autowired
	private TestRestTemplate restTemplate;

	@Ignore
	@Test
	public void whenDeserializingToGenericObject_thenCorrect() throws FileNotFoundException {

		ResponseEntity<String> result = null;
		TrassenAPIResponse targetObject = null;
		try {
			result = restTemplate.exchange(new URI("trassenServiceUrl"), HttpMethod.GET, createRequest(), String.class);
		} catch (RestClientException e) {
			Assert.fail();
		} catch (URISyntaxException e) {
			Assert.fail();
		}

		if (Objects.nonNull(result)) {
			targetObject = new Gson().fromJson(result.getBody(), TrassenAPIResponse.class);
		}
		Assert.assertNotNull(targetObject);
	}

	private HttpEntity<String> createRequest() {
		HttpHeaders headers = new HttpHeaders();
		headers.set(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON.toString());
		HttpEntity<String> template = new HttpEntity<>(headers);
		return template;
	}

}
