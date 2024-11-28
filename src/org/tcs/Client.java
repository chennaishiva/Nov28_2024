package org.tcs;
//child class 2
public class Client extends Company {

	public void clientAddress() {
		System.out.println("Anna nagar");
	}
	
	public static void main(String[] args) {
		Client c = new Client();
		c.clientAddress();
		c.companyId();
		c.companyName();
	}
}
