package com.greatlearning.driven.core;
import java.util.Scanner;

public class PayMoneyTarget {
	public void checkTransaction(int array[],int targetNo) {
		Scanner in=new Scanner(System.in);
		//loops for target no as per users choice:
		int i=1;
		while(i<=targetNo) {
			int count=0; //used for 
			System.out.println("enter the value of target");
			int targetValue=in.nextInt();
			int sum=0;
			for(int j=0;j<array.length;j++) {
				sum=sum+array[j];
				if(sum>=targetValue) {
					System.out.println("Target achieved after "+ (j+1) + "transactions");
					count=1;
					break;
				}
				
			}
			i++;
			if(count==0) {
				System.out.println("target not achieved");
			}
		}
		
	
	}
}
