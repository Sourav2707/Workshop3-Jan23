package com.bridgelabs.mood_analyser;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws CustomMoodException {
        System.out.println("Enter a sentence to analyse mood");
        Scanner scanner = new Scanner(System.in);
        String inputMood = scanner.nextLine();
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        System.out.println(moodAnalyser.analyseMood(inputMood));
    }
}
