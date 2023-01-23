package com.bridgelabs.mood_analyser;

public class MoodAnalyser {
    String outputMood;
    public String analyseMood(String inputMood) throws CustomMoodException{
        try {
            if(inputMood.toLowerCase().contains("sad")) {
                System.out.println("The user is in sad mood");
                outputMood = "Sad";
            }
            else if(inputMood.isEmpty()) {
                throw new CustomMoodException(CustomMoodException.ExceptionType.Empty_Mood, "The mood can't be empty");
            }
            else {
                System.out.println("The user is in happy mood");
                outputMood = "Happy";
            }
        }
        catch (CustomMoodException e) {
            System.out.println(e.getMessage());
        }
        return outputMood;
    }
}
