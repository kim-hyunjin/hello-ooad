package guitarshop;

public class GuitarSpec {
	private String model;
	private int numStrings;
	private GuitarBuilder builder;
	private Type type;
	private Wood backWood;
	private Wood topWood;
	
	public GuitarSpec(String model, int numStrings, GuitarBuilder builder, Type type, Wood backWood, Wood topWood) {
		this.model = model;
		this.numStrings = numStrings;
		this.builder = builder;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
	}
	
	public boolean matches(GuitarSpec otherSpec) {
		if (builder != otherSpec.builder) {
			return false;
		}
		if ((model != null) && (!model.equals("")) && (!model.equals(otherSpec.model))) {
			return false;
		}
		if (type != otherSpec.type) {
			return false;
		}
		if (numStrings != otherSpec.numStrings) {
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

	public int getNumStrings() {
		return numStrings;
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
