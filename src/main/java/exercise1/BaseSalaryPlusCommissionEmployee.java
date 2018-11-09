package exercise1;

public class BaseSalaryPlusCommissionEmployee extends Employee{

	public int baseSalary;
	public int commission;
	public int Salary=baseSalary+getSales()*commission;


	public int getBaseSalary(){return baseSalary;}
}
