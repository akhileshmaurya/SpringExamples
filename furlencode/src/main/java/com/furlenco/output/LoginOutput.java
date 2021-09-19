package com.furlenco.output;

public class LoginOutput {

  String response;
  boolean success;

  public LoginOutput(String response, boolean success) {
    super();
    this.response = response;
    this.success = success;
  }

  public String getResponse() {
    return response;
  }

  public void setResponse(String response) {
    this.response = response;
  }

  public boolean isSuccess() {
    return success;
  }

  public void setSuccess(boolean success) {
    this.success = success;
  }
}
