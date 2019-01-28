package ch.sbb.tms.util;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.springframework.http.MediaType;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

/**
 * Utility class for testing REST controllers.
 */
public class TestUtil {

	/** MediaType for JSON UTF8 */
	public static final MediaType APPLICATION_JSON_UTF8 = new MediaType(MediaType.APPLICATION_JSON.getType(),
			MediaType.APPLICATION_JSON.getSubtype(), StandardCharsets.UTF_8);

	public static String convertObjectToJson(Object object) throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);

		JavaTimeModule module = new JavaTimeModule();
		mapper.registerModule(module);

		return mapper.writeValueAsString(object);
	}

	/**
	 * Verifies the equals/hashcode contract on the domain object.
	 */
	public static <T> void equalsVerifier(Class<T> clazz) throws Exception {
		T domainObject1 = clazz.getConstructor().newInstance();
		assertThat(domainObject1.toString()).isNotNull();
		assertThat(domainObject1).isEqualTo(domainObject1);
		assertThat(domainObject1.hashCode()).isEqualTo(domainObject1.hashCode());
		// Test with an instance of another class
		Object testOtherObject = new Object();
		assertThat(domainObject1).isNotEqualTo(testOtherObject);
		assertThat(domainObject1).isNotEqualTo(null);
		// Test with an instance of the same class
		T domainObject2 = clazz.getConstructor().newInstance();
		assertThat(domainObject1).isNotEqualTo(domainObject2);
		// HashCodes are equals because the objects are not persisted yet
		assertThat(domainObject1.hashCode()).isEqualTo(domainObject2.hashCode());
	}
}
