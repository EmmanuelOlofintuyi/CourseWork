package prob2;

public class GreenMartianTest {

	public static void main(String[] args) {
		 testSpeakAndTeleportAndToString();
		 testEquals_success();
		 testEquals_fail();
		 testEqualsRedAndGreen_success();
	}
	
	public static void testSpeakAndTeleportAndToString() {
		System.out.println("-->testSpeakAndToString");
		GreenMartian g1 = new GreenMartian(100, 5);
		System.out.println("expected");
		System.out.println("Red Martian - id=100, vol=5");
		System.out.println("id=100, Grobldy Grock");
		System.out.println("id=100 teleport to venus");
		System.out.println("actual");
		System.out.println(g1.toString());
		System.out.println(g1.speak());
		System.out.println(g1.teleport("venus"));
	}
	
	public static void testEquals_success() {
		System.out.println("\n-->testSpeakAndToString");
		GreenMartian greg = new GreenMartian(3, 500);
		GreenMartian garry = new GreenMartian(3, 400);
		System.out.println("expected");
		System.out.println("true");
		System.out.println("actual");
		System.out.println(greg.equals(garry));
	}
	
	public static void testEquals_fail() {
		System.out.println("\n-->testSpeakAndToString");
		GreenMartian gloria = new GreenMartian(4, 500);
		GreenMartian greg = new GreenMartian(3, 400);
		System.out.println("expected");
		System.out.println("false");
		System.out.println("actual");
		System.out.println(gloria.equals(greg));
	}
	
	public static void testEqualsRedAndGreen_success() {
		System.out.println("\n-->testSpeakAndToString");
		RedMartian rocky = new RedMartian(3, 500);
		GreenMartian garry = new GreenMartian(3, 400);
		System.out.println("expected");
		System.out.println("true");
		System.out.println("actual");
		System.out.println(rocky.equals(garry));
	}
}
