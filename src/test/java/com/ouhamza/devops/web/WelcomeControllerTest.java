package com.ouhamza.devops.web;

import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;


@WebMvcTest(WelcomeControllerTest.class)
class WelcomeControllerTest {

	private MockMvc mockmvc;
	
	@Autowired
	private WebApplicationContext webApplicationContext;
	
	@BeforeEach
	public void setUp()throws Exception{
		mockmvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	}
	
	
	@Test
	void testWelcome() throws Exception {
		mockmvc.perform( MockMvcRequestBuilders
			      .get("/"))
			      .andExpect(status().isOk());
			     // .andExpect(model().attribute("course", containsString("DevOps")));
	}

}
