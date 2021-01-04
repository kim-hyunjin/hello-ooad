package guitarshop;

import java.util.List;

public class FindGuitarTester {

  public static void main(String[] args) {
    Inventory inventory = new Inventory();
    initializeInventory(inventory);

    GuitarSpec whatEricLikes = new GuitarSpec("Stratocastor", 5, GuitarBuilder.FENDER,
        Type.ELECTRIC, Wood.ALDER, Wood.ALDER);

    List<Guitar> matchingGuitars = inventory.search(whatEricLikes);
    if (!matchingGuitars.isEmpty()) {
      System.out.println("Sir, you might like these guitars:");
      for (Guitar guitar : matchingGuitars) {
        System.out.println(
            "We have a " + guitar.getSpec().getBuilder() + " " + guitar.getSpec().getModel() + " "
                + guitar.getSpec().getType() + " guitar:\n    " + guitar.getSpec().getBackWood()
                + " back and sides,\n    " + guitar.getSpec().getTopWood()
                + " top.\n You can have it for only $" + guitar.getPrice() + "!\n ----");
      }
    } else {
      System.out.println("Sorry, we have nothing for you.");
    }


  }

  private static void initializeInventory(Inventory inventory) {
    // 기타들을 재고 목록에 등록
    inventory.addGuitar("V95693", 1499.95, new GuitarSpec("Stratocastor", 5, GuitarBuilder.FENDER,
        Type.ELECTRIC, Wood.ALDER, Wood.ALDER));
    inventory.addGuitar("V9512", 1549.95, new GuitarSpec("Startocastor", 5, GuitarBuilder.FENDER,
        Type.ELECTRIC, Wood.ALDER, Wood.ALDER));
  }
}
