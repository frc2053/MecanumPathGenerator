package org.team2053;

import javafx.beans.property.SimpleDoubleProperty;

public class RobotPose {
	private SimpleDoubleProperty xPos;
	private SimpleDoubleProperty yPos;
	private SimpleDoubleProperty heading;
	
	public RobotPose(double x, double y, double yaw) {
		this.xPos = new SimpleDoubleProperty(x);
		this.yPos = new SimpleDoubleProperty(y);
		this.heading = new SimpleDoubleProperty(yaw);
	}
	
	public double getXPos() {
		return xPos.get();
	}
	
	public double getYPos() {
		return yPos.get();
	}
	
	public double getHeading() {
		return heading.get();
	}
	
	public void setXPos(double x) {
		xPos.set(x);
	}
	
	public void setYPos(double y) {
		yPos.set(y);
	}
	
	public void setHeading(double yaw) {
		heading.set(yaw);
	}
}
