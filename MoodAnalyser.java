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


	//Exception Handeling Using Custom Exception
	public String analyseMood() throws MoodAnalysisException {
		try {

			if(message.length() == 0){
				throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_EMPTY, "Please Enter Proper Message");
			}

			if(message.contains("I Am In Sad Mood")) {

					return "Sad";
				}
			else {
				return "Happy";
			}
		}
		catch(NullPointerException e) {
			throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_NULL, "Please Enter Proper Message");
		}
	}
}
