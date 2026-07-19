package MustDoProb;

public class CountVowelsConsonents {
    // Return type ko void kiya taaki sirf print karein, boolean ki zaroorat nahi hai
    public static void count(String str) {
        int vowels = 0;
        int consonants = 0; // Spelling correction

        str = str.toLowerCase();

        for (char ch : str.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                if ("aeiou".indexOf(ch) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        // Loop ke BAHAR print karein taaki final count mile
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }

    public static void main(String[] args) {
        // Method ko testing ke liye test string ke sath call kiya
        count("Hello, World! 2026");
    }
}