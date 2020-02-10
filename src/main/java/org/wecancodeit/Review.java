package org.wecancodeit;

public class Review {

	private long id;
	private String title;
	private String category;
	private String content;
	private double grade;

	public Review(long id, String title, double grade, String category, String content) {
		this.id = id;
		this.title = title;
		this.category = category;
		this.content = content;
		this.grade = grade;
	}

	public long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getCategory() {
		return category;
	}

	public String getContent() {
		return content;
	}

	public double getGrade() {
		return grade;
	}
	
	
}
