package com.moodanalyser.test;

import static org.junit.Assert.*;
import org.junit.Test;
import com.moodanalyser.main.MoodAnalyser;
import org.junit.Assert;

public class MoodAnalyserTest {

	@Test
	public void givenMood_WhenSad_ShouldReturnSadMood() {
		MoodAnalyser moodanalyser = new MoodAnalyser("I Am In Sad Mood");
		Assert.assertEquals("Sad", moodanalyser.analyseMood());
	}

	@Test
	public void givenMood_WhenHappy_ShouldReturnHappy() {
		MoodAnalyser moodanalyser = new MoodAnalyser("I Am In Happy Mood");
		Assert.assertEquals("Happy",moodanalyser.analyseMood());
	}
}
