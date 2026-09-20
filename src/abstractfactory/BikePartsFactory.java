package abstractfactory;

public interface BikePartsFactory {
  BikeFrame createFrame();
  BikeTire createTire();
}
