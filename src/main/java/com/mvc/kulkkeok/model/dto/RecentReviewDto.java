package com.mvc.kulkkeok.model.dto;

import java.util.Date;

public class RecentReviewDto {
	private String user_id;
	private String review_content;
	private String review_star;
	private String beer_kor_name;
	private Date review_date;
	private int beer_no;
	
	public RecentReviewDto() {}

	public RecentReviewDto(String user_id, String review_content, String review_star, String beer_kor_name,
			Date review_date, int beer_no) {
		super();
		this.user_id = user_id;
		this.review_content = review_content;
		this.review_star = review_star;
		this.beer_kor_name = beer_kor_name;
		this.review_date = review_date;
		this.beer_no = beer_no;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getReview_content() {
		return review_content;
	}

	public void setReview_content(String review_content) {
		this.review_content = review_content;
	}

	public String getReview_star() {
		return review_star;
	}

	public void setReview_star(String review_star) {
		this.review_star = review_star;
	}

	public String getBeer_kor_name() {
		return beer_kor_name;
	}

	public void setBeer_kor_name(String beer_kor_name) {
		this.beer_kor_name = beer_kor_name;
	}

	public Date getReview_date() {
		return review_date;
	}

	public void setReview_date(Date review_date) {
		this.review_date = review_date;
	}

	public int getBeer_no() {
		return beer_no;
	}

	public void setBeer_no(int beer_no) {
		this.beer_no = beer_no;
	}

	@Override
	public String toString() {
		return "RecentReviewDto [user_id=" + user_id + ", review_content=" + review_content + ", review_star="
				+ review_star + ", beer_kor_name=" + beer_kor_name + ", review_date=" + review_date + ", beer_no="
				+ beer_no + "]";
	}


}
