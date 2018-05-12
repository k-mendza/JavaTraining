package com.karmen;

public class BaseballCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Spend 30 min on batting practice";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
