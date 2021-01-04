package dogdoor;

public class DogDoorSimulator {

	public static void main(String[] args) {
		DogDoor door = new DogDoor();
		Remote remote = new Remote(door);
		System.out.println("흰둥이가 밖으로 나가고 싶어 짖는다");
		remote.pressButton();
		System.out.println("흰둥이가 밖으로 나갔다");
		remote.pressButton();
		System.out.println("흰둥이가 볼일을 본다");
		remote.pressButton();
		System.out.println("흰둥이가 안으로 들어온다.");
		remote.pressButton();
	}

}
