package com.francesco;

import java.sql.Timestamp;

public class Anchor {
	private Domain domain;
	private String anchorHash;
	private String anchorUrl;
	private int scanStatus;
	private boolean activeted;
	private Timestamp modified;
	private Timestamp created;
	public Domain getDomain() {
		return domain;
	}
	public void setDomain(Domain domain) {
		this.domain = domain;
	}
	public String getAnchorHash() {
		return anchorHash;
	}
	public void setAnchorHash(String anchorHash) {
		this.anchorHash = anchorHash;
	}
	public String getAnchorUrl() {
		return anchorUrl;
	}
	public void setAnchorUrl(String anchorUrl) {
		this.anchorUrl = anchorUrl;
	}
	public int getScanStatus() {
		return scanStatus;
	}
	public void setScanStatus(int scanStatus) {
		this.scanStatus = scanStatus;
	}
	public boolean isActiveted() {
		return activeted;
	}
	public void setActiveted(boolean activeted) {
		this.activeted = activeted;
	}
	public Timestamp getModified() {
		return modified;
	}
	public void setModified(Timestamp modified) {
		this.modified = modified;
	}
	public Timestamp getCreated() {
		return created;
	}
	public void setCreated(Timestamp created) {
		this.created = created;
	}

	
	public Anchor(Domain domain, String anchorHash, String anchorUrl, int scanStatus, boolean activeted,
			Timestamp modified, Timestamp created) {
		super();
		this.domain = domain;
		this.anchorHash = anchorHash;
		this.anchorUrl = anchorUrl;
		this.scanStatus = scanStatus;
		this.activeted = activeted;
		this.modified = modified;
		this.created = created;
	}
	
	public Anchor(Domain domain, String anchorHash, String anchorUrl) {
		super();
		this.domain = domain;
		this.anchorHash = anchorHash;
		this.anchorUrl = anchorUrl;
	}
	
	
	
	
	
	
}
