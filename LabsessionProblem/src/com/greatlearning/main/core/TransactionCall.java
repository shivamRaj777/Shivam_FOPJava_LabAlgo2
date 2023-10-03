package com.greatlearning.main.core;
import com.greatlearning.driven.core.*;
import java.util.Scanner;

public class TransactionCall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Num;
		Scanner sc=new Scanner(System.in);
		
			System.out.println("enter the size of transactions array ");
			Num=sc.nextInt();
			System.out.println("Enter the values of array");
			int array[]=new int[Num];
			for(int i=0;i<Num;i++) {
				array[i]=sc.nextInt();
			}
			//now for the target to be achieved
			System.out.println("enter the total no of targets that needs to be achieved ");
			int targetNo =sc.nextInt();
			
			PayMoneyTarget transactionService =new PayMoneyTarget();
			transactionService.checkTransaction(array, targetNo);
			sc.close();

	}

}
