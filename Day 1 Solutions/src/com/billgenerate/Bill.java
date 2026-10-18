package com.billgenerate;
import java.util.Scanner;
public class Bill {
  public static void main(String [] args) {
	
	  
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the Amount");
	  int amount = sc.nextInt();
	  int discount ;
	  
	  if(amount <= 5000) {
		  discount = 10;
	  }
	  else if(amount <= 10000) {
		  discount = 20;
	  }
	  else if(amount <= 20000) {
		  discount = 25; 
	  }
	  else {
		  discount = 35;
	  }
	  
	  int discount_amt = (amount*discount)/100;
	  int final_amt = amount - discount_amt;
	  
	  System.out.println("Total Bill After Discount: " + discount + "% " + final_amt);
	  
	  sc.close();
  }
}
