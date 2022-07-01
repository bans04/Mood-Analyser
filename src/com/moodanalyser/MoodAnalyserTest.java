package com.moodanalyser;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
/*
 * Junit test case for the mood analyser
 * analyseMood method can just return SAD to pass this Test Case (TC)
 * 
 * @ Dnyandeo Bnsosde
 * 
 * */

class MoodAnalyserTest {
	/*Tc1.2-For Sad Mood
	 * @Test
	void testForSadMood() {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String result = moodAnalyser.analyseMood("I am in sad mood");
		assertEquals("SAD", result);
	}
	
	Tc1.1-For Happy Mood
	@Test
	void testForHappyMood() {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String result = moodAnalyser.analyseMood("I am in Happy mood");
		assertEquals("HAPPY", result);
	}*/
	
	@Test
	void testForHappyMood() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");
		assertEquals("SAD", moodAnalyser.analyseMood());
	}
	
}
