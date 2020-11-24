package com.moodanalyser.main;

public class MoodAnalysisException extends Exception{

	enum ExceptionType {
		ENTERED_NULL,ENTERED_EMPTY
	}
	
	private ExceptionType type;
	
	public ExceptionType getType() {
		return type;
	}
	
	public MoodAnalysisException(ExceptionType type,String message) {
		super(message);
		this.type = type;
	}

	public MoodAnalysisException(String message) {
		super(message);
	}
	
}
