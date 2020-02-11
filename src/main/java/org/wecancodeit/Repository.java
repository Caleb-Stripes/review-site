package org.wecancodeit;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Repository {

	private Map<Long, Review> routeList = new HashMap<>();
	//private Review twinky = new Review(1, "Twinky", 5.12, "Sport", "Steepest climb in the RRG.");

	public Repository(Review... reviews) {
		for (Review review : reviews) {
			routeList.put(review.getId(), review);
		}
	}
	
	private long newId;
	private long generateNewId() {
		newId++;
		return newId;
	}

	public void addReview(long id, Review review) {
		routeList.put(generateNewId(), review);
	}
	
	public Review findOneRoute(long id) {
		return routeList.get(id);
	}

	public Collection<Review> findAllReviews() {
		return routeList.values();
	}

}