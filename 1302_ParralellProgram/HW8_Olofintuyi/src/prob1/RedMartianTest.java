package prob1;

public class RedMartianTest {
	public static void main(String[] args) {
		testSpeakAndToString();
		testEquals_success();
		testEquals_fail();
	}

	public static void testSpeakAndToString() {
		System.out.println("-->testSpeakAndToString");
		RedMartian r1 = new RedMartian(100, 5);
		System.out.println("expected");
		System.out.println("Red Martian - id=100, vol=1, ten=5");
		System.out.println("id=100 Rubldy Rock");
		System.out.println("actual");
		System.out.println(r1.toString());
		System.out.println(r1.speak());
	}

	public static void testEquals_success() {
		System.out.println("\n-->testSpeakAndToString");
		RedMartian rocky = new RedMartian(3, 500);
		GreenMartian garry = new GreenMartian(3, 400);
		System.out.println("expected");
		System.out.println("true");
		System.out.println("actual");
		System.out.println(rocky.equals(garry));
	}

	public static void testEquals_fail() {
		System.out.println("\n-->testSpeakAndToString");
		RedMartian ralph = new RedMartian(3, 500);
		GreenMartian gart = new GreenMartian(4, 400);
		System.out.println("expected");
		System.out.println("false");
		System.out.println("actual");
		System.out.println(ralph.equals(gart));
	}
}
