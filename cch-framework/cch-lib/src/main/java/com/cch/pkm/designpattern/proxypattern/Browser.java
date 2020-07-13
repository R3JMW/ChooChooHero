package com.cch.pkm.designpattern.proxypattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Browser {

  public static void main(String[] args) {
    IHttpInvoke proxy = new HttpInvokeProxy(new Server());
    proxy.invoke("asdfasdffdsa");

    Server s = new Server();
    InvocationHandler invocationHandler = new HttpInvokeProxyInvocationHandler(s);
    Class server = s.getClass();
    IHttpInvoke httpInvoke = (IHttpInvoke) Proxy.newProxyInstance(server.getClassLoader(), server.getInterfaces(), invocationHandler);
    httpInvoke.invoke("gasjglahslgas");
  }
}
