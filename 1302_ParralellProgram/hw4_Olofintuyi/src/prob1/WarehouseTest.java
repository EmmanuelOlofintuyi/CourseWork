package prob1;


public class WarehouseTest {
	public static void main(String[] args) {
		testAddItem();
		newTestAddItem();
		testAddItem_3();
		testAddItem_10();
		testAddItem_11();
		testGetItem_LocNegative2();
		testGetItem_Loc0();
		testGetItem_Loc2();
		testGetItem_Loc4();
		testGetItemWithName_Found();
		testGetItemWithName_NotFound();
		testGetAverageTemp();
		testGetRefrigeratedItems();
		testGetTotalCost();
		testGetTotalCostRefrigerated();
		testRemoveItem_Loc1();
		testRemoveItem_Loc5();
		testRemoveItem_WithName();
		testToString();
	}

	public static void testAddItem() {
		System.out.println("-->testAddItem");
		Warehouse w = new Warehouse();
		Item i = new Item("Note Cards", 2);
		w.addItem(i);
		System.out.println("expected");
		System.out.println("1");
		System.out.println("actual");
		System.out.println(w.getNumItems());
	}

	public static void newTestAddItem() {
		System.out.println("-->newTestAddItem");
		Warehouse w = createWarehouseWith3Items();
		Item i = new Item("Flat Screen TV", 20);		
		w.addItem(i);
		System.out.println("expected");
		System.out.println("3");
		System.out.println("actual");
		System.out.println(w.getNumItems());
	}
	public static void testAddItem_3() {
		System.out.println("\n-->testAddItem_3");
		Warehouse w = createWarehouseWith3Items();
		System.out.println("expected");
		System.out.println("3");
		System.out.println("actual");
		System.out.println(w.getNumItems());
	}
	
	public static void testAddItem_10() {

		System.out.println("\n-->testAddItem_10"); 
		Warehouse w = createStoreWith10Item();
		System.out.println("expected"); 
		System.out.println("10"); 
		System.out.println("actual");
		System.out.println(w.getNumItems());
	}
	
	public static void testAddItem_11() {

		System.out.println("\n-->testAddItem_11"); 
		Warehouse w = createStoreWith10Item();
		Item i = new Item("extension cors", 5);
		w.addItem(i);
		System.out.println("expected"); 
		System.out.println("10"); 
		System.out.println("actual");
		System.out.println(w.getNumItems());
	}
	
	public static void testGetItem_LocNegative2() {
		System.out.println("\n-->testGetItem_LocNegative2");
		Warehouse w = createWarehouseWith3Items();
		System.out.println("expected");
		System.out.println("null");
		System.out.println("actual");
		System.out.println(w.getItem(-2));
	}

	public static void testGetItem_Loc0() {
		System.out.println("\n-->testGetItem_Loc0");
		Warehouse w = createWarehouseWith3Items();
		System.out.println("expected");
		System.out.println("Flat Screen TV");
		System.out.println("actual");
		System.out.println(w.getItem(0).getName());
	}
	
	public static void testGetItem_Loc2() {
		System.out.println("\n-->testGetItem_Loc2");
		Warehouse w = createWarehouseWith3Items();
		System.out.println("expected");
		System.out.println("Ice Cream");
		System.out.println("actual");
		System.out.println(w.getItem(2).getName());
	}
	
	public static void testGetItem_Loc4() {
		System.out.println("\n-->testGetItem_Loc4");
		Warehouse w = createWarehouseWith3Items();
		System.out.println("expected");
		System.out.println("null");
		System.out.println("actual");
		System.out.println(w.getItem(4));
	}

	public static void testGetItemWithName_Found() {
		System.out.println("\n-->testGetItemWithName_Found");
		Warehouse w = createWarehouseWith3Items();
		System.out.println("expected");
		System.out.println("Flat Screen TV");
		System.out.println("actual");
		System.out.println(w.getItem("Flat Screen TV").getName());
	}
	
	public static void testGetItemWithName_NotFound() {
		System.out.println("\n-->testGetItemWithName_NotFound");
		Warehouse w = createWarehouseWith3Items();
		System.out.println("expected");
		System.out.println("null");
		System.out.println("actual");
		System.out.println(w.getItem("Boxing Gloves"));
	}

	public static void testGetAverageTemp() {
		System.out.println("\n-->testGetAverageTemp");
		Warehouse w = createWarehouseWith5Items();
		System.out.println("expected");
		System.out.println("28");
		System.out.println("actual");
		System.out.println(w.getAverageTemp());
	}
	
	public static void testGetRefrigeratedItems() {
		System.out.println("\n-->testGetRefrigeratedItems");
		Warehouse w = createWarehouseWith5Items();
		RefrigeratedItem[] rI = w.getRefrigeratedItems();
		 
		System.out.println("expected");
		System.out.println("name=Ice Cream, cost=$16.00, weight=4.00, temp=20.00 degrees\r\n" + 
				"name=Green beans, cost=$14.00, weight=3.50, temp=30.00 degrees\r\n" + 
				"name=Ice Cream, cost=$14.60, weight=4.00, temp=34.00 degrees");
		System.out.println("actual");
		for(int i = 0; i < rI.length; i++) {
			 System.out.println(rI[i]);
		}
	}

	public static void testGetTotalCost() {
		System.out.println("\n-->testGetTotalCost");
		Warehouse w = createWarehouseWith5Items();
		System.out.println("expected");
		System.out.println("88.6");
		System.out.println("actual");
		System.out.println(w.getTotalCost());
	}

	public static void testGetTotalCostRefrigerated() {
		System.out.println("\n-->testGetTotalCostRefrigerated");
		Warehouse w = createWarehouseWith5Items();
		double sum = 0;
		RefrigeratedItem[] rI = w.getRefrigeratedItems();
		System.out.println("expected");
		System.out.println("44.6");
		System.out.println("actual");
		for(int i = 0; i < rI.length; i++) {
			sum += rI[i].cost();
		}
		double riTotalCost = sum;
		System.out.println(riTotalCost);
	}

	public static void testRemoveItem_Loc1() {
		System.out.println("\n-->testRemoveItem_Loc1");
		Warehouse w = createWarehouseWith5Items();
		System.out.println("expected");
		System.out.println("name=binder, cost=$4.00, weight=2.00");
		System.out.println("actual");
		System.out.println(w.removeItem(1));
	}
	
	public static void testRemoveItem_Loc5() {
		System.out.println("\n-->testRemoveItem_Loc5");
		Warehouse w = createWarehouseWith5Items();
		System.out.println("expected");
		System.out.println("null");
		System.out.println("actual");
		System.out.println(w.removeItem(5));
	}

	public static void testRemoveItem_WithName() {
		System.out.println("\n-->testRemoveItem_WithName");
		Warehouse w = createWarehouseWith5Items();
		System.out.println("expected");
		System.out.println("name=Flat Screen TV, cost=$40.00, weight=20.00");
		System.out.println("actual");
		System.out.println(w.removeItem("Flat Screen TV")+"\n");
	}

	public static void testToString() {
		System.out.println("\n-->testToString");
		Warehouse w = createWarehouseWith5Items();
		System.out.println("expected");
		System.out.println("\nname=Flat Screen TV, cost=$40.00, weight=20.00\r\n" + 
				"name=binder, cost=$4.00, weight=2.00\r\n" + 
				"name=Ice Cream, cost=$16.00, weight=4.00, temp=20.00 degrees\r\n" + 
				"name=Green beans, cost=$14.00, weight=3.50, temp=30.00 degrees\r\n" + 
				"name=Ice Cream, cost=$14.60, weight=4.00, temp=34.00 degrees\n");
		System.out.println("actual");
		System.out.println(w.toString());
	}

	// helper methods;
	public static Warehouse createWarehouseWith3Items() {
		Warehouse w = new Warehouse();
		Item i = new Item("Flat Screen TV", 20);
		w.addItem(i);

		Item i2 = new Item("binder", 2);
		w.addItem(i2);

		Item i3 = new Item("Ice Cream", 4);
		RefrigeratedItem rI = new RefrigeratedItem(i3, 20);
		w.addItem(rI);

		return w;
	}

	public static Warehouse createWarehouseWith5Items() {
		Warehouse w = createWarehouseWith3Items();
		
		Item i4 = new Item("Green beans", 3.5);
		RefrigeratedItem rI = new RefrigeratedItem(i4, 30);
		w.addItem(rI);
		
		Item i5 = new Item("Ice Cream", 4);
		RefrigeratedItem rI2 = new RefrigeratedItem(i5, 34);
		w.addItem(rI2);

		return w;

	}
	
	public static Warehouse createStoreWith10Item() {
		Warehouse w = new Warehouse();
		w.addItem(createTestItem("Football", 10.0));
		w.addItem(createTestItem("Basketball", 10.0));
		w.addItem(createTestItem("Hot Wheels", 10.0));
		w.addItem(createTestItem("PS4", 10.0));
		w.addItem(createTestItem("Binders", 10.0));
		w.addItem(createTestItem("Destiny", 10.0));
		w.addItem(createTestItem("Loose Leaf", 10.0));
		w.addItem(createTestItem("Air Jordan 1", 10.0));
		w.addItem(createTestItem("T Shirt", 10.0));
		w.addItem(createTestItem("Sweater", 10.0));
//		w.addItem(createTestItem("Sweat Pants", 10.0));
//		w.addItem(createTestItem("Shorts", 10.0));
//		w.addItem(createTestItem("Jeans", 10.0));
//		w.addItem(createTestItem("Socks", 10.0));
//		w.addItem(createTestItem("Under Shirt", 10.0));
//		w.addItem(createTestItem("Glasses", 10.0));
//		w.addItem(createTestItem("Fitted Cap", 10.0));
//		w.addItem(createTestItem("Boxers", 10.0));
//		w.addItem(createTestItem("Boxing Gloves", 10.0));
//		w.addItem(createTestItem("Jump Rope", 10.0));
		return w;
	}
	private static Item createTestItem(String name, double weight) {
		Item i1 = new Item(name, weight);

		return i1;
	}
	
}