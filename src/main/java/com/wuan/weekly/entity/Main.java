package com.wuan.weekly.entity;

public class Main extends Info{

	public int weekNum;
	public int status;
	
	public int getWeekNum() {
		return weekNum;
	}
	public void setWeekNum(int weekNum) {
		this.weekNum = weekNum;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	
	
	public Main(int weekNum) {
		super();
		this.weekNum = weekNum;
	}
	
	
	public Main() {
		super();
	}
	@Override
	public String toString() {
		return "Main [weekNum=" + weekNum + ", status=" + status + "]";
	}
	
	

}
