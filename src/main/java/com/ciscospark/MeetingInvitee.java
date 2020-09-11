package com.ciscospark;

public class MeetingInvitee {
	private String id;
	private String meetingId;
	private String email;
	private String displayName;
	private Boolean coHost;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMeetingId() {
		return meetingId;
	}

	public void setMeetingId(String meetingId) {
		this.meetingId = meetingId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public Boolean getCoHost() {
		return coHost;
	}

	public void setCoHost(Boolean coHost) {
		this.coHost = coHost;
	}

}
