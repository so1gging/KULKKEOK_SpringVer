package com.mvc.kulkkeok.model.dto;


import java.util.Date;

public class ReviewDto {

   private int review_no;              //리뷰번호
   private String review_content;      //리뷰내용
   private Date review_date;           //작성일자
   private int review_star;            //리뷰별점
   private String user_id;             //리뷰작성자
   private int beer_no;                //맥주번호
   
   
   public ReviewDto() {}


public ReviewDto(int review_no, String review_content, Date review_date, int review_star, String user_id, int beer_no) {
	super();
	this.review_no = review_no;
	this.review_content = review_content;
	this.review_date = review_date;
	this.review_star = review_star;
	this.user_id = user_id;
	this.beer_no = beer_no;
}


public int getReview_no() {
	return review_no;
}


public void setReview_no(int review_no) {
	this.review_no = review_no;
}


public String getReview_content() {
	return review_content;
}


public void setReview_content(String review_content) {
	this.review_content = review_content;
}


public Date getReview_date() {
	return review_date;
}


public void setReview_date(Date review_date) {
	this.review_date = review_date;
}


public int getReview_star() {
	return review_star;
}


public void setReview_star(int review_star) {
	this.review_star = review_star;
}


public String getUser_id() {
	return user_id;
}


public void setUser_id(String user_id) {
	this.user_id = user_id;
}


public int getBeer_no() {
	return beer_no;
}


public void setBeer_no(int beer_no) {
	this.beer_no = beer_no;
}


@Override
public String toString() {
	return "ReviewDto [review_no=" + review_no + ", review_content=" + review_content + ", review_date=" + review_date
			+ ", review_star=" + review_star + ", user_id=" + user_id + ", beer_no=" + beer_no + "]";
}

   
   
   
}
