package com.moodanalyser.test;

import static org.junit.Assert.*;
import org.junit.Test;
import com.moodanalyser.main.MoodAnalyser;
import org.junit.Assert;

public class MoodAnalyserTest {

	MoodAnalyser moodanalyser = new MoodAnalyser();

	@Test
	public void givenMood_WhenSad_ShouldReturnSadMood() {
		Assert.assertEquals("Sad", moodanalyser.analyseMood("I Am In Sad Mood"));
	}

	@Test
	public void givenMood_WhenHappy_ShouldReturnHappyMood() {
		Assert.assertEquals("Happy", moodanalyser.MoodAnalyser("I Am In Any Mood"));
	}
}
