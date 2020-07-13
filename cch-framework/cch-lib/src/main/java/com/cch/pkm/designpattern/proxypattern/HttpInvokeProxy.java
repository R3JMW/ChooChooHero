package com.cch.pkm.designpattern.proxypattern;

import java.util.logging.Logger;

public class HttpInvokeProxy implements IHttpInvoke {

  Logger logger = Logger.getLogger(String.valueOf(getClass()));

  private IHttpInvoke iHttpInvoke;

  public HttpInvokeProxy(IHttpInvoke iHttpInvoke) {
    this.iHttpInvoke = iHttpInvoke;
  }

  @Override
  public String invoke(String request) {
    String req = before(request);
    String response = iHttpInvoke.invoke(req);
    after(response);
    return response;
  }

  private String before(String request) {
    logger.info("before");
    return request;
  }

  private String after(String response) {
    logger.info("after");
    return response;
  }
}
