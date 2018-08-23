package day_3;

public class NetSalary {
	private long employeeId;
	private String employeeName;
	private double hra;
	private double pf;
	private int pt=200;
	private double grossSalary;
	private double medical;
	private double netSalary;
	private double basicSalary;

public NetSalary(long employeeId,String employeeName,double basicSalary, double medical) {
	this.employeeId=employeeId;
	this.employeeName=employeeName;
	this.medical = medical;
	this.basicSalary = basicSalary;
}
public double netSalary() {
	hra = basicSalary/2;
	pf = basicSalary*12/100;
	grossSalary = hra+medical+basicSalary;
	netSalary = grossSalary-(pf+pt);
	return netSalary;
}
public void displayEmployeeDetails() {
	System.out.println("Employee Id:"+employeeId+"Employee Name:"+employeeName+"Net Salary is:"+netSalary);
}
}
