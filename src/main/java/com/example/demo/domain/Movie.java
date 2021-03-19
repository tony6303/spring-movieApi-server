package com.example.demo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Movie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String url;
	private String title;
	private long year;
	private double rating;
	private long runtime;
	@Column(length = 100000)
	private String summary;
	private String medium_cover_image;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public long getYear() {
		return year;
	}
	public void setYear(long year) {
		this.year = year;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public long getRuntime() {
		return runtime;
	}
	public void setRuntime(long runtime) {
		this.runtime = runtime;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getMedium_cover_image() {
		return medium_cover_image;
	}
	public void setMedium_cover_image(String medium_cover_image) {
		this.medium_cover_image = medium_cover_image;
	}
	@Override
	public String toString() {
		return "Movie [id=" + id + ", url=" + url + ", title=" + title + ", year=" + year + ", rating=" + rating
				+ ", runtime=" + runtime + ", summary=" + summary + ", medium_cover_image=" + medium_cover_image + "]";
	}
	
	
}
