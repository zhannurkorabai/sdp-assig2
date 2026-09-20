package abstractfactory;

public class CityBikePartsFactory implements BikePartsFactory {

  public BikeFrame createFrame() {
    return new CityFrame();
  }

  public BikeTire createTire() {
    return new CityTire();
  }
}
