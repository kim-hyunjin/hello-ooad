package guitarshop;

public abstract class InstrumentSpec {
  private String model;
  private GuitarBuilder builder;
  private Type type;
  private Wood backWood;
  private Wood topWood;

  public InstrumentSpec(GuitarBuilder builder, String model, Type type, Wood backWood,
      Wood topWood) {
    this.builder = builder;
    this.model = model;
    this.type = type;
    this.backWood = backWood;
    this.topWood = topWood;
  }

  public boolean matches(InstrumentSpec otherSpec) {
    if (builder != otherSpec.builder) {
      return false;
    }
    if ((model != null) && (!model.equals("")) && (!model.equals(otherSpec.model))) {
      return false;
    }
    if (type != otherSpec.type) {
      return false;
    }
    if (backWood != otherSpec.backWood) {
      return false;
    }
    if (topWood != otherSpec.topWood) {
      return false;
    }
    return true;
  }

  public String getModel() {
    return model;
  }

  public GuitarBuilder getBuilder() {
    return builder;
  }

  public Type getType() {
    return type;
  }

  public Wood getBackWood() {
    return backWood;
  }

  public Wood getTopWood() {
    return topWood;
  }


}
