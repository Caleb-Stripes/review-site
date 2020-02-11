package org.wecancodeit;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import javax.annotation.Resource;

import org.junit.jupiter.api.Test;

class RepositoryTest {
	
	@Resource
	private Repository underTest;
		
	@Test
	public void putMethodShouldAddToRepository() {
		Review reviewOne = new Review(1, "route name", 5.10, "route type", "description");
		underTest = new Repository(reviewOne);
		Review foundReview = underTest.findOneRoute(1);
		assertThat(foundReview, is(reviewOne));
	}

}
