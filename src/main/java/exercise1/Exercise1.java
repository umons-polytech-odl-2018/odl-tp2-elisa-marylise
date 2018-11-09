package exercise1;

public class Exercise1 {
	public Employee buildFixedSalaryEmployee(String name, int fixedSalary) {


		return new FixedSalaryEmployee(String name, int fixedSalary) ;
	}

	public Employee buildBaseSalaryPlusCommissionEmployee(String name, int baseSalary, int commission) {

		return new BaseSalaryPlusCommissionEmployee(String name, int baseSalary, int commission);
	}

	public Employee buildWorkHourSalaryEmployee(String name, int hourlyRoute) {

		return new WorkHourSalaryEmployee(String name, int hourlyRoute);
	}
}
