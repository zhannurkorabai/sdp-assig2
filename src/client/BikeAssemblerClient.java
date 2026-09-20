package client;

import abstractfactory.BikeFrame;
import abstractfactory.BikePartsFactory;
import abstractfactory.BikeTire;

public class BikeAssemblerClient {

  private final BikeFrame frame;
  private final BikeTire frontTire;
  private final BikeTire rearTire;

  public BikeAssemblerClient(BikePartsFactory factory) {
    if (factory == null) throw new IllegalArgumentException(
      "BikePartsFactory cannot be null."
    );
    this.frame = factory.createFrame();
    this.frontTire = factory.createTire();
    this.rearTire = factory.createTire();
  }

  public void buildBike() {
    frame.weld();
    frontTire.inflate(35);
    rearTire.inflate(35);
    System.out.println("BIKE BUILD COMEPLETE!");
  }
}
