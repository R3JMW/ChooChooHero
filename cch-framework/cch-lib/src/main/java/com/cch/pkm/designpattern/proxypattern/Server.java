package com.cch.pkm.designpattern.proxypattern;

import java.util.logging.Logger;

public class Server implements IHttpInvoke {

  Logger logger = Logger.getLogger(String.valueOf(getClass()));

  @Override
  public String invoke(String request) {
    String response = "None";
    return response;
  }
}
