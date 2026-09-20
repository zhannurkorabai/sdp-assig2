package abstractfactory;

public class MountainBikePartsFactory implements BikePartsFactory {

  public BikeFrame createFrame() {
    return new MountainFrame();
  }

  public BikeTire createTire() {
    return new MountainTire();
  }
}
