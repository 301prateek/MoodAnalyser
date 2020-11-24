package com.moodanalyser.test;

import static org.junit.Assert.*;
import org.junit.Test;
import com.moodanalyser.main.MoodAnalyser;
import com.moodanalyser.main.MoodAnalysisException;

import org.junit.Assert;

public class MoodAnalyserTest  {

	@Test
	public void givenMood_WhenNull_ShouldReturnMessage() {

		try {
			MoodAnalyser moodanalyser = new MoodAnalyser(null);
			Assert.assertEquals("Happy",moodanalyser.analyseMood());
		} catch (MoodAnalysisException e) {
			e.printStackTrace();
		}
	}
}
