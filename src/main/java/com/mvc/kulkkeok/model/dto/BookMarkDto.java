package com.mvc.kulkkeok.model.dto;

public class BookMarkDto {
	
	private int beer_no;				//맥주번호
	private String user_id;			//사용자 아이디
	private String bookmark_status;	//북마크 여부 ('Y' or 'N')
	
	public BookMarkDto () {}

	public BookMarkDto(int beer_no, String user_id, String bookmark_status) {
		super();
		this.beer_no = beer_no;
		this.user_id = user_id;
		this.bookmark_status = bookmark_status;
	}

	public int getBeer_no() {
		return beer_no;
	}

	public void setBeer_no(int beer_no) {
		this.beer_no = beer_no;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getBookmark_status() {
		return bookmark_status;
	}

	public void setBookmark_status(String bookmark_status) {
		this.bookmark_status = bookmark_status;
	}

	@Override
	public String toString() {
		return "BookMarkDto [beer_no=" + beer_no + ", user_id=" + user_id + ", bookmark_status=" + bookmark_status
				+ "]";
	}

	
	

}
