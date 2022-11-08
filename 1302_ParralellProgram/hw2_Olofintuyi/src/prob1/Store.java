package prob1;
import emps.Employee;
public class Store {

	public Employee[] emps;
	private int numEmps;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee("Will", 22.33);
	}
	public Store() {
		this.numEmps = 0;
		emps = new Employee [20];
	}
	
	public void addEmployee(Employee e) {
		for(int i = 0; i < emps.length; i++) {
			if(emps[i] == null) {
				emps[i] = e;
				return;
			}
		}
	}
	
	public Employee getEmployee(int i) {
		if((emps.length > i) && (i >= 0)) {
			return emps[i];
		}
		else {
			return null;
		}
	}
	
	public Employee getEmployeeWithName(String findName){
		for(int i = 0; i < emps.length; i++) {
			if(emps[i]!=null) {
				if(emps[i].getName().equals(findName)) {
					return emps[i];
				}
			}
		}
		return null;
	}
	
	public int getNumEmployees() {
		int count = 0;
		for(int i = 0; i < emps.length; i++) {
			if(emps[i]!=null) {
				count++;
			}
		}
		return count;
	}
	
	public double getTotalHours() {
		int sum = 0;
		for(int i = 0; i < emps.length; i++) {
			if(emps[i]!=null) {
				sum += emps[i].getTotalHours();
			}
		}
		return sum;
	}
	
	public double getTotalPay() {
		int sum = 0;
		for(int i = 0; i < emps.length; i++) {
			if(emps[i]!=null) {
				sum += emps[i].getPay();
			}
		}
		return sum;
	}
	
	public Employee removeEmployee(int i) {
		if(i<0 || emps.length> 20) {
			return null;
		}
		if(emps[i]!=null) {
			Employee toRemove = emps[i];
			if(i == emps.length-1) {
				emps[i] = null;
			}
			for(; i < emps.length - 1; i++) {
				emps[i] = emps[i+1];
			}
			return toRemove;
		}
		return null;
	}
	
	public String toString() {
		String S1 = 
				"Payroll Report/n" +
				 String.format("/nNum Employees: %d, total hrs: %.2f, total pay= $%,.2f", getNumEmployees(), getTotalHours(), getTotalPay());
				for(int employee = 0; employee < emps.length; employee++) {
					if(emps[employee] != null) {
					S1 += "/nPay Stub"+
							"/n--------"+
							emps[employee].toString();
					}
				}
				return S1;
	}
}
