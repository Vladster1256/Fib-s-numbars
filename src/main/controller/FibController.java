package main.controller;

import java.util.Scanner;



public class FibController
{
	public Scanner $console;
	
	
	public FibController()
	{
		$console = new Scanner(System.in);
	}
	
	public void start()
	{
		
		System.out.println("Please enter the int of what position you would like to calculate in the Fibbonacci sequence");
		double toWhatPosition = $console.nextDouble();
		calculateFib(toWhatPosition);
	}
	

	
	public void calculateFib(double upToNumber)
	{
		long startTime =System.currentTimeMillis();
		double firstNumber = 0;
		double secondNumber = 1;
		double temp = 0;
		double maxPosition = upToNumber;
		System.out.println("Now calculating to position: " + upToNumber + " in the Fibonacci sequence.");
		for(double position = 0; position < maxPosition; position++)
		{
			temp = firstNumber + secondNumber;
			firstNumber = secondNumber;
			secondNumber = temp;
			System.out.println(firstNumber);
		}
		long endTime = System.currentTimeMillis();
		System.out.println("The time it took to perform this opperation was " + (endTime - startTime) + " milliseconds");
		System.out.println();
		start();
	}
}
