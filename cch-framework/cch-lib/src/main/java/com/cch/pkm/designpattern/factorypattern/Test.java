package com.cch.pkm.designpattern.factorypattern;

import com.cch.pkm.designpattern.factorypattern.factory.AudiFactory;
import com.cch.pkm.designpattern.factorypattern.factory.BenzFactory;
import com.cch.pkm.designpattern.factorypattern.factory.BmwFactory;
import com.cch.pkm.designpattern.factorypattern.factory.CarFactory;

public class Test {

  public static void main(String[] args) {
    CarFactory benzFactory = new BenzFactory();
    benzFactory.getCar().produce();
    CarFactory audiFactory = new AudiFactory();
    audiFactory.getCar().produce();
    CarFactory bmwFactory = new BmwFactory();
    bmwFactory.getCar().produce();
  }
}
