package prob1;


public class Warehouse {
	Item[] items = new Item[10];
	private int numItems;

	Warehouse() {

	}

	public void addItem(Item item) {
		for (int i = 0; i < items.length; i++) {
			if (items[i] == null) {
				items[i] = item;
				numItems++;
				return;
			}
		}
	}

	public Item getItem(int i) {
		if ((items.length > i) && (i >= 0)) {
			return items[i];
		} else {
			return null;
		}
	}

	public Item getItem(String name) {
		for (int i = 0; i < items.length; i++) {
			if (items[i] != null) {
				if (items[i].getName().equals(name)) {
					return items[i];
				}
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

		for (int i = 0; i < items.length; i++) {
			if (items[i] instanceof RefrigeratedItem) {
				count++;
				RefrigeratedItem refrigeratedItem = (RefrigeratedItem) items[i];
				sum += refrigeratedItem.temp;
			}
		}
		double averageTemp = sum / count;
		return averageTemp;
	}

	public RefrigeratedItem[] getRefrigeratedItems() {
		int count = 0;
		for (int i = 0; i < items.length; i++) {
			if (items[i] instanceof RefrigeratedItem) {
				count++;
			}
		}
		RefrigeratedItem[] rf = new RefrigeratedItem[count];
		int j = 0;
		for (int i = 0; i < items.length; i++) {
			if (items[i] instanceof RefrigeratedItem) {
				rf[j] = (RefrigeratedItem) items[i];
				j++;
			}
		}
		return rf;
	}

	public double getTotalCost() {
		double sum = 0;
		for (int i = 0; i < numItems; i++) {
			double cost = items[i].cost();
			sum += cost;
		}
		return sum;
	}

	public Item removeItem(int i) {
		if (i < 0 || items.length > 20) {
			return null;
		}
		if (items[i] != null) {
			Item toRemove = items[i];
			if (i == items.length - 1) {
				items[i] = null;
			}
			for (; i < items.length - 1; i++) {
				items[i] = items[i + 1];
			}
			return toRemove;
		}
		return null;
	}

	public Item removeItem(String Name) {
		for (int i = 0; i < items.length; i++) {
			if (items[i].getName().equals(Name)) {
				Item toRemove = items[i];
				if (i == items.length - 1) {
					items[i] = null;
				}
				for (; i < items.length - 1; i++) {
					items[i] = items[i + 1];
				}
				return toRemove;
			}
		}

		return null;
	}

	public String toString() {
		String s = "";
		for(int i = 0; i < numItems; i++) {
			s += items[i].toString();
		}
		return s;
	}
}
