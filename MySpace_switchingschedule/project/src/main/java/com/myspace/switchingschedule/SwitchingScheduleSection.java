package com.myspace.switchingschedule;

public class SwitchingScheduleSection {
	private int sequence;
	private String section;
	
	public SwitchingScheduleSection(int sequence, String section) {
		this.sequence = sequence;
		this.section = section;
	}
	
	@Override
	public String toString() {
		return sequence + "." + section;
	}

	public int getSequence() {
		return sequence;
	}


	public String getSection() {
		return section;
	}
	
}
