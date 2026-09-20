import factory.BicycleFactory;
import factory.MountainBikeFactory;

public class Main {

  public static void main(String[] args) {
    System.out.println("-- Part A: Factory method --");
    BicycleFactory mountainFactory = new MountainBikeFactory();
    mountainFactory.orderBicycle();
  }
}
