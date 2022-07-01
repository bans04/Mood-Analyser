package com.moodanalyser;
/*
 * Given “I am in Sad Mood” message Should Return SAD
 * Refactor the code to take the mood message in Constructor
 * 
 * @ Dnyandeo Bansode
 * 
 * */

public class MoodAnalyser {
	String message;
	
	public MoodAnalyser(String message) {
		this.message = message;
	}

	public String analyseMood() {
		if(message.equalsIgnoreCase("I am in sad mood")){
			return "SAD";
		}
		return "HAPPY";
	}

	public static void main(String[] args) {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad mood");
		//String result = moodAnalyser.analyseMood("I am in Sad mood");
		//System.out.println(result);
		System.out.println(moodAnalyser.analyseMood());
	}
}
