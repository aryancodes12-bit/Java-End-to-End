package MustDoProb;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCount {
    static void countFrequencies(int ...arr) {
        // Create a HashMap to store element-to-count mapping
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for (int e : arr) {
            // If the element exists, increment its count by 1.
            // If it doesn't exist, start its count at 0 and add 1.
            freqMap.put(e, freqMap.getOrDefault(e, 0) + 1);
        }

        // Print the frequency of each element
        System.out.println("Element -> Frequency");
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        countFrequencies(4, 8, 9, 8, 4, 8);
    }
}