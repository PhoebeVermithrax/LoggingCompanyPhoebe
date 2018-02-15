//Import Scanner so as to get input from the user.
import java.util.Scanner;

class LoggingCompany {
	
	public static void main(String[] args) {
		//This will allow for the user to enter their input, then save it.
		Scanner logs = new Scanner(System.in);
		//Create double variables to hold the length, weight and the number of logs that
		//can be held in a truck.
		double logLength, logWeight, numOfLogs;
		//Ask the user to input the length of the logs.
		System.out.println("Enter the length of the logs: ");
		//Store the number that the user inputed into the variable. .nextDouble is the
		//method dealing with numbers.
		logLength = logs.nextDouble();
		//To get the weight of the log, multiply the log length by 20.
		logWeight = logLength * 20;
		//To get the number of logs that can be held in a truck, divide the weight by
		//1100.
		numOfLogs = 1100 / logWeight;
		//Output the log weight.
		System.out.println("The weight of the logs are: " + logWeight);
		//Output the number of logs.
		System.out.println("The number of the logs that can go into a truck are: " + numOfLogs);
		
	}
	

}
