package com.moodanalyser.test;

import static org.junit.Assert.*;
import org.junit.Test;
import com.moodanalyser.main.MoodAnalyser;
import org.junit.Assert;

public class MoodAnalyserTest {

	@Test
	public void givenMood_WhenHappy_ShouldReturnHappyMood() {
		MoodAnalyser moodanalyser = new MoodAnalyser("I Am In Sad Mood");
		Assert.assertEquals("Sad", moodanalyser.analyseMood());
	}

	@Test
	public void givenMood_WhenHappy_ShouldReturnHappy() {
		MoodAnalyser moodanalyser = new MoodAnalyser("I Am In Happy Mood");
		Assert.assertEquals("Happy",moodanalyser.analyseMood());
	}

	@Test
	public void givenMood_WhenNull_ShouldReturnHappy() {
		MoodAnalyser moodanalyser = new MoodAnalyser(null);
		Assert.assertEquals("Happy",moodanalyser.analyseMood());
	}
}
