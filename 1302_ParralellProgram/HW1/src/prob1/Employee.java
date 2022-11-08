package prob1;

public class Employee {
private double[] hours;
private String name;
private double payRate;

	public Employee(String name, double payRate){
		this.name = name;
		this.payRate = payRate;
		this.hours = new double[7];
	}

	public double getHours(int day) {
		/*
		 * when trying to return an integer from an array format is nameOfArray[parameter]
		 */
		return hours[day];
		
	}

	public String getName() {
		return name;
	}

	public int getNumDaysWorked() {
		/*
		 * 
		 */
		int i = 0;
		for(double day: hours) {
			if( day > 0) {
				i++;
			}
		}
		return i;
	}
	
	public double getPay(){
		//Hours work through out the Weekdays are paid at the payRate  

		/* 
		 * this is for workers that worked over 40 hours and are
		 * receive OverTime Payment (payRate*1.5)
		 */
		double hours = getWeekdayHours();
		double pay;
		if(  hours > 40) {
			double excessHours = hours - 40; 
			double otPayRate = payRate * 1.5;
			 pay = (40 * payRate) + (excessHours * otPayRate);
			
		}
		
		else {
			pay = hours * payRate;
		}
		/*
		 * this represents the pay for hours worked on the weekends by calling getWeekendHours() method
		 * and multiplying by twice the regular pay  
		 */
		pay += getWeekendHours()*payRate*2;
		
		if(getNumDaysWorked() == 7) {
			pay += 50;
		}
		
				return pay;
		
	}
		
	
	public double getPayRate() {
		return payRate; 
	}
	
	public double getTotalHours(){
		double count = 0;
		for(double days : hours) {
			/*
			 * days is the value of an element in each position in the array
			 * count is adding every valuable in the array  
			 */
			count += days;
		}
		return count;
	}
	
	public double getWeekdayHours() {
		double hours = 0;
		for(int i = 0; i <5; i++)
			hours += this.hours[i];
		return hours;
	}
		

	public double getWeekendHours() {
		//this represents the Weekend by using the index 5 and 6
		return hours[5] + hours[6];
	}
	
	public static void main(String[] args) {
		
	}
	
	public void mergeEmployee(Employee e){
		for(int i = 0; i<7; i++ )
			this.hours[i] += e.hours[i];
	}
	
	public void newWeek() {
		hours = new double[7];
	}
	
	public void setHours(int day, double hours) {
		//System.out.println (day);
		//System.out.println (hours);
		this.hours[day] = hours;
	}
	
	public String toString(){
		return "Name: " + name + ", PayRate" + payRate +
				"\nHours:Mons:" + hours[0] + " Tues:" + hours[1] + " Wed:" + hours[2] + " Thu:" + hours[3] + " Fri:" + hours[4] + " Sat:" + hours[5] + " Sun:" + hours[6] + 
				"\nDays Worked:" + getNumDaysWorked() + ", Total Hours:" + getTotalHours() +
				"\nWeekday hours:" + getWeekdayHours() + ", Weekend hours: " + getWeekendHours() + 
				"\nTotal pay: " + getPay();
				
				
	}
}
