package com.lemaille.tp5.model;

import java.util.ArrayList;

public class Result 
{
	private String type;
	private String version;
	ArrayList <Features> Features;
	private String attribution;
	private String licence;
	private String query;
	private float limit;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public ArrayList<Features> getFeatures() {
		return Features;
	}
	public void setFeatures(ArrayList<Features> Features) {
		this.Features = Features;
	}
	public String getAttribution() {
		return attribution;
	}
	public void setAttribution(String attribution) {
		this.attribution = attribution;
	}
	public String getLicence() {
		return licence;
	}
	public void setLicence(String licence) {
		this.licence = licence;
	}
	public String getQuery() {
		return query;
	}
	public void setQuery(String query) {
		this.query = query;
	}
	public float getLimit() {
		return limit;
	}
	public void setLimit(float limit) {
		this.limit = limit;
	}
	
	 
}
