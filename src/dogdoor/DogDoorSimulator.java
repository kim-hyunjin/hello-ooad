package dogdoor;

public class DogDoorSimulator {

	public static void main(String[] args) {
		DogDoor door = new DogDoor();
		BarkRecognizer recognizer = new BarkRecognizer(door);
		System.out.println("흰둥이가 밖으로 나가고 싶어 짖는다");
		recognizer.recognize("왈왈");
		System.out.println("흰둥이가 밖으로 나갔다");
		System.out.println("흰둥이가 볼일을 본다");
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
		}
		System.out.println("흰둥이가 밖에서 들어오지 못함");
		System.out.println("흰둥이가 짖기 시작한다.");
		recognizer.recognize("왈왈");
		System.out.println("흰둥이가 안으로 들어온다.");
	}

}
