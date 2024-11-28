package com.cts;

public class DataTypes {

	public void add() {

		//dataType variableName = variableValue;
		
		byte age = 127;
		short empId = 32767;
		int appNo = 2147483647;
		long phno = 7448432188l;
		
		float avg = 12344.65432345f;
		double newAvg = 12345.4565432;
		
		char gender = 'm';
		String name = "ram";
		
		boolean status = false;
		
		System.out.println(age);
		System.out.println(empId);
		System.out.println(appNo);
		System.out.println(phno);
		System.out.println(avg);
		System.out.println(newAvg);
		System.out.println(gender);
		System.out.println(name);
		System.out.println(status);
		
		System.out.println("My name is :" +name);
		System.out.println(age + 100);
	}
	
	public static void main(String[] args) {
		DataTypes d = new DataTypes();
		d.add();
	}
}
