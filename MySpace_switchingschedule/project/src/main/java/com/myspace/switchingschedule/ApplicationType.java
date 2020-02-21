package com.myspace.switchingschedule;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class ApplicationType implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	public static final String ARS = "ARS";	
	public static final String LLW = "LLS";
	public static final String HV = "HV EAP";
	public static final String LV = "LV EAP";

	@org.kie.api.definition.type.Label("LLW, LV, HV, Dx, Tx, etc")
	private String id;
	private String name;

	public ApplicationType() {
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

	public ApplicationType(java.lang.String id, java.lang.String name) {
		this.id = id;
		this.name = name;
	}

}