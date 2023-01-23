package com.bridgelabs.mood_analyser;

public class CustomMoodException extends Exception{
    public enum ExceptionType {
        Empty_Mood;
    }
    final ExceptionType type;
    public CustomMoodException(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }
}
