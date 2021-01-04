package guitarshop;

import java.util.LinkedList;
import java.util.List;

public class Inventory {
	
	private List<Guitar> guitars;
	
	public Inventory() {
		guitars = new LinkedList<>();
	}
	
	public void addGuitar(String serialNumber, double price, GuitarSpec spec) {
		guitars.add(new Guitar(serialNumber, price, spec));
	}
	
	public Guitar getGuitar(String serialNumber) {
		return guitars.stream().filter(guitar -> guitar.getSerialNumber().equals(serialNumber))
			.findFirst().get();
	}
	
	public List<Guitar> search(GuitarSpec searchGuitar) {
		List<Guitar> matchingGuitars = new LinkedList<>();
		for (Guitar guitar : guitars) {
			if(guitar.getGuitarSpec().matches(searchGuitar)) {
				matchingGuitars.add(guitar);
			}
		}
		return matchingGuitars;
	}
}
