package com.springdemo;

public class MyApp {

	public static void main(String[] args) {
		//create the object
		Coach baseballCoach = new BaseballCoach();
		Coach trackCoach = new TrackCoach();
		
		//implement object
		System.out.println(baseballCoach.getDailyWorkout());
		System.out.println(trackCoach.getDailyWorkout());
	}

}
