import abstractfactory.BikePartsFactory;
import abstractfactory.CityBikePartsFactory;
import client.BikeAssemblerClient;
import factory.BicycleFactory;
import factory.MountainBikeFactory;

public class Main {

  public static void main(String[] args) {
    System.out.println("-- Part A: Factory method --");
    BicycleFactory mountainFactory = new MountainBikeFactory();
    mountainFactory.orderBicycle();
    System.out.println("-- Part B: Abstract factory --");
    BikePartsFactory partsFactory = new CityBikePartsFactory();
    BikeAssemblerClient client = new BikeAssemblerClient(partsFactory);
    client.buildBike();
  }
}
