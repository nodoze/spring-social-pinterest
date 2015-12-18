package org.springframework.social.pinterest.api;

import org.junit.Before;
import org.junit.Test;
import org.springframework.social.pinterest.api.Data;
import org.springframework.social.pinterest.api.Pins;
import org.springframework.social.pinterest.api.PinsData;
import org.springframework.social.pinterest.api.Pinterest;
import org.springframework.social.pinterest.api.impl.PinterestTemplate;
import org.springframework.social.pinterest.api.impl.UserTemplate;

public class PinsTest {

	String key = "4807113954438426320";
	String token = "AZNTDA3sbdXlTuq7EmVWV-A2Sx29FCAfWKqyZWlCtluhkKAsGwAAAAA";

	Pinterest pinterest = null;

	@Before
	public void before() {
		pinterest = new PinterestTemplate(token, key);
	}

	@Test
	public void createTest() {
		PinsData pinsData = new PinsData();
		pinsData.setBoard("174303516767217394");
		pinsData.setNote("create Test one ");
		// pinsData.setImage_base64(
		// "data:image/png;base64,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");
		pinsData.setLink("http://google.co.kr");
		pinsData.setImage("image? what?");
		Data<Pins> pin = pinterest.pinsOperations().create(pinsData);
		System.out.println(pin);
	}

	@Test
	public void deleteTest() {
		pinterest.pinsOperations().delete("174303448056164828");
	}

	@Test
	public void get() {
		Data<Pins> pin = pinterest.pinsOperations().get("174303448056164842");
		System.out.println(pin.getData().getNote());
		System.out.println(pin);
	}

}