package versionone.bean;

import jxl.format.Colour; 
 

public class ColourBean {
	public Colour titleColour = Colour.GRAY_25;
	public Colour taskColour = Colour.TAN;
	public Colour taskDesignColour = Colour.PALE_BLUE; 
	public Colour taskExecutionColour = Colour.LIGHT_GREEN; 
	public Colour leaveOthersMeetingColour = Colour.GRAY_50;
	
	public Colour getTitleColour() {
		return titleColour;
	}

	public void setTitleColour(Colour titleColour) {
		this.titleColour = titleColour;
	}
	
	public Colour getTaskColour() {
		return taskColour;
	}

	public void setTaskColour(Colour taskColour) {
		this.taskColour = taskColour;
	}
	
	public Colour getTaskDesignColour() {
		return taskDesignColour;
	}

	public void setTaskDesignColour(Colour taskDesignColour) {
		this.taskDesignColour = taskDesignColour;
	}
	
	public Colour getTaskExecutionColour() {
		return taskExecutionColour;
	}

	public void setTaskExecutionColour(Colour taskExecutionColour) {
		this.taskExecutionColour = taskExecutionColour;
	}
	
	public Colour getLeaveOthersMeetingColour() {
		return leaveOthersMeetingColour;
	}

	public void setLeaveOthersMeetingColour(Colour leaveOthersMeetingColour) {
		this.leaveOthersMeetingColour = leaveOthersMeetingColour;
	}
}
