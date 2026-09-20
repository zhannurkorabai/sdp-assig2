package factory;

public class MountainBikeFactory extends BicycleFactory {

  @Override
  public Bicycle createBicycle() {
    return new MountainBike();
  }
}
