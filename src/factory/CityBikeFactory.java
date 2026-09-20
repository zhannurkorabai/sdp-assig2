package factory;

public class CityBikeFactory extends BicycleFactory {

  @Override
  public Bicycle createBicycle() {
    return new CityBike();
  }
}
