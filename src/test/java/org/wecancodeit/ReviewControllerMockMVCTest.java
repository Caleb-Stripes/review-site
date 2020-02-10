package org.wecancodeit;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(ReviewController.class)

public class ReviewControllerMockMVCTest {

	@Autowired
	private MockMvc mockMvc;
	//fake user object grabbing end points in our app
	
	@Test
	public void shouldGetStatusOfOkWhenNavigatingToAllCourses() throws Exception {
		this.mockMvc.perform(get("/show-reviews")).andExpect(status().isOk());
	}
	
}
