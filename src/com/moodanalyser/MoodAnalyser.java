package com.moodanalyser;
/*
 * Given “I am in Sad Mood” message Should Return SAD
 * 
 * @ Dnyandeo Bansode
 * 
 * */

public class MoodAnalyser {
	public String analyseMood(String message) {
		if(message.equalsIgnoreCase("I am in sad mood")){
			return "SAD";
		}
		return "HAPPY";
	}

	public static void main(String[] args) {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String result = moodAnalyser.analyseMood("I am in sad mood");
		System.out.println(result);
	}
}
