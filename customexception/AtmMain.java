package com.customexception;

public class AtmMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Atm a1 = new Atm(1233);
       Atm a2 = new Atm(1234);
       a1.checkPin();
       a2.checkPin();
	}

}
