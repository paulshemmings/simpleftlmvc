package com.razor.models;

import java.io.Serializable;
import java.util.Date;

public class Story implements Serializable {
	
	private static final long serialVersionUID = 6899284258473985914L;

	private Date dateOccurred;
	private long creatorId;
	private int creatorPrivacyLevel;
	private Date dateCreated;
	private boolean isDeleted;
    private String text;
	
	/**
	 * Empty Constructor
	 */
	
	public Story(){		
		this.isDeleted = false;
	}
	
	/**
	 * Constructor
	 * @param text
	 * @param creatorId
	 * @param creatorPrivacyLevel
	 * @param attachedFriends
	 * @param dateCreated
	 */

	public Story(String text, int creatorId, int creatorPrivacyLevel, Date dateCreated) {
		super();
		this.creatorId = creatorId;
		this.creatorPrivacyLevel = creatorPrivacyLevel;
		this.dateCreated = dateCreated;
		this.isDeleted = false;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = "";
	}

	public long getCreatorId() {
		return creatorId;
	}

	public void setCreatorId(long creatorId) {
		this.creatorId = creatorId;
	}

	public int getCreatorPrivacyLevel() {
		return creatorPrivacyLevel;
	}

	public void setCreatorPrivacyLevel(int creatorPrivacyLevel) {
		this.creatorPrivacyLevel = creatorPrivacyLevel;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Date getDateOccured() {
		return dateOccurred;
	}

	public void setDateOccured(Date dateOccured) {
		this.dateOccurred = dateOccured;
	}

	public boolean isDeleted() {
		return isDeleted;
	}

	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}


}
