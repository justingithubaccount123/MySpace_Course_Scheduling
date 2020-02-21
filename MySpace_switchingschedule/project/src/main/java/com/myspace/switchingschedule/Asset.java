package com.myspace.switchingschedule;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Asset implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	// Asset Groups
	public static final String PROTECTIONDEVICE = "PD";
	public static final String ISOLATIONPOINT = "IP";
	public static final String TRANSFORMER = "TF";
	
	private String id; // AssetID/Apparatus
	private String name;
	private String location;
	@org.kie.api.definition.type.Label("Isolation Point, Protection Device, Tranformer, Conductor, Pole/Pit")
	@org.kie.api.definition.type.Description("PD - Protection Device\nIP - Isolation Point\nTrans - Transformer")
	private String group; // Isolation Point or Protection Device
	@org.kie.api.definition.type.Label("Recloser, LV Fuse, LV Isolator, Pole, Pit (Dome), Tranformer, etc.")
	private String type; // Recloser, LV Fuse, LV Isolator
	private String circuit; // the circuit the asset is on
	private String alternateCircuit; // for Isolation Points the circuit on the other side that is being isolated.  If it's the same circuit is is a loop or in the middle of the circuit
	@org.kie.api.definition.type.Label("List of possible states the asset can have, this is not its current state.")
	private java.util.List<com.myspace.switchingschedule.AssetStateAction> states;

	public Asset() {
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
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setCircuit(String circuit) {
		this.circuit = circuit;
	}

	public String getCircuit() {
		return circuit;
	}

	public void setAlternateCircuit(String alternateCircuit) {
		this.alternateCircuit = alternateCircuit;
	}

	public String getAlternateCircuit() {
		return alternateCircuit;
	}

	public java.util.List<com.myspace.switchingschedule.AssetStateAction> getStates() {
		return this.states;
	}

	public void setStates(
			java.util.List<com.myspace.switchingschedule.AssetStateAction> states) {
		this.states = states;
	}

	public String lookupActionName(String stateOrAction) {
		// TODO: Could get defaultAction from the Globals from the current session.
		// It be better than passing it in as a parameter. Need to work out how to do that.
		// DefaultAction[] defaults = (DefaultAction[]) kSession.getGlobal("defaultAction");
		return lookupActionName(stateOrAction, null);
	}

	public String lookupActionName(String stateOrAction, DefaultAction[] defaults) {
		// TODO: Could get defaultAction from the Globals from the current session.
		// It be better than passing it in as a parameter. Need to work out how to do that.
		// DefaultAction[] defaults = (DefaultAction[]) kSession.getGlobal("defaultAction");
		String actionName = null;
		// Check for state or action in the assets states
		for (AssetStateAction as : states) {
		    if (stateOrAction.equals(as.getState()) || stateOrAction.equals( as.getAction())) {
		        actionName = as.getActionName();
		        break;
		    }
		}
		// If not found Check for state or action in the default action
		if (actionName == null && defaults != null) {
			// First try and match a default set for the Asset Type 
			for (DefaultAction da : defaults) {
			    if ((stateOrAction.equals(da.getState()) || stateOrAction.equals(da.getAction())) && da.getAssetType() != null && da.getAssetType().equals(type)) {
			        actionName = da.getActionName();
			        break;
			    }
			}
			// Then, if not found, try and match a default set for the Asset Group 
			if (actionName == null) {
				for (DefaultAction da : defaults) {
				    if ((stateOrAction.equals(da.getState()) || stateOrAction.equals(da.getAction())) && da.getAssetGroup() != null && da.getAssetGroup().equals(group)) {
				        actionName = da.getActionName();
				        break;
				    }
				}
			}
			// Then, if not found, try and match a default set for the state or action 
			if (actionName == null) {
				for (DefaultAction da : defaults) {
				    if ((stateOrAction.equals(da.getState()) || stateOrAction.equals(da.getAction())) && da.getAssetType() == null) {
				        actionName = da.getActionName();
				        break;
				    }
				}
			}
		}
		return actionName;
	}

	public String lookupActionVerb(String stateOrAction) {
		// TODO: Could get defaultAction from the Globals from the current session.
		// It be better than passing it in as a parameter. Need to work out how to do that.
		// DefaultAction[] defaults = (DefaultAction[]) kSession.getGlobal("defaultAction");
		return lookupActionVerb(stateOrAction, null);
	}

	public String lookupActionVerb(String stateOrAction, DefaultAction[] defaults) {
		// TODO: Could get defaultAction from the Globals from the current session.
		// It be better than passing it in as a parameter. Need to work out how to do that.
		// DefaultAction[] defaults = (DefaultAction[]) kSession.getGlobal("defaultAction");
		String actionVerb = null; 
		// Check for state or action in the assets states
		for (AssetStateAction as : states) {
		    if (stateOrAction.equals(as.getState()) || stateOrAction.equals(as.getAction())) {
		    	actionVerb = as.getActionVerb();
		        break;
		    }
		}
		// If not found Check for state or action in the default action
		if (actionVerb == null && defaults != null) {
			// First try and match a default set for the Asset Type 
			for (DefaultAction da : defaults) {
			    if ((stateOrAction.equals(da.getState()) || stateOrAction.equals(da.getAction())) && da.getAssetType() != null && da.getAssetType().equals(type)) {
			    	actionVerb = da.getActionVerb();
			        break;
			    }
			}
			// Then, if not found, try and match a default set for the Asset Group 
			if (actionVerb == null) {
				for (DefaultAction da : defaults) {
				    if ((stateOrAction.equals(da.getState()) || stateOrAction.equals(da.getAction())) && da.getAssetGroup() != null && da.getAssetGroup().equals(group)) {
				    	actionVerb = da.getActionVerb();
				        break;
				    }
				}
			}
			// Then, if not found, try and match a default set for the state or action 
			if (actionVerb == null) {
				for (DefaultAction da : defaults) {
				    if ((stateOrAction.equals(da.getState()) || stateOrAction.equals(da.getAction())) && da.getAssetType() == null) {
				    	actionVerb = da.getActionVerb();
				        break;
				    }
				}
			}
		}
		return actionVerb;
	}



	public String lookupActionNameForState(String state) {
		// TODO: Could get defaultAction from the Globals from the current session.
		// It be better than passing it in as a parameter. Need to work out how to do that.
		// DefaultAction[] defaults = (DefaultAction[]) kSession.getGlobal("defaultAction");
		return lookupActionNameForState(state, null);
	}

	public String lookupActionNameForState(String state, DefaultAction[] defaults) {
		// TODO: Could get defaultAction from the Globals from the current session.
		// It be better than passing it in as a parameter. Need to work out how to do that.
		// DefaultAction[] defaults = (DefaultAction[]) kSession.getGlobal("defaultAction");
		String actionName = null; 
		for (AssetStateAction as : states) {
		    if (state.equals(as.getState())) {
		        actionName = as.getActionName();
		        break;
		    }
		}
		if (actionName == null && defaults != null) {
			for (DefaultAction da : defaults) {
			    if (state.equals(da.getState()) && da.getAssetType() != null && da.getAssetType().equals(type)) {
			        actionName = da.getActionName();
			        break;
			    }
			}
			if (actionName == null) {
				for (DefaultAction da : defaults) {
				    if (state.equals(da.getState()) && da.getAssetGroup() != null && da.getAssetGroup().equals(group)) {
				        actionName = da.getActionName();
				        break;
				    }
				}
			}
			if (actionName == null) {
				for (DefaultAction da : defaults) {
				    if (state.equals(da.getState()) && da.getAssetType() == null) {
				        actionName = da.getActionName();
				        break;
				    }
				}
			}
		}
		return actionName;
	}

	public String lookupActionVerbForState(String state) {
		// TODO: Could get defaultAction from the Globals from the current session.
		// It be better than passing it in as a parameter. Need to work out how to do that.
		// DefaultAction[] defaults = (DefaultAction[]) kSession.getGlobal("defaultAction");
		return lookupActionVerbForState(state, null);
	}

	public String lookupActionVerbForState(String state, DefaultAction[] defaults) {
		// TODO: Could get defaultAction from the Globals from the current session.
		// It be better than passing it in as a parameter. Need to work out how to do that. 
		// DefaultAction[] defaults = (DefaultAction[]) kSession.getGlobal("defaultAction");
		String actionVerb = null; 
		for (AssetStateAction as : states) {
		    if (state.equals(as.getState())) {
		        actionVerb = as.getActionVerb();
		        break;
		    }
			if (actionVerb == null && defaults != null) {
				for (DefaultAction da : defaults) {
				    if (state.equals(da.getState()) && da.getAssetType() != null && da.getAssetType().equals(type)) {
				    	actionVerb = da.getActionVerb();
				        break;
				    }
				}
				if (actionVerb == null) {
					for (DefaultAction da : defaults) {
					    if (state.equals(da.getState()) && da.getAssetGroup() != null && da.getAssetGroup().equals(group)) {
					    	actionVerb = da.getActionVerb();
					        break;
					    }
					}
				}
				if (actionVerb == null) {
					for (DefaultAction da : defaults) {
					    if (state.equals(da.getState()) && da.getAssetType() == null) {
					    	actionVerb = da.getActionVerb();
					        break;
					    }
					}
				}
			}
		}
		return actionVerb;
	}

	public Asset(java.lang.String id, java.lang.String name,
			java.lang.String location, java.lang.String group,
			java.lang.String type,
			java.util.List<com.myspace.switchingschedule.AssetStateAction> states) {
		this.id = id;
		this.name = name;
		this.location = location;
		this.group = group;
		this.type = type;
		this.states = states;
	}

}