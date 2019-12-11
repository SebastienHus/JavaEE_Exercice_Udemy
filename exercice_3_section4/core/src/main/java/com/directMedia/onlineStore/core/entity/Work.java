package com.directMedia.onlineStore.core.entity;

public class Work {
	
	private String title;
	private String kind;
	private int release;
	private String summary;
	private Artist mainArtist;
	
	//constructors
	public Work() {
		
	}
	
	public Work(String title) {

		this.title = title;

	}
	
	
	//Getters and setters
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public int getRelease() {
		return release;
	}
	public void setRelease(int release) {
		this.release = release;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public Artist getMainArtist() {
		return mainArtist;
	}
	public void setMainArtist(Artist mainArtist) {
		this.mainArtist = mainArtist;
	}
	
	

}
