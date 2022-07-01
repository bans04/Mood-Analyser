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
	@Test
	void test() {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String result = moodAnalyser.analyseMood("I am in sad mood");
		assertEquals("SAD", result);
	}
	
	@Test
	void testForHappyMood() {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String result = moodAnalyser.analyseMood("I am in Happy mood");
		assertEquals("HAPPY", result);
	}
}
