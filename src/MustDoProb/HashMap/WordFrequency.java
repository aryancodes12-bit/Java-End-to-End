package MustDoProb.HashMap;

import java.util.HashMap;
import java.util.Map;

public class WordFrequency {
    public static void main(String[] args) {
        // 1. The input string
        String input = "Java Python Java C++ Java Python";

        // 2. Split the string by spaces to get an array of individual words
        String[] words = input.split(" ");

        // 3. Create a HashMap to store the frequencies (Key: Word, Value: Count)
        Map<String, Integer> frequencyMap = new HashMap<>();

        // 4. Count the frequencies
        for (String word : words) {
            // If the word exists, get its current count and add 1.
            // If it doesn't exist, use 0 as the default value and add 1.
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }

        // 5. Print the results in the required format
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
            System.out.println(); // Prints the blank line between outputs
        }
    }
}
