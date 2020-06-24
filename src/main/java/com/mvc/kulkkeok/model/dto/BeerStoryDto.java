package com.mvc.kulkkeok.model.dto;


public class BeerStoryDto {
   private int story_no;
   private String story_name;
   private String story_link;
   private String story_img;
   
   
   public BeerStoryDto() {
      
   }


public BeerStoryDto(int story_no, String story_name, String story_link, String story_img) {
	super();
	this.story_no = story_no;
	this.story_name = story_name;
	this.story_link = story_link;
	this.story_img = story_img;
}


public int getStory_no() {
	return story_no;
}


public void setStory_no(int story_no) {
	this.story_no = story_no;
}


public String getStory_name() {
	return story_name;
}


public void setStory_name(String story_name) {
	this.story_name = story_name;
}


public String getStory_link() {
	return story_link;
}


public void setStory_link(String story_link) {
	this.story_link = story_link;
}


public String getStory_img() {
	return story_img;
}


public void setStory_img(String story_img) {
	this.story_img = story_img;
}


@Override
public String toString() {
	return "BeerStoryDto [story_no=" + story_no + ", story_name=" + story_name + ", story_link=" + story_link
			+ ", story_img=" + story_img + "]";
}



   
}