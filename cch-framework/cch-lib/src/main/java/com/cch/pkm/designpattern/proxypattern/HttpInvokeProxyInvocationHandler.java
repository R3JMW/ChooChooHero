package com.cch.pkm.designpattern.proxypattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.logging.Logger;

public class HttpInvokeProxyInvocationHandler implements InvocationHandler {

  Logger logger = Logger.getLogger(String.valueOf(getClass()));

  private Object obj;

  public HttpInvokeProxyInvocationHandler(Object obj) {
    this.obj = obj;
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    before((String) args[0]);
    Object object = method.invoke(obj, args);
    after((String) object);
    return object;
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
