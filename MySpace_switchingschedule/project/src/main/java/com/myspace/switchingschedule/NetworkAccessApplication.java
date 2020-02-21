package com.myspace.switchingschedule;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class NetworkAccessApplication implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("Application ID")
	private String id;
	private String name;
	@org.kie.api.definition.type.Label("LLW, LV, HV, Tx, Dx, etc. Should really use the ApplicationType object")
	private String type;
	private java.util.Date date;
	@org.kie.api.definition.type.Label("Area name. Should create an Area Object with the required attributes")
	private java.lang.String area;

	private java.lang.String areaCEOTNumber;

	@org.kie.api.definition.type.Label("Tree Trimming, Asset Replacement, Cleaning")
	private java.lang.String work;

	@org.kie.api.definition.type.Label("PoF Action Code")
	private java.lang.String areaCEOTActionName;

	@org.kie.api.definition.type.Label(value = "PoF Action Text")
	private java.lang.String areaCEOTActionVerb;

	public NetworkAccessApplication() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public java.util.Date getDate() {
		return date;
	}

	public void setDate(java.util.Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "NetworkAccessApplication [id=" + id + ", name=" + name
				+ ", type=" + type + ", work=" + work + "]";
	}

	public java.lang.String getArea() {
		return this.area;
	}

	public void setArea(java.lang.String area) {
		this.area = area;
	}

	public java.lang.String getAreaCEOTNumber() {
		return this.areaCEOTNumber;
	}

	public void setAreaCEOTNumber(java.lang.String areaCEOTNumber) {
		this.areaCEOTNumber = areaCEOTNumber;
	}

	public java.lang.String getWork() {
		return this.work;
	}

	public void setWork(java.lang.String work) {
		this.work = work;
	}

	public java.lang.String getAreaCEOTActionName() {
		return this.areaCEOTActionName;
	}

	public void setAreaCEOTActionName(java.lang.String areaCEOTActionName) {
		this.areaCEOTActionName = areaCEOTActionName;
	}

	public java.lang.String getAreaCEOTActionVerb() {
		return this.areaCEOTActionVerb;
	}

	public void setAreaCEOTActionVerb(java.lang.String areaCEOTActionVerb) {
		this.areaCEOTActionVerb = areaCEOTActionVerb;
	}

	public NetworkAccessApplication(java.lang.String id, java.lang.String name,
			java.lang.String type, java.lang.String area,
			java.lang.String areaCEOTNumber, java.lang.String work,
			java.lang.String areaCEOTActionName,
			java.lang.String areaCEOTActionVerb) {
		this.id = id;
		this.name = name;
		this.type = type;
		this.area = area;
		this.areaCEOTNumber = areaCEOTNumber;
		this.work = work;
		this.areaCEOTActionName = areaCEOTActionName;
		this.areaCEOTActionVerb = areaCEOTActionVerb;
	}

}