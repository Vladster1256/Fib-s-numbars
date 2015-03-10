package math.controller;

public class FibCounter
{
	public int firstNumber = 0;
	public int secondNumber = 1;
	
	public int calculateFib(int upToNumber)
	{
		int calculateNumber = 0;
		for(int position = 0; position < upToNumber; position++)
		{
			calculateNumber = firstNumber + secondNumber;
			firstNumber = secondNumber;
			secondNumber = calculateNumber;
			System.out.println(firstNumber);
		}
		return calculateNumber;
	}
}
