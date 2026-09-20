package abstractfactory;

public class MountainTire implements BikeTire {

  public void inflate(int pressureInPsi) {
    System.out.println(
      ">> Inflating knobby mountain tire to " + pressureInPsi + " PSI..."
    );
  }
}
