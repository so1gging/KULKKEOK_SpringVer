package com.mvc.kulkkeok.model.dto;

import java.util.Date;

public class MoimCommentDto {

	private int mm_no;
	private String mm_content;
	private Date mm_date;
	private int group_no;
	private int group_sq;
	private String reply_id;
	private String user_id;
	private int moim_no;
	
	public MoimCommentDto() {}

	public MoimCommentDto(int mm_no, String mm_content, Date mm_date, int group_no, int group_sq, String reply_id,
			String user_id, int moim_no) {
		super();
		this.mm_no = mm_no;
		this.mm_content = mm_content;
		this.mm_date = mm_date;
		this.group_no = group_no;
		this.group_sq = group_sq;
		this.reply_id = reply_id;
		this.user_id = user_id;
		this.moim_no = moim_no;
	}

	public int getMm_no() {
		return mm_no;
	}

	public void setMm_no(int mm_no) {
		this.mm_no = mm_no;
	}

	public String getMm_content() {
		return mm_content;
	}

	public void setMm_content(String mm_content) {
		this.mm_content = mm_content;
	}

	public Date getMm_date() {
		return mm_date;
	}

	public void setMm_date(Date mm_date) {
		this.mm_date = mm_date;
	}

	public int getGroup_no() {
		return group_no;
	}

	public void setGroup_no(int group_no) {
		this.group_no = group_no;
	}

	public int getGroup_sq() {
		return group_sq;
	}

	public void setGroup_sq(int group_sq) {
		this.group_sq = group_sq;
	}

	public String getReply_id() {
		return reply_id;
	}

	public void setReply_id(String reply_id) {
		this.reply_id = reply_id;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public int getMoim_no() {
		return moim_no;
	}

	public void setMoim_no(int moim_no) {
		this.moim_no = moim_no;
	}

	@Override
	public String toString() {
		return "MoimCommentDto [mm_no=" + mm_no + ", mm_content=" + mm_content + ", mm_date=" + mm_date + ", group_no="
				+ group_no + ", group_sq=" + group_sq + ", reply_id=" + reply_id + ", user_id=" + user_id + ", moim_no="
				+ moim_no + "]";
	}

	
	

}
