package com.polymorphsim;

public class GreensBank extends HdfcBank  {
	
	@Override
	public void savingsAcc() {
		System.out.println("6%");
		
	}
	
	@Override
	public void currentAcc() {
		System.out.println("8%");
//		super.currentAcc();--> parent class method
	}

	
	public static void main(String[] args) {
		GreensBank g = new GreensBank();
		g.savingsAcc();
		g.currentAcc();
		g.loan("13");
	}
}
