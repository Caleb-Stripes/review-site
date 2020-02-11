package org.wecancodeit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReviewController {

	
	
	
	@GetMapping("/show-reviews")
	public String findAllReviews() {
		return "reviews-template"; 
//spring knows to go to src/main/resources/templates + name of template given + .html, with the information given
	}
	
	@GetMapping("/show-single-review")
	public String findOneReview() {
		return "review-template";
	}
}
