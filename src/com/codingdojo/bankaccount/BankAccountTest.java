package com.codingdojo.bankaccount;

public class BankAccountTest {
	
	public static void main(String[] args) {
		
		BankAccount account = new BankAccount();
		
		account.deposit("checking", 500);
		account.deposit("savings", 100);
		account.getBalances();
		
		
		account.withdraw("checking", 75);
		account.getBalances();
	}
}
