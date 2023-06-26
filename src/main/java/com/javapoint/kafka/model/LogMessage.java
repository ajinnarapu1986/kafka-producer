package com.javapoint.kafka.model;

public class LogMessage {
	private String timestamp;
	private String source;
	private String severity;
	private String message;
	private String component;
	private String hostname;

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getSeverity() {
		return severity;
	}

	public void setSeverity(String severity) {
		this.severity = severity;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getComponent() {
		return component;
	}

	public void setComponent(String component) {
		this.component = component;
	}

	public String getHostname() {
		return hostname;
	}

	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

	@Override
	public String toString() {
		return "LogMessage [timestamp=" + timestamp + ", source=" + source + ", severity=" + severity + ", message="
				+ message + ", component=" + component + ", hostname=" + hostname + "]";
	}

}
