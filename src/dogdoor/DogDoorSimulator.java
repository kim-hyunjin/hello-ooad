package dogdoor;

public class DogDoorSimulator {

	public static void main(String[] args) {
		DogDoor door = new DogDoor();
		Remote remote = new Remote(door);
		System.out.println("흰둥이가 밖으로 나가고 싶어 짖는다");
		remote.pressButton();
		System.out.println("흰둥이가 밖으로 나갔다");
		System.out.println("흰둥이가 볼일을 본다");
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
		}
		System.out.println("흰둥이가 밖에서 들어오지 못함");
		System.out.println("흰둥이가 짖기 시작한다.");
		System.out.println("주인이 리모컨을 집는다.");
		remote.pressButton();
		System.out.println("흰둥이가 안으로 들어온다.");
	}

}
