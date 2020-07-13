package com.cch.pkm.designpattern.factorypattern.factory;

import com.cch.pkm.designpattern.factorypattern.product.Bmw;
import com.cch.pkm.designpattern.factorypattern.product.Car;

public class BmwFactory extends CarFactory {
  @Override
  public Car getCar() {
    return new Bmw();
  }
}
