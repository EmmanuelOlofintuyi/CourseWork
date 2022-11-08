package prob1;

public class ItemTest {

	public static void main(String[] args) {
		testRefrigeratedItem();

		testRefrigeratedItem2();

		testRefrigeratedItemCost();

		testRefrigeratedItemToString();
	}

	public static void testRefrigeratedItem() {
		RefrigeratedItem rI1 = new RefrigeratedItem(50);
		System.out.println("-->testRefrigeratedItem");
		System.out.println("expected");
		System.out.println("name=null, cost=$5.00, weight=0.00, temp=50.00 degrees");
		System.out.println("actual");
		System.out.println(rI1);

	}

	public static void testRefrigeratedItem2() {
		Item i = new Item("frozen pizza", 3);
		RefrigeratedItem rI2 = new RefrigeratedItem(i, 50);
		System.out.println("-->testRefrigeratedItem2");
		System.out.println("expected");
		System.out.println("frozen pizza, 3, 50");
		System.out.println("actual");
		System.out.println(rI2);

	}

	public static void testRefrigeratedItemCost() {
		Item i = new Item("frozen pizza", 3);
		RefrigeratedItem rI2 = new RefrigeratedItem(i, 50);
		//rI2.cost();
		System.out.println("-->testRefrigeratedItemCost");
		System.out.println("expected");
		System.out.println("11");
		System.out.println("actual");
		System.out.println(rI2.cost());
	}

	public static void testRefrigeratedItemToString() {
		Item i = new Item("frozen pizza", 3);
		RefrigeratedItem rI2 = new RefrigeratedItem(i, 50);
		System.out.println("-->testRefrigeratedItemToString");
		System.out.println("expected");
		System.out.println("name=frozen pizza, cost=$11.00, weight=3.00, temp=50.00 degrees");
		System.out.println("actual");
		System.out.println(rI2.toString());

	}
}
