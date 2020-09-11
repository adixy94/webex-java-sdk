package com.ciscospark;

import java.util.Date;

public class Meeting {
	private String id;
	private String meetingSeriesId;
	private String meetingNumber;
	private String title;
	private String agenda;
	private String password;
	private String meetingType;
	private String state;
	private String timeZone;
	private String start;
	private String end;
	private String recurrence;
	private String hostUserId;
	private String hostDisplayName;
	private String hostEmail;
	private String hostKey;
	private String webLink;
	private String sipAddress;
	private String dialInIpAddress;
	private Boolean enabledAutoRecordMeeting;
	private Boolean allowAnyUserToBeCoHost;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMeetingSeriesId() {
		return meetingSeriesId;
	}

	public void setMeetingSeriesId(String meetingSeriesId) {
		this.meetingSeriesId = meetingSeriesId;
	}

	public String getMeetingNumber() {
		return meetingNumber;
	}

	public void setMeetingNumber(String meetingNumber) {
		this.meetingNumber = meetingNumber;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAgenda() {
		return agenda;
	}

	public void setAgenda(String agenda) {
		this.agenda = agenda;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMeetingType() {
		return meetingType;
	}

	public void setMeetingType(String meetingType) {
		this.meetingType = meetingType;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getTimeZone() {
		return timeZone;
	}

	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	public String getRecurrence() {
		return recurrence;
	}

	public void setRecurrence(String recurrence) {
		this.recurrence = recurrence;
	}

	public String getHostUserId() {
		return hostUserId;
	}

	public void setHostUserId(String hostUserId) {
		this.hostUserId = hostUserId;
	}

	public String getHostDisplayName() {
		return hostDisplayName;
	}

	public void setHostDisplayName(String hostDisplayName) {
		this.hostDisplayName = hostDisplayName;
	}

	public String getHostEmail() {
		return hostEmail;
	}

	public void setHostEmail(String hostEmail) {
		this.hostEmail = hostEmail;
	}

	public String getHostKey() {
		return hostKey;
	}

	public void setHostKey(String hostKey) {
		this.hostKey = hostKey;
	}

	public String getWebLink() {
		return webLink;
	}

	public void setWebLink(String webLink) {
		this.webLink = webLink;
	}

	public String getSipAddress() {
		return sipAddress;
	}

	public void setSipAddress(String sipAddress) {
		this.sipAddress = sipAddress;
	}

	public String getDialInIpAddress() {
		return dialInIpAddress;
	}

	public void setDialInIpAddress(String dialInIpAddress) {
		this.dialInIpAddress = dialInIpAddress;
	}

	public Boolean getEnabledAutoRecordMeeting() {
		return enabledAutoRecordMeeting;
	}

	public void setEnabledAutoRecordMeeting(Boolean enabledAutoRecordMeeting) {
		this.enabledAutoRecordMeeting = enabledAutoRecordMeeting;
	}

	public Boolean getAllowAnyUserToBeCoHost() {
		return allowAnyUserToBeCoHost;
	}

	public void setAllowAnyUserToBeCoHost(Boolean allowAnyUserToBeCoHost) {
		this.allowAnyUserToBeCoHost = allowAnyUserToBeCoHost;
	}

}
