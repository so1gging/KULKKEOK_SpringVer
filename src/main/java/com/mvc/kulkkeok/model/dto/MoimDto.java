package com.mvc.kulkkeok.model.dto;

import java.util.Date;

	public class MoimDto{
		private int moim_no;
		private String moim_title;
		private String moim_content;
		private java.sql.Date moim_writedate; //작성날짜
		private java.sql.Date moim_date; //모임일자
		private String moim_placename;
		private String moim_placeadd;
		private String category_code;
		private String moimStatus; //종료여부
		private String user_id;
   
		public MoimDto() {}

		public MoimDto(int moim_no, String moim_title, String moim_content, java.sql.Date moim_writedate,
				java.sql.Date moim_date, String moim_placename, String moim_placeadd, String category_code,
				String moimStatus, String user_id) {
			super();
			this.moim_no = moim_no;
			this.moim_title = moim_title;
			this.moim_content = moim_content;
			this.moim_writedate = moim_writedate;
			this.moim_date = moim_date;
			this.moim_placename = moim_placename;
			this.moim_placeadd = moim_placeadd;
			this.category_code = category_code;
			this.moimStatus = moimStatus;
			this.user_id = user_id;
		}

		public int getMoim_no() {
			return moim_no;
		}

		public void setMoim_no(int moim_no) {
			this.moim_no = moim_no;
		}

		public String getMoim_title() {
			return moim_title;
		}

		public void setMoim_title(String moim_title) {
			this.moim_title = moim_title;
		}

		public String getMoim_content() {
			return moim_content;
		}

		public void setMoim_content(String moim_content) {
			this.moim_content = moim_content;
		}

		public java.sql.Date getMoim_writedate() {
			return moim_writedate;
		}

		public void setMoim_writedate(java.sql.Date moim_writedate) {
			this.moim_writedate = moim_writedate;
		}

		public java.sql.Date getMoim_date() {
			return moim_date;
		}

		public void setMoim_date(java.sql.Date moim_date) {
			this.moim_date = moim_date;
		}

		public String getMoim_placename() {
			return moim_placename;
		}

		public void setMoim_placename(String moim_placename) {
			this.moim_placename = moim_placename;
		}

		public String getMoim_placeadd() {
			return moim_placeadd;
		}

		public void setMoim_placeadd(String moim_placeadd) {
			this.moim_placeadd = moim_placeadd;
		}

		public String getCategory_code() {
			return category_code;
		}

		public void setCategory_code(String category_code) {
			this.category_code = category_code;
		}

		public String getMoimStatus() {
			return moimStatus;
		}

		public void setMoimStatus(String moimStatus) {
			this.moimStatus = moimStatus;
		}

		public String getUser_id() {
			return user_id;
		}

		public void setUser_id(String user_id) {
			this.user_id = user_id;
		}

		@Override
		public String toString() {
			return "MoimDto [moim_no=" + moim_no + ", moim_title=" + moim_title + ", moim_content=" + moim_content
					+ ", moim_writedate=" + moim_writedate + ", moim_date=" + moim_date + ", moim_placename="
					+ moim_placename + ", moim_placeadd=" + moim_placeadd + ", category_code=" + category_code
					+ ", moimStatus=" + moimStatus + ", user_id=" + user_id + "]";
		}

		
   
   
}