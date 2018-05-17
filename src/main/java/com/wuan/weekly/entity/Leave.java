package com.wuan.weekly.entity;

public class Leave {

	private int leaveNum;
	private int userId;
	private int groupId;
	private int status;
	private String reason;
	
	public int getLeaveNum() {
		return leaveNum;
	}
	public void setLeaveNum(int leaveNum) {
		this.leaveNum = leaveNum;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getGroupId() {
		return groupId;
	}
	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public Leave() {
		super();
	}
	public Leave(int leaveNum, int userId, int groupId, int status, String reason) {
		super();
		this.leaveNum = leaveNum;
		this.userId = userId;
		this.groupId = groupId;
		this.status = status;
		this.reason = reason;
	}
	@Override
	public String toString() {
		return "Leave [leaveNum=" + leaveNum + ", userId=" + userId + ", groupId=" + groupId + ", status=" + status
				+ ", reason=" + reason + "]";
	}
	
	
	


}
