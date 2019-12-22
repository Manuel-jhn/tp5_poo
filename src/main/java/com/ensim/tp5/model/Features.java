package com.ensim.tp5.model;




public class Features {
	private String type;
	Geometry geometry;
	Properties properties;
	
	public void setGeometry(Geometry geometry) {
		this.geometry = geometry;
	}
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Geometry getGeometry() {
		return geometry;
	}
	public Properties getProperties() {
		return properties;
	}

}
