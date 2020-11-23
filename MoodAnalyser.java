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

	//Refactor

	public String message;

	//Default constructor
	public MoodAnalyser() {

	}

	//Parameterized constructor
	public MoodAnalyser(String message){
		this.message = message;
	}

	//Exception handeling
	public String analyseMood(String mood) {
		try {
			if(mood.contains("I Am In Sad Mood")) {

				return "Sad";
			}
			else {
				return "Happy";
			}
		}
		catch(NullPointerException e) {
			return "Happy";
		}
	}
}
