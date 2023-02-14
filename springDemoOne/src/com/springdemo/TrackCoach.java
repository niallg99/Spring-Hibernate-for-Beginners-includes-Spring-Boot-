package com.springdemo;

public class TrackCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Run 3 laps";
	}

	@Override
	public String startTime() {
		return "Be here at 8am sharp!";
	}

}
