package guitarshop;

public class MandolinSpec extends InstrumentSpec {

  private Style style;

  public MandolinSpec(GuitarBuilder builder, String model, Type type, Style style, Wood backWood,
      Wood topWood) {
    super(builder, model, type, backWood, topWood);
    this.style = style;
  }

  public Style getStyle() {
    return style;
  }

  public boolean matches(InstrumentSpec otherSpec) {
    if (!super.matches(otherSpec)) {
      return false;
    }
    if (!(otherSpec instanceof MandolinSpec)) {
      return false;
    }
    MandolinSpec spec = (MandolinSpec) otherSpec;
    if (!style.equals(spec.getStyle())) {
      return false;
    }
    return true;
  }

}
