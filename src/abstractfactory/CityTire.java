package abstractfactory;

public class CityTire implements BikeTire {

  public void inflate(int pressureInPsi) {
    System.out.println(
      ">> Inflating smooth narrow city tire to " + pressureInPsi + " PSI..."
    );
  }
}
