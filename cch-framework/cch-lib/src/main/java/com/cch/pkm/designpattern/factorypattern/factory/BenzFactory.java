package com.cch.pkm.designpattern.factorypattern.factory;

import com.cch.pkm.designpattern.factorypattern.product.Benz;
import com.cch.pkm.designpattern.factorypattern.product.Car;

public class BenzFactory extends CarFactory {
  @Override
  public Car getCar() {
    return new Benz();
  }
}
