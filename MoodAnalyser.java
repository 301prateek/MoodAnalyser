package com.moodanalyser.main;

import java.util.Scanner;

package com.moodanalyser.main;
import java.util.Scanner;

public class MoodAnalyser {

	public String analyseMood(String mood) {

		if(mood.contains("I Am In Sad Mood")) {

			return "Sad";
		}
		else {
			return "Happy";
		}
	}
}
