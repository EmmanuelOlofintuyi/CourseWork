package prob1;

public class Car {
	private double fuelCapacity;
	private double fuelEfficiency;
	private double fuelLevel;
	private double totalDistance;
	
		public Car(double fuelCapacity, double fuelEfficiency) {
			// variables attached to objects only pertain to that object. 
			// if a different object  used the same variable that variable would effect the new object
			totalDistance = 0;
			fuelLevel = 0;
			this.fuelCapacity = fuelCapacity;
			this.fuelEfficiency = fuelEfficiency;
		}
		
		public Car(double fuelCapacity, double fuelEfficiency, double fuelLevel) {
			totalDistance = 0;
			this.fuelCapacity = fuelCapacity;
			this.fuelEfficiency = fuelEfficiency;
			this.fuelLevel = fuelLevel;
			
		}
		
		public void drive(double time, double rate) {
			//d=r*t
			double distance = rate * time;
			//f=d/e
			double fuelCost = distance / fuelEfficiency;
			// MD = f*e
			double maxDistance = fuelLevel*fuelEfficiency;
			
			
			if(fuelLevel >= fuelCost) {
				/*
				 * if fuel level is greater than or equal to fuel cost(if we have enough fuel to go the desired distance)
				 * it will increment total distance and take away from gas tank. other words keep driving untill 
				 * we desire to stop  
				 */
				totalDistance += distance;
				fuelLevel -= fuelCost;
			}	
			else {
				/*
				 * this is for when we run out of gas before we reach desired destination,
				 * which we would add  the total distance with the distance that we already have traveled 
				 */
				totalDistance += maxDistance;
				fuelLevel = 0;
			}
		}
		
		public void fillUp(double amount) {
			double desiredFuel = fuelLevel;
			 desiredFuel += amount;
			  if(desiredFuel <= fuelCapacity) {
				  fuelLevel = desiredFuel;
			  }
			  else {
				  fuelLevel = fuelCapacity;
			  }
				
		}

		public double getFuelEfficiency() {
			return fuelEfficiency;
		}
		
		public double getFuelCapacity() {
			return fuelCapacity;
		}

		public double getFuelLevel() {
			return fuelLevel;
		}		
		
		public double getTotalDistance() {
			return totalDistance;
		}		
		
		public String toString() {
			return	"fuelLevel=" + fuelLevel + ", totalDistance=" + totalDistance +
					", fuelCapacity=" + fuelCapacity + ", fuelEfficiency=" +  fuelEfficiency; 		
					}
		

}
