package com.polymorphsim;

public class OverLoadingSample {

	// Arguments depends on dataType count or number
	private void empInfo(String name, int age, char gender, double height) {
		System.out.println("Employee info:" + name +'\t'+ age +'\n'+ gender +'\t'+ height);
	}
	
	// --> '\t' --> tab space
	// --> '\n' --> next line or new line
	
	public static void main(String[] args) {
		OverLoadingSample o = new OverLoadingSample();
		o.empInfo("ram", 33, 'm', 5.5);

	}
}
