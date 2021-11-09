package com.qa.day1;

public class Exam {
	public static float Result(float Physics, float Chemistry, float Biology) {
		System.out.println("Physics: "+ Physics + " | Chemistry: "+ Chemistry + " | Biology: "+ Biology);
		System.out.print("Total Mark: " + (Physics + Chemistry + Biology) + " | Final Percentage: ");
		float a = (float)((Physics + Chemistry + Biology) / 450 * 100);
		if(a<60) {
			System.out.println("You failed with ");
		} else {
			System.out.println("You passed with ");
		}
		return a;
}
}