package factory;

public class CityBike implements Bicycle {

  @Override
  public void assemble() {
    System.out.println(
      ">> Assembling lightweight City bike for paved roads..."
    );
  }
}
