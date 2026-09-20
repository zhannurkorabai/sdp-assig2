package factory;

public abstract class BicycleFactory {

  public abstract Bicycle createBicycle();

  public void orderBicycle() {
    System.out.println(">> Processing new bicycle order...");
    Bicycle bike = createBicycle();
    bike.assemble();
  }
}
