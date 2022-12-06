package com.problem;

import java.util.*;

public class PhoneNumbers {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		String[] names = new String[30];
		names[0] = "Wang"; names[1] = "Marcia";
		names[2] = "Rita"; names[3] = "Jennifer";
		names[4] = "Quan"; names[5] = "Neil";
		names[6] = "Judy"; names[7] = "Arlene";
		names[8] = "LaWanda"; names[9] = "Deepak";
		String numbers[] = new String[30];
		numbers[0] = "(847) 341-0912";
		numbers[1] = "(847) 341-2392";
		numbers[2] = "(847) 354-0654";
		numbers[3] = "(414) 234-0912";
		numbers[4] = "(414) 435-6567";
		numbers[5] = "(608) 123-0904";
		numbers[6] = "(608) 435-0434";
		numbers[7] = "(608) 123-0312";
		numbers[8] = "(920) 787-9813";
		numbers[9] = "(930) 412-0991";
		String name, phone;
		int x;
		boolean isFound = false;
		int highest = 10;
		System.out.print("Enter name to look up. Type 'quit' to quit. >> ");
		name = keyboard.nextLine();
		while(highest < names.length && !name.equals("quit"))
		{
		for(x = 0; x < highest; ++ x)
		if(name.equals(names[x]))
		{
		isFound = true;
		System.out.println(names[x] + "'s phone number is " +
		numbers[x]);
		x = highest;
		}
		if(!isFound)
		{
		System.out.println(name + " not found in current list");
		System.out.print(" Enter phone number for " + name + " >> ");
		names[highest] = name;
		numbers[highest] = keyboard.nextLine();
		++highest;
		}
		System.out.print("Enter new name to look up. Type 'quit' to quit. >> ");
		name = keyboard.nextLine();
		if(highest == names.length)
		System.out.println("You have reached the maximum number " +
		"of names that can be entered.");
		isFound = false;
		
		
		}

	}

}
