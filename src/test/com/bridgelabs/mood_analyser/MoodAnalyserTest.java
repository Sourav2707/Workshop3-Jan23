package test.com.bridgelabs.mood_analyser; 

import com.bridgelabs.mood_analyser.MoodAnalyser;
import org.junit.Assert;
import org.junit.Test;
public class MoodAnalyserTest {
@Test
public void testAnalyseMood() throws Exception {
    MoodAnalyser moodAnalyser = new MoodAnalyser();
    String inputMood = "I'm sad as I lost my phone today";
    String expectedMood = "Sad";
    String actualMood = moodAnalyser.analyseMood(inputMood);
    Assert.assertEquals(expectedMood, actualMood);
}
} 
