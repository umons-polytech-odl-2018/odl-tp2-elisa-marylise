package exercise1;

import exercise2.Payable;

public abstract class Employee implements Payable {

	private String name;
	private int Sales = 0;
	private int workedHours=0;

	Employee(String name) {
		this.name = name;
	}

	public abstract int computeSalary();

	public void sell() {  Sales++; }
	public void workOneHour() { workedHours++; }
	public String getName() {
		return name;
	}

	public int getWorkedHours(){return workedHours;}
	public int getSales(){return Sales;}

}
