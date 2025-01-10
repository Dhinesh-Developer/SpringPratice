package com.DhineshDeveloper.artilceData;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Article {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int aId;
	private String aTitle;
	private String aContent;
	public int getaId() {
		return aId;
	}
	public void setaId(int aId) {
		this.aId = aId;
	}
	public String getaTitle() {
		return aTitle;
	}
	public void setaTitle(String aTitle) {
		this.aTitle = aTitle;
	}
	public String getaContent() {
		return aContent;
	}
	public void setaContent(String aContent) {
		this.aContent = aContent;
	}
	public Article(int aId, String aTitle, String aContent) {
		super();
		this.aId = aId;
		this.aTitle = aTitle;
		this.aContent = aContent;
	}
	
	public Article() {
	}
	public Article(String aTitle, String aContent) {
		super();
		this.aTitle = aTitle;
		this.aContent = aContent;
	}
	@Override
	public String toString() {
		return "Article [aId=" + aId + ", aTitle=" + aTitle + ", aContent=" + aContent + "]";
	}
	
	

}
