package guitarshop;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {

  private List<Instrument> inventory;

  public Inventory() {
    inventory = new LinkedList<>();
  }

  public void addGuitar(String serialNumber, double price, InstrumentSpec spec) {

    if (spec instanceof GuitarSpec) {
      inventory.add(new Guitar(serialNumber, price, (GuitarSpec) spec));
    } else if (spec instanceof MandolinSpec) {
      inventory.add(new Mandolin(serialNumber, price, (MandolinSpec) spec));
    }

  }

  public Instrument get(String serialNumber) {
    return inventory.stream()
        .filter(instrument -> instrument.getSerialNumber().equals(serialNumber)).findFirst().get();
  }

  public List<Guitar> search(GuitarSpec searchGuitar) {
    List<Guitar> matchingGuitars = new LinkedList<>();
    for (Iterator<Instrument> i = inventory.iterator(); i.hasNext();) {
      Guitar guitar = (Guitar) i.next();
      if (guitar.getSpec().matches(searchGuitar)) {
        matchingGuitars.add(guitar);
      }
    }
    return matchingGuitars;
  }

  public List<Mandolin> search(MandolinSpec searchGuitar) {
    List<Mandolin> matchingMandolins = new LinkedList<>();
    for (Iterator<Instrument> i = inventory.iterator(); i.hasNext();) {
      Mandolin mandolin = (Mandolin) i.next();
      if (mandolin.getSpec().matches(searchGuitar)) {
        matchingMandolins.add(mandolin);
      }
    }
    return matchingMandolins;
  }
}
