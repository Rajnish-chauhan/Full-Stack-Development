package com.cfs;

public class Car {
private Engine engine;

    public Car(Engine engine) {
        System.out.println("Car Constructor called");
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
public void drive(){
    int start =engine.start();
      if (start>=1)
      {
          System.out.println("Let's Drive");
      }else{
          System.out.println("Engine Not Started");
      }
    }

}

