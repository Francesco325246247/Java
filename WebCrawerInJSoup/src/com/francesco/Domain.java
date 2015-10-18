package com.francesco;

import java.sql.Timestamp;

public class Domain {
	
private String domainHash;
private String domainUrl;
private boolean activeted;
private Timestamp modified;
private Timestamp created;

public String getDomainHash() {
	return domainHash;
}
public void setDomainHash(String domainHash) {
	this.domainHash = domainHash;
}
public String getDomainUrl() {
	return domainUrl;
}
public void setDomainUrl(String domainUrl) {
	this.domainUrl = domainUrl;
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
public Domain(String domainHash, String domainUrl) {
	super();
	this.domainHash = domainHash;
	this.domainUrl = domainUrl;
}

//loading data from databse
public Domain(String domainHash, String domainUrl, boolean activeted, Timestamp modified, Timestamp created) {
	super();
	this.domainHash = domainHash;
	this.domainUrl = domainUrl;
	this.activeted = activeted;
	this.modified = modified;
	this.created = created;
}
	
	
}
