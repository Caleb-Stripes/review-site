package org.wecancodeit;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest(ReviewController.class)
public class ReviewControllerMockMVCTest {

	@Autowired
	private MockMvc mockMvc;
	// fake user object grabbing end points in our application

	@Test
	public void shouldGetStatusOfOkWhenNavigatingToAllReviews() throws Exception {
		this.mockMvc.perform(get("/show-reviews")).andExpect(status().isOk())
				.andExpect(view().name("reviews-template"));
	}

	@Test
	public void shouldGetStatusOfOkWhenNavigatingToSingleReviewPage() throws Exception {
		this.mockMvc.perform(get("/show-single-review")).andExpect(status().isOk())
				.andExpect(view().name("review-single-template"));
	}

}
