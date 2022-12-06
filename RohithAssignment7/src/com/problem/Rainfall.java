package com.problem;

import java.util.Scanner;

public class Rainfall {

	public static void main(String[] args) {
	
		/*Write a RainFall class that has the following field:
• an array of doubles that stores the rainfall for each of the 12 months of the year (where the first index
corresponds with January, the second with February, etc.)
The class should also have the following methods:
• a method that returns the total rainfall for the entire year
• a method that returns the average monthly rainfall for the year
• a method that returns the month with the most rain as a string
• a method that returns the month with the least rain as a string
Demonstrate the class in a program that takes 12 doubles from the user (take the doubles in the order of the
months of the year, the first corresponding to the rainfall in January, etc.). Do input validation: if the user inputs
a negative number, ignore it and continue asking them for input until you have 12 nonnegative doubles.
Once the user has given you all 12 doubles, create an instance of the RainFall class and call its methods,
printing out the total rainfall, the average monthly rainfall, the month with the most rain, and the month with the
least rain, each on a separate line.*/
		
		
		Scanner sc = new Scanner(System.in);
	
		String[] months = {"January", " Feb" ,"March", "April",
				"May", "June", "July", "Aug", "Sep", "Oct","Nov", "Dec"};
		System.out.println("Enter rainfall for all 12 months");
		
		double[] arr = new double[12];
		
		for (int i =0; i<arr.length; i++) {
			
			arr[i] = sc.nextDouble();
			
			if(arr[i]<0)
			{
				System.out.println("Enter positive number: ");
				arr[i] = sc.nextDouble();
			}
			
		}
		
		double totalRainfallOfAllMonths = totalRainfall(arr);
		
	    System.out.println("Total rainfall for the year is " + totalRainfallOfAllMonths);
	      
	    double avgRainfall;
	    
	    avgRainfall = totalRainfallOfAllMonths/12;
	    
	    System.out.println("Average rainfall is : " + avgRainfall);
	    
	    
	    String maxRainMonth = mostRain(arr, months);
	    
	    String minRainMonth = minRain(arr, months);
	    
	    System.out.println("Maximum value of rains is : " + maxRainMonth);
	    
	    System.out.println("Maximum value of rains is : " + minRainMonth);
	    
	    
	    
	    		sc.close();
	}
	public static double totalRainfall(double[] array)
	{
		double totalRainfall =0;
		 for(int i = 0; i<array.length; i++)
		    {
		    	totalRainfall = totalRainfall +array[i];
		    }
		return totalRainfall;
	}
	
	public static String mostRain(double[] array, String[] months) {
		
	    double max = array[0];
		for(int i = 1; i<array.length; i++) {
			
			if(array[i] > max)
			{
				max = array[i];
			}
			
		}
		  for(int i = 0; i< array.length; i++) {
		    	
		    	if(max == array[i])
		    	{
		    		return months[i];
		    	}
		  }
		return null;
		
	}
	
public static String minRain(double[] array, String[] months) {
		
	    double min = array[0];
		for(int i = 1; i<array.length; i++) {
			
			if(array[i] < min)
			{
				min = array[i];
			}
			
		}
		  for(int i = 0; i< array.length; i++) {
		    	
		    	if(min == array[i])
		    	{
		    		return months[i];
		    	}
		  }
		return null;	
		
	}
	
}
