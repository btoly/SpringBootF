package com.example.Whathg_Database.JwtProvider;

public class ResponseMessage {
	  private String message;
	 
	  public ResponseMessage(String message) {
	    this.message = message;
	  }
	 
	  public String getMessage() {
	    return message;
	  }
	 
	  public void setMessage(String message) {
	    this.message = message;
	  }
	}