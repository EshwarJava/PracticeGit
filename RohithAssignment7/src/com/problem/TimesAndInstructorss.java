package com.problem;

import java.util.Scanner;

public class TimesAndInstructorss {

	public static void main(String[] args) {
	
		Scanner keyboard = new Scanner(System.in);
		String[][] courses = new String[5][3];
		courses[0][0] = "CIS101";
		courses[0][1] = "Mon 9am";
		courses[0][2] = "Kahn";
		courses[1][0] = "CIS210";
		courses[0][1] = "Mon 11 am";
		courses[1][2] = "Patel";
		courses[2][0] = "MKT100";
		courses[2][1] = "Tues 8:30 am";
		courses[2][2] = "Wong";
		courses[3][0] = "ACC150";
		courses[3][1] = "Tues 6 pm";
		courses[3][2] = "Deitrich";
		courses[4][0] = "CIS101";
		courses[4][1] = "Fri 1 pm";
		courses[4][2] = "Lennon";
		String entry, message ="Enter a course:";
		int num, x;
		boolean isFound = false;
		while (!isFound)
		{
		System.out.print("Enter a course >> ");
		entry = keyboard.nextLine();
		for(x = 0; x < courses.length; ++ x)
		if(entry.equals(courses[x][0]))
		{
		isFound = true;
		System.out.println("Course: " + entry +
		" Time: " + courses[x][1] +
		" Instructor: " + courses[x][2]);
		}
		if(!isFound)
		System.out.println("Sorry - no such course");
		}
		
		
		keyboard.close();
	}

}
