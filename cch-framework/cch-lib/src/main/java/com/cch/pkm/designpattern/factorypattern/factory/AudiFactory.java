package com.cch.pkm.designpattern.factorypattern.factory;

import com.cch.pkm.designpattern.factorypattern.product.Audi;
import com.cch.pkm.designpattern.factorypattern.product.Car;

public class AudiFactory extends CarFactory {
  @Override
  public Car getCar() {
    return new Audi();
  }
}
