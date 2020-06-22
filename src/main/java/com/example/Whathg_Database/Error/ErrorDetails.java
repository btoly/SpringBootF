package com.example.Whathg_Database.Error;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
public class ErrorDetails {


private String message;

private String uri;//path
private String details;

@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
private Date timestamp;



public ErrorDetails(Date timestamp, String message, String details) {
    super();
    this.timestamp = timestamp;
    this.message = message;
    this.details = details;
}
public ErrorDetails() {
    this.timestamp = new Date();
}


public ErrorDetails(String message, String uri) {
    this();
    this.message = message;
    this.uri = uri;
}



public String getDetails() {
	return details;
}
public void setDetails(String details) {
	this.details = details;
}
public String getMessage() {
    return message;
}

public void setMessage(String message) {
    this.message = message;
}

public String getUri() {
    return uri;
}

public void setUri(String uri) {
    this.uri = uri;
}

public Date getTimestamp() {
    return timestamp;
}

public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
}
}