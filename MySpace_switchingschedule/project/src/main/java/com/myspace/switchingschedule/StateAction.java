package com.myspace.switchingschedule;

public class StateAction {

	// NOTE: All States and Action need to be unique both in name and value.
	//       This is so the lookup methods in the Asset and SwitchinShedule classes get a unique match.   
	
	// State values
	// Protection Devices
	public static final String ENABLED = "Enabled";
	public static final String DISABLED = "Disabled";
	// Isolation Points
	public static final String OPENED = "Opened";
	public static final String CLOSED = "Closed";
	public static final String OPENEDTAGGED = "OpenedTagged";
	public static final String CLOSEDTAGGED = "ClosedTagged";
	public static final String TAGGED = "Tagged"; // A check action that does not the state. State is assumed to be Open i.e Checked Open & Tag Attached
	public static final String REMOVEDTAG = "RemovedTag"; // A check action that does not the state. State is assumed to be Open i.e. Checked Open & Removed Tag

	// Action values
	// Protection Devices
	public static final String ENABLE = "Enable";
	public static final String DISABLE = "Disable";
	// Isolation Points
	public static final String OPEN = "Open";
	public static final String CLOSE = "Close";
	public static final String OPENTAG = "OpenTag";
	public static final String CLOSETAG = "CloseTAG";
	public static final String TAG = "Tag"; // A check action. Action assumes state is open i.e. Checked Open & Tag Attached
	public static final String REMOVETAG = "RemoveTag"; // // A check action. Action assumes state is open i.e. Checked Open & Removed Tag 
	//General
	public static final String COMMENT = "Comment";
	public static final String LLW_COMPLETE = "LLW_Complete"; // "Live Line Work Completed"
	public static final String WORK_COMPLETE = "Work_Complete"; // "Advise CEOT all Work Completed"

}
