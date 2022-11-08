package prob1;

public class RefrigeratedItem extends Item {
	double temp = 0;

	RefrigeratedItem(double temp) {
		this.temp = temp;
	}

	RefrigeratedItem(Item i, double temp) {
		super(i.getName(), i.getWeight());
		this.temp = temp;
	}

	public double cost() {
		double cost = (2 * this.getWeight()) + (100 - temp) * 0.1;
		// alternative way
		// double cost = super.cost()+ (100-temp)*0.1;
		return cost;
	}

	public String toString() {
		return String.format("\nname=%s, cost=$%.2f, weight=%.2f, temp=%.2f degrees", name, cost(), getWeight(), temp);
	}
	
	
}
