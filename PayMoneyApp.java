package com.lijo.gl.paymoney;

import java.util.Arrays;
import java.util.Scanner;

public class PayMoneyApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of transaction array");
		int size = sc.nextInt();
		int [] transactions = new int[size];
		for (int i = 0; i < transactions.length; i++) {
			System.out.println("Enter the Daily Income");
			transactions [i]=sc.nextInt();
			
		}
		
		System.out.println("Given Transaction Array:  "+Arrays.toString(transactions));
		System.out.println("enter the total no of target that needs to be achived");
		int numberofTarget = sc.nextInt();
		for(int i=0;i<numberofTarget;i++)  {
			System.out.println("Enter the target amount:");
			int targetAmount = sc.nextInt();
			int sum=0;
			for (int j = 0; j < transactions.length; j++)  {
				sum+=transactions[j];
				if(sum>=targetAmount) {
					System.out.println("Target achieved after "+(j+1)+" transactions");
					break;
				}
				
				else
					System.out.println("Given target is not achieved");
			}
		}

	}

}
