package com.glassestoredb.entity2;
// Generated 21 juin 2020 11:00:46 by Hibernate Tools 5.3.16.Final

import java.util.Date;

/**
 * Review generated by hbm2java
 */
public class Review implements java.io.Serializable {

	private int reviewId;
	private Customer customer;
	private Glasses glasses;
	private int rating;
	private String headline;
	private String comment;
	private Date reviewTime;

	public Review() {
	}

	public Review(int reviewId, Customer customer, Glasses glasses, int rating, String headline, String comment,
			Date reviewTime) {
		this.reviewId = reviewId;
		this.customer = customer;
		this.glasses = glasses;
		this.rating = rating;
		this.headline = headline;
		this.comment = comment;
		this.reviewTime = reviewTime;
	}

	public int getReviewId() {
		return this.reviewId;
	}

	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Glasses getGlasses() {
		return this.glasses;
	}

	public void setGlasses(Glasses glasses) {
		this.glasses = glasses;
	}

	public int getRating() {
		return this.rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getHeadline() {
		return this.headline;
	}

	public void setHeadline(String headline) {
		this.headline = headline;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Date getReviewTime() {
		return this.reviewTime;
	}

	public void setReviewTime(Date reviewTime) {
		this.reviewTime = reviewTime;
	}

}
