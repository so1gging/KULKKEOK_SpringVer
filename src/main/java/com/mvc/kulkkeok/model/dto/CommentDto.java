package com.mvc.kulkkeok.model.dto;


import java.util.Date;

public class CommentDto {
	private int comment_no;
	private int post_no;
	private String board_code;
	private int group_no;
	private int group_sq;
	private String reply_id;
	private String comment_content;
	private Date comment_date;
	private String user_Id;
	
	
	
	public CommentDto() {
		super();
		// TODO Auto-generated constructor stub
	}



	public CommentDto(int comment_no, int post_no, String board_code, int group_no, int group_sq, String reply_id,
			String comment_content, Date comment_date, String user_Id) {
		super();
		this.comment_no = comment_no;
		this.post_no = post_no;
		this.board_code = board_code;
		this.group_no = group_no;
		this.group_sq = group_sq;
		this.reply_id = reply_id;
		this.comment_content = comment_content;
		this.comment_date = comment_date;
		this.user_Id = user_Id;
	}



	public int getComment_no() {
		return comment_no;
	}



	public void setComment_no(int comment_no) {
		this.comment_no = comment_no;
	}



	public int getPost_no() {
		return post_no;
	}



	public void setPost_no(int post_no) {
		this.post_no = post_no;
	}



	public String getBoard_code() {
		return board_code;
	}



	public void setBoard_code(String board_code) {
		this.board_code = board_code;
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



	public String getComment_content() {
		return comment_content;
	}



	public void setComment_content(String comment_content) {
		this.comment_content = comment_content;
	}



	public Date getComment_date() {
		return comment_date;
	}



	public void setComment_date(Date comment_date) {
		this.comment_date = comment_date;
	}



	public String getUser_Id() {
		return user_Id;
	}



	public void setUser_Id(String user_Id) {
		this.user_Id = user_Id;
	}



	@Override
	public String toString() {
		return "CommentDto [comment_no=" + comment_no + ", post_no=" + post_no + ", board_code=" + board_code
				+ ", group_no=" + group_no + ", group_sq=" + group_sq + ", reply_id=" + reply_id + ", comment_content="
				+ comment_content + ", comment_date=" + comment_date + ", user_Id=" + user_Id + "]";
	}
	
	
}