package com.mvc.kulkkeok.model.dto;


public class BeerDto {

   private int beer_no;               	//맥주번호
   private String beer_kor_name;          //맥주 한국 이름   
   private String beer_eng_name;          //맥주 영어 이름
   private String origin_code;           //맥주 원산지 (영어)
   private String type_code;         	//맥주 종류 (영어)
   private String beer_abv;              //맥주 도수
   private String beer_detail;           //맥주 정보
   private String beer_pic;              //맥주 사진
   private String type_name; 			//맥주 종류 (한글)
   private String origin_name;			//맥주 원산지 (한글)
public BeerDto() {
	super();
	// TODO Auto-generated constructor stub
}
public BeerDto(int beer_no, String beer_kor_name, String beer_eng_name, String origin_code, String type_code,
		String beer_abv, String beer_detail, String beer_pic, String type_name, String origin_name) {
	super();
	this.beer_no = beer_no;
	this.beer_kor_name = beer_kor_name;
	this.beer_eng_name = beer_eng_name;
	this.origin_code = origin_code;
	this.type_code = type_code;
	this.beer_abv = beer_abv;
	this.beer_detail = beer_detail;
	this.beer_pic = beer_pic;
	this.type_name = type_name;
	this.origin_name = origin_name;
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
public String getBeer_eng_name() {
	return beer_eng_name;
}
public void setBeer_eng_name(String beer_eng_name) {
	this.beer_eng_name = beer_eng_name;
}
public String getOrigin_code() {
	return origin_code;
}
public void setOrigin_code(String origin_code) {
	this.origin_code = origin_code;
}
public String getType_code() {
	return type_code;
}
public void setType_code(String type_code) {
	this.type_code = type_code;
}
public String getBeer_abv() {
	return beer_abv;
}
public void setBeer_abv(String beer_abv) {
	this.beer_abv = beer_abv;
}
public String getBeer_detail() {
	return beer_detail;
}
public void setBeer_detail(String beer_detail) {
	this.beer_detail = beer_detail;
}
public String getBeer_pic() {
	return beer_pic;
}
public void setBeer_pic(String beer_pic) {
	this.beer_pic = beer_pic;
}
public String getType_name() {
	return type_name;
}
public void setType_name(String type_name) {
	this.type_name = type_name;
}
public String getOrigin_name() {
	return origin_name;
}
public void setOrigin_name(String origin_name) {
	this.origin_name = origin_name;
}
@Override
public String toString() {
	return "BeerDto [beer_no=" + beer_no + ", beer_kor_name=" + beer_kor_name + ", beer_eng_name=" + beer_eng_name
			+ ", origin_code=" + origin_code + ", type_code=" + type_code + ", beer_abv=" + beer_abv + ", beer_detail="
			+ beer_detail + ", beer_pic=" + beer_pic + ", type_name=" + type_name + ", origin_name=" + origin_name
			+ "]";
}
   
   
}
