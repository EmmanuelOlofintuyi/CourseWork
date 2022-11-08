package prob1;

import java.util.ArrayList;

public class MartianManagerTest {
	public static void main(String[] args) {
		testAddMartian();
		testAddMartian_Teleporter();
		testAddMartian_Fail();
		testBattle();
		testContains();
		testNotContains();
		testGetMartianAt();
		testGetMartianClosestTo_id();
		testGetMartianClosestTo_Martian();
		testGetMartianWithId();
		testGetNumMartians();
		testGetNumTeleporters();
		testGetSortedMartians();
		testGetTeleprterAt();
		testGetTeleprterAt_Fail();
		testGroupSpeak();
		testGroupTeleport();
		testObliterateTeleporters();
		testRemoveMartian();
		testToString();
		
	}

	public static void testAddMartian() {
		System.out.println("-->testAddMartian");
		MartianManager m = new MartianManager();
		GreenMartian garry = new GreenMartian(10, 50);
		System.out.println("expected");
		System.out.println("true");
		System.out.println("1");
		System.out.println("actual");
		System.out.println(m.addMartian(garry));
		System.out.println(m.getNumMartians());
	}
	
	public static void testAddMartian_Teleporter() {
		System.out.println("-->testAddMartian_Teleporter");
		MartianManager m = new MartianManager();
		GreenMartian garry = new GreenMartian(10, 50);
		System.out.println("expected");
		System.out.println("true");
		System.out.println("1");
		System.out.println("actual");
		System.out.println(m.addMartian(garry));
		System.out.println(m.getNumTeleporters());
		
	} 

	public static void testAddMartian_Fail() {
		System.out.println("-->testAddMartian_Fail");
		MartianManager m = createMartianManagerWith6Martians();
		GreenMartian garry = new GreenMartian(10, 50);
		System.out.println("expected");
		System.out.println("false");
		System.out.println("6");
		System.out.println("actual");
		System.out.println(m.addMartian(garry));
		System.out.println(m.getNumMartians());
	}
	
	public static void testBattle() {
		System.out.println("\n-->testBattle");
		ArrayList<Martian> invaders = addInvaders();
		MartianManager m = createMartianManagerWith6Martians();
		System.out.println("expected");
		System.out.println("[Green Martian - id=10, vol=50, Red Martian - id=25, vol=1, ten=52, Green Martian - id=30, vol=15]");
		System.out.println("actual");
		System.out.println(m.battle(invaders));
	}

	public static void testContains() {
		System.out.println("\n-->testContains");
		MartianManager m = createMartianManagerWith6Martians();
		System.out.println("expected");
		System.out.println("true");
		System.out.println("actual");
		System.out.println(m.contains(10));
	}

	public static void testNotContains() {
		System.out.println("\n-->testNotContains");
		MartianManager m = createMartianManagerWith6Martians();
		System.out.println("expected");
		System.out.println("false");
		System.out.println("actual");
		System.out.println(m.contains(578));
	}

	public static void testGetMartianAt() {
		System.out.println("\n-->testGetMartianAt");
		MartianManager m = createMartianManagerWith6Martians();
		System.out.println("expected");
		System.out.println("Red Martian - id=15, vol=1, ten=10");
		System.out.println("actual");
		System.out.println(m.getMartianAt(3));
	}

	public static void testGetMartianClosestTo_id() {
		System.out.println("\n-->testGetMartianClosestTo_id");
		MartianManager m = createMartianManagerWith6Martians();
		System.out.println("expected");
		System.out.println("Red Martian - id=25, vol=1, ten=52");
		System.out.println("actual");
		System.out.println(m.getMartianClosestTo(30));
	}

	public static void testGetMartianClosestTo_Martian() {
		System.out.println("\n-->testGetMartianClosestTo_Martian");
		MartianManager m = createMartianManagerWith6Martians();
		RedMartian rigby = new RedMartian(45, 600);
		System.out.println("expected");
		System.out.println("Red Martian - id=35, vol=1, ten=600");
		System.out.println("actual");
		System.out.println(m.getMartianClosestTo(rigby));
	}

	public static void testGetMartianWithId() {
		System.out.println("\n-->testGetMartianWithId");
		MartianManager m = createMartianManagerWith6Martians();
		System.out.println("expected");
		System.out.println("Red Martian - id=15, vol=1, ten=10");
		System.out.println("actual");
		System.out.println(m.getMartianWithId(15));
	}

	public static void testGetNumMartians() {
		System.out.println("\n-->testGetNumMartians");
		MartianManager m = createMartianManagerWith6Martians();
		System.out.println("expected");
		System.out.println("6");
		System.out.println("actual");
		System.out.println(m.getNumMartians());
	}

	public static void testGetNumTeleporters() {
		System.out.println("\n-->testGetNumTeleporters");
		MartianManager m = createMartianManagerWith6Martians();
		System.out.println("expected");
		System.out.println("3");
		System.out.println("actual");
		System.out.println(m.getNumTeleporters());
	}

	public static void testGetSortedMartians() {
		System.out.println("\n-->testGetSortedMartians");
		MartianManager m = createMartianManagerWith6Martians();
		System.out.println("expected");
		System.out.println(
				"[Green Martian - id=10, vol=50, Red Martian - id=15, vol=1, ten=10, Red Martian - id=25, vol=1, ten=52, Green Martian - id=30, vol=15, Red Martian - id=35, vol=1, ten=600, Green Martian - id=55, vol=700]");
		System.out.println("actual");
		System.out.println(m.getSortedMartians());

	}

	public static void testGetTeleprterAt() {
		System.out.println("\n-->testGetTeleprterAt");
		MartianManager m = createMartianManagerWith6Martians();
		System.out.println("expected");
		System.out.println("Green Martian - id=30, vol=15");
		System.out.println("actual");
		System.out.println(m.getTeleprterAt(2));
	}

	public static void testGetTeleprterAt_Fail() {
		System.out.println("\n-->testGetTeleprterAt_Fail");
		MartianManager m = createMartianManagerWith6Martians();
		System.out.println("expected");
		System.out.println("null");
		System.out.println("actual");
		System.out.println(m.getTeleprterAt(3));
	}

	public static void testGroupSpeak() {
		System.out.println("\n-->testGroupSpeak");
		MartianManager m = createMartianManagerWith6Martians();
		System.out.println("expected");
		System.out.println("id=10, Grobldy Grock\r\n" + 
				"id=25, Rubldy Rock\r\n" + 
				"id=30, Grobldy Grock\r\n" + 
				"id=15, Rubldy Rock\r\n" + 
				"id=35, Rubldy Rock\r\n" + 
				"id=55, Grobldy Grock");
		System.out.println("actual");
		System.out.println(m.groupSpeak());
	}
	
	public static void testGroupTeleport() {
		System.out.println("\n-->testGroupTeleport");
		MartianManager m = createMartianManagerWith6Martians();
		System.out.println("expected");
		System.out.println("Green Martian - id=10, vol=50\r\n" + 
				"Green Martian - id=30, vol=15\r\n" + 
				"Green Martian - id=55, vol=700");
		System.out.println("actual");
		System.out.println(m.groupTeleport());
	}
	
	public static void testObliterateTeleporters() {
		System.out.println("\n-->testObliterateTeleporters");
		MartianManager m = createMartianManagerWith6Martians();
		System.out.println("expected");
		System.out.println("Martians:\r\n" + 
				"Red Martian - id=25, vol=1, ten=52\r\n" + 
				"Red Martian - id=15, vol=1, ten=10\r\n" + 
				"Red Martian - id=35, vol=1, ten=600\r\n" + 
				"Teleporters:\r\n");
		System.out.println("actual");
		m.obliterateTeleporters();
		System.out.println(m.toString());
	}
	
	public static void testRemoveMartian() {
		System.out.println("\n-->testRemoveMartian");
		MartianManager m = createMartianManagerWith6Martians();
		System.out.println("expected");
		System.out.println("Red Martian - id=15, vol=1, ten=10\r\n" );
		System.out.println("actual");
		m.obliterateTeleporters();
		System.out.println(m.removeMartian(15));
	}
	
	public static void testToString() {
		System.out.println("\n-->testRemoveMartian");
		MartianManager m = createMartianManagerWith6Martians();
		System.out.println("expected");
		System.out.println("Green Martian - id=10, vol=50\r\n" + 
				"Red Martian - id=25, vol=1, ten=52\r\n" + 
				"Green Martian - id=30, vol=15\r\n" + 
				"Red Martian - id=15, vol=1, ten=10\r\n" + 
				"Red Martian - id=35, vol=1, ten=600\r\n" + 
				"Green Martian - id=55, vol=700\r\n" + 
				"Teleporters:\r\n" + 
				"Green Martian - id=10, vol=50\r\n" + 
				"Green Martian - id=30, vol=15\r\n" + 
				"Green Martian - id=55, vol=700");
		System.out.println("actual");
		System.out.println(m.toString());
	}
	
	// System.out.println(m.toString());
	// helper methods
	public static MartianManager createMartianManagerWith6Martians() {
		MartianManager m = new MartianManager();

		GreenMartian garry = new GreenMartian(10, 50);
		m.addMartian(garry);

		RedMartian randy = new RedMartian(25, 52);
		m.addMartian(randy);

		GreenMartian green = new GreenMartian(30, 15);
		m.addMartian(green);

		RedMartian strawberry = new RedMartian(15, 10);
		m.addMartian(strawberry);

		RedMartian red = new RedMartian(35, 600);
		m.addMartian(red);

		GreenMartian guava = new GreenMartian(55, 700);
		m.addMartian(guava);

		return m;
	}

	public static ArrayList<Martian> addInvaders() {
		ArrayList<Martian> invaders = new ArrayList<Martian>();
		GreenMartian greg = new GreenMartian(3, 500);
		GreenMartian garry = new GreenMartian(10, 400);
		RedMartian r1 = new RedMartian(100, 5);
		RedMartian r2 = new RedMartian(130, 5, 10);
		RedMartian r3 = new RedMartian(1024, 25, 10);
		invaders.add(greg);
		invaders.add(garry);
		invaders.add(r1);
		invaders.add(r2);
		invaders.add(r3);

		return invaders;
	}

}
