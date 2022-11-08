package prob1;

public class Item {
	String name;
	private double weight;

	Item() {

	}

	Item(String name, double weight) {
		this.name = name;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public double getWeight() {
		return weight;
	}

	public double cost() {
		double cost = (2 * weight);
		return cost;
	}

	public String toString() {
		return String.format("\nname=%s, cost=$%.2f, weight=%.2f", name, cost(), weight);
	}
	
	
}
