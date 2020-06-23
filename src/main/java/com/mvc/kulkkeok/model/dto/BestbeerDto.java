package com.mvc.kulkkeok.model.dto;

public class BestbeerDto {
	private int beer_no;
	private String beer_kor_name;
	private double beer_abv;
	private double star_avg;
	private int intStarAvg;
	private int count_review;
	private String type_name;
	private String beer_pic;
	
	public BestbeerDto() {
	}

	public BestbeerDto(int beer_no, String beer_kor_name, double beer_abv, double star_avg, int intStarAvg,
			int count_review, String type_name, String beer_pic) {
		super();
		this.beer_no = beer_no;
		this.beer_kor_name = beer_kor_name;
		this.beer_abv = beer_abv;
		this.star_avg = star_avg;
		this.intStarAvg = intStarAvg;
		this.count_review = count_review;
		this.type_name = type_name;
		this.beer_pic = beer_pic;
	}

	public int getBeer_no() {
		return beer_no;
	}

	public void setBeer_no(int beer_no) {
		this.beer_no = beer_no;
	}

	public String getBeer_kor_name() {
		return beer_kor_name;
	}

	public void setBeer_kor_name(String beer_kor_name) {
		this.beer_kor_name = beer_kor_name;
	}

	public double getBeer_abv() {
		return beer_abv;
	}

	public void setBeer_abv(double beer_abv) {
		this.beer_abv = beer_abv;
	}

	public double getStar_avg() {
		return star_avg;
	}

	public void setStar_avg(double star_avg) {
		this.star_avg = star_avg;
	}

	public int getIntStarAvg() {
		return intStarAvg;
	}

	public void setIntStarAvg(int intStarAvg) {
		this.intStarAvg = intStarAvg;
	}

	public int getCount_review() {
		return count_review;
	}

	public void setCount_review(int count_review) {
		this.count_review = count_review;
	}

	public String getType_name() {
		return type_name;
	}

	public void setType_name(String type_name) {
		this.type_name = type_name;
	}

	public String getBeer_pic() {
		return beer_pic;
	}

	public void setBeer_pic(String beer_pic) {
		this.beer_pic = beer_pic;
	}

	@Override
	public String toString() {
		return "BestbeerDto [beer_no=" + beer_no + ", beer_kor_name=" + beer_kor_name + ", beer_abv=" + beer_abv
				+ ", star_avg=" + star_avg + ", intStarAvg=" + intStarAvg + ", count_review=" + count_review
				+ ", type_name=" + type_name + ", beer_pic=" + beer_pic + "]";
	}

	
	
	
	

}
