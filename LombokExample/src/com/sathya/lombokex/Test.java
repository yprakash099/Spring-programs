package com.sathya.lombokex;

public class Test {

	public static void main(String[] args) {
		Employee employee = new Employee(111,"Anvesh",20000.45);
		System.out.println(employee);
		
		Employee employee2 = new Employee();
		employee2.setEmpId(222);
		employee2.setEmpName("Ram");
		employee2.setEmpSalary(30000.56);
		System.out.println(employee2.getEmpId()+" "+employee2.getEmpName()+" "+employee2.getEmpSalary());

	}

}
