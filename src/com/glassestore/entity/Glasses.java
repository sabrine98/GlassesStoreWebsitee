package com.glassestore.entity;
// Generated 9 juin 2020 15:44:55 by Hibernate Tools 5.3.16.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Glasses generated by hbm2java
 */
public class Glasses implements java.io.Serializable {

	private int glassesId;
	private Category category;
	private String title;
	private String description;
	private byte[] image;
	private float price;
	private Date publishDate;
	private Date lastUpdateTime;
	private Set orderDetails = new HashSet(0);
	private Set reviews = new HashSet(0);

	public Glasses() {
	}

	public Glasses(int glassesId, Category category, String title, String description, byte[] image, float price,
			Date publishDate, Date lastUpdateTime) {
		this.glassesId = glassesId;
		this.category = category;
		this.title = title;
		this.description = description;
		this.image = image;
		this.price = price;
		this.publishDate = publishDate;
		this.lastUpdateTime = lastUpdateTime;
	}

	public Glasses(int glassesId, Category category, String title, String description, byte[] image, float price,
			Date publishDate, Date lastUpdateTime, Set orderDetails, Set reviews) {
		this.glassesId = glassesId;
		this.category = category;
		this.title = title;
		this.description = description;
		this.image = image;
		this.price = price;
		this.publishDate = publishDate;
		this.lastUpdateTime = lastUpdateTime;
		this.orderDetails = orderDetails;
		this.reviews = reviews;
	}

	public int getGlassesId() {
		return this.glassesId;
	}

	public void setGlassesId(int glassesId) {
		this.glassesId = glassesId;
	}

	public Category getCategory() {
		return this.category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public byte[] getImage() {
		return this.image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public float getPrice() {
		return this.price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Date getPublishDate() {
		return this.publishDate;
	}

	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}

	public Date getLastUpdateTime() {
		return this.lastUpdateTime;
	}

	public void setLastUpdateTime(Date lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}

	public Set getOrderDetails() {
		return this.orderDetails;
	}

	public void setOrderDetails(Set orderDetails) {
		this.orderDetails = orderDetails;
	}

	public Set getReviews() {
		return this.reviews;
	}

	public void setReviews(Set reviews) {
		this.reviews = reviews;
	}

}
