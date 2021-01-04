package guitarshop;

public class GuitarSpec extends InstrumentSpec {

  private int numStrings;

  public GuitarSpec(String model, int numStrings, GuitarBuilder builder, Type type, Wood backWood,
      Wood topWood) {
    super(builder, model, type, backWood, topWood);
    this.numStrings = numStrings;
  }

  @Override
  public boolean matches(InstrumentSpec otherSpec) {
    if (!super.matches(otherSpec)) {
      return false;
    }
    if (!(otherSpec instanceof GuitarSpec)) {
      return false;
    }
    GuitarSpec spec = (GuitarSpec) otherSpec;
    if (numStrings != spec.numStrings) {
      return false;
    }
    return true;
  }

  public int getNumStrings() {
    return numStrings;
  }


}
