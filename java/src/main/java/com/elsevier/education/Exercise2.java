package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine. 
TODO make sure we have no-op implementations of both engines.

*/
public class Exercise2 {


public static interface Engine{

public void spinWheels();

}



public static class Car {


private Engine engine = null;


public Car(Engine engine) {

this.engine=engine;

}


public void moveForward() {

this.engine.spinWheels();

}

}


public static class GasEngine implements Engine{

@Override

public void spinWheels() {

// no-op for now

}

}


public static class ElectricEngine implements Engine{

@Override

public void spinWheels() {

// no-op for now

}

}


public static interface EngineInjector{


public Car getCar();


}


public static class GasEngineInjector implements EngineInjector{


@Override

public Car getCar(){

return new Car(new GasEngine());

}



}

public static class ElectricEngineInjector implements EngineInjector{

@Override

public Car getCar(){

return new Car(new ElectricEngine());

}

}



}
