package prob1;

import java.util.ArrayList;

public class Warehouse {
	ArrayList<Item> items = new ArrayList<Item>();
	private int numItems;

	Warehouse() {

	}

	public boolean addItem(Item item) {
		if(items.contains(item)) {
			return false;

		}
		else{
			items.add(item);
			numItems++;
			return true;
		}
//		for (int i = 0; i < items.size(); i++) {
//			if (items.get(1) == null) {
//				items.get(i) = item;
//				numItems++;
//				return;
//			}
//		}
	}

	public Item getItem(int i) {
		if(i < 0 || i >= numItems) {
			return null;
		}
		return items.get(i);
	}

	public Item getItem(String name) {
		for (int i = 0; i < items.size(); i++) {
			if (items.get(i).getName().equals(name)) {
				return items.get(i);
			}

		}
		return null;
	}

	public int getNumItems() {

		return numItems;
	}

	public double getAverageTemp() {
		int count = 0;
		double sum = 0;

		for (int i = 0; i < items.size(); i++) {
			if (items.get(i) instanceof RefrigeratedItem) {
				count++;
				RefrigeratedItem refrigeratedItem = (RefrigeratedItem) items.get(i);
				sum += refrigeratedItem.temp;
			}
		}
		double averageTemp = sum / count;
		return averageTemp;
	}

	public RefrigeratedItem[] getRefrigeratedItems() {
		int count = 0;
		for (int i = 0; i < items.size(); i++) {
			if (items.get(i) instanceof RefrigeratedItem) {
				count++;
			}
		}
		RefrigeratedItem[] rf = new RefrigeratedItem[count];
		int j = 0;
		for (int i = 0; i < items.size(); i++) {
			if (items.get(i) instanceof RefrigeratedItem) {
				rf[j] = (RefrigeratedItem) items.get(i);
				j++;
			}
		}
		return rf;
	}

	public double getTotalCost() {
		double sum = 0;
		for (int i = 0; i < numItems; i++) {
			double cost = items.get(i).cost();
			sum += cost;
		}
		return sum;
	}

	public Item removeItem(int i) {
		if(i < 0 || i >= numItems) {
			return null;
		}
		Item it = items.remove(i);
		return it;
	}
//		if (i < 0 || items.length > 20) {
//			return null;
//		}
//		if (items[i] != null) {
//			Item toRemove = items[i];
//			if (i == items.length - 1) {
//				items[i] = null;
//			}
//			for (; i < items.length - 1; i++) {
//				items[i] = items[i + 1];
//			}
//			return toRemove;
//		}
//		return null;
// }

	public Item removeItem(String Name) {
		Item toRemove = null;
		Item dummy = new Item(Name, 0);
		int i = items.indexOf(dummy);
		if(i >= 0) {
			 toRemove = items.get(i);
		}
		items.remove(toRemove);
//		for (int i = 0; i < items.size(); i++) {
//			if (items.get(i).getName().equals(Name)) {
//				 toRemove = items.remove(i);
//			}
//		}

//				for (; i < items.length - 1; i++) {
//					items[i] = items[i + 1];
//				}
//				return toRemove;
//			}
//		}

		return toRemove;
	}

	public String toString() {
		String s = "";
		for (int i = 0; i < numItems; i++) {
			s += items.get(i).toString();
		}
		return s;
	}
}
