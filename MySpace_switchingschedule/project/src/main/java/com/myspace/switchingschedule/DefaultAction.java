package com.myspace.switchingschedule;

public class DefaultAction {
	
	@org.kie.api.definition.type.Label("Closed, Opened, Enabled, Disabled, etc")
	private java.lang.String state;
	@org.kie.api.definition.type.Label("Close, Open, Enable, Disable, etc")
	private java.lang.String action;
	@org.kie.api.definition.type.Label("Isolation Point, Protection Device, Tranformer, Conductor, Pole/Pit")
	@org.kie.api.definition.type.Description("PD - Protection Device\nIP - Isolation Point\nTrans - Transformer")
	private String assetGroup; // Isolation Point or Protection Device
	@org.kie.api.definition.type.Label("Optional Asset Type - A NULL value implies it is the default for any asset type having that state or action. Set to the asset type if overide the default for that asset type. ")
	private java.lang.String assetType;
	@org.kie.api.definition.type.Label(value = "The PoF ActionName (Code) that represents the state for that asset")
	private java.lang.String actionName;
	@org.kie.api.definition.type.Label("The PoF ActionVerb that represents the state for that asset")
	private java.lang.String actionVerb;

	
	public java.lang.String getState() {
		return this.state;
	}

	public void setState(java.lang.String state) {
		this.state = state;
	}

	public java.lang.String getAction() {
		return this.action;
	}

	public void setAction(java.lang.String action) {
		this.action = action;
	}

	public java.lang.String getAssetGroup() {
		return this.assetGroup;
	}

	public void getAssetGroup(java.lang.String assetGroup) {
		this.action = assetGroup;
	}
	
	public java.lang.String getAssetType() {
		return this.assetType;
	}

	public void setAssetType(java.lang.String assetType) {
		this.action = assetType;
	}
	
	public java.lang.String getActionVerb() {
		// Prefix the actionVerb with extra text to identify that a default has been used for testing.
		// return "DEFAULT:" + (action != null ? action + ":" : "") + (assetType != null ? assetType + ":" : "") + this.actionVerb;
		return this.actionVerb;
	}

	public void setActionVerb(java.lang.String actionVerb) {
		this.actionVerb = actionVerb;
	}

	public java.lang.String getActionName() {
		return this.actionName;
	}

	public void setActionName(java.lang.String actionName) {
		this.actionName = actionName;
	}
}
