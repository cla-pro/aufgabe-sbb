package ch.sbb.tms.rest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

import org.aspectj.weaver.StandardAnnotation;
import org.junit.Test;

import com.google.gson.Gson;

import ch.sbb.tms.json.Trassen;
import ch.sbb.tms.json.TrassenAPIResponse;
import io.micrometer.core.instrument.util.IOUtils;

public class TrasseServiceConsume {

	@Test
	public void whenDeserializingToGenericObject_thenCorrect() throws FileNotFoundException {

		FileInputStream jsonIs = new FileInputStream("./src/test/resources/trassen_sample.json");
		String result = IOUtils.toString(jsonIs, StandardCharsets.UTF_8);

		TrassenAPIResponse targetObject = new Gson().fromJson(result, TrassenAPIResponse.class);
		new Object();

	}

}
