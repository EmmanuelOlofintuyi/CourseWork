package prob1;

public class EmployeeUtilities {

	public EmployeeUtilities() {

	}

	public Employee getEmployeeWithMostHours(Employee[] emps) {
		Employee employee = emps[0];
		for (int i = 1; i < emps.length; i++) {
			if (emps[i].getTotalHours() > employee.getTotalHours()) {
				employee = emps[i];
			}
		}
		return employee;
	}

	public double[] getHoursArray(Employee[] emps) {
		double employeeHours[] = new double[emps.length];
		for (int i = 0; i < emps.length; i++) {
			employeeHours[i] = emps[i].getTotalHours();
		}
		return employeeHours;
	}

	public double getTotalPay(Employee[] emps) {
		double employeePay = 0;
		for (int i = 0; i < emps.length; i++) {
			employeePay += emps[i].getPay();
		}

		return employeePay;
	}
}
