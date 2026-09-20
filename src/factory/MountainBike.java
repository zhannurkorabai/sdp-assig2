package factory;

public class MountainBike implements Bicycle {

  @Override
  public void assemble() {
    System.out.println(
      ">> Assembling rugged Mountain bike for off-road trails.."
    );
  }
}
