package Practice;

import org.testng.annotations.Test;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringFunction {

    String name = "Sir Duke Umeh";
    String money = "100";
    int money1 = 100;


    public void changeCaseAndCount() {
        String nameUpper = name.toUpperCase();
        String nameLower = name.toLowerCase();
        int totalCharacters = name.length();

        //change upper and lower case also count characters
        System.out.println("Name in Uppercase: " + nameUpper);
        System.out.println("Name in Lowercase: " + nameLower);
        System.out.println("Total Characters: " + totalCharacters);

    }

    //Method to count character occurrence
    public void countCharacterOccurrences() {
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (char c : name.toLowerCase().toCharArray()) {
            if (c != ' ') {
                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            }
        }
        System.out.println("Character Counts:");
        for (char c : charCount.keySet()) {
            System.out.println("Character: '" + c + "' Count: " + charCount.get(c));
        }
    }

    // Method to split the name into words and print
    public String[] splitName() {
        String[] words = name.split(" ");
        System.out.println("Words in the name:");
        for (String word : words) {
            System.out.println(word);
        }
        return words;
    }

    // Method to split the name with limit
    public String[] splitNameWithLimit(int limit) {
        String[] result = name.split(" ", limit);
        System.out.println("Split with limit " + limit + ":");
        for (String word : result) {
            System.out.println(word);
        }
        return result;

    }

    // Method to extract numbers from the string and convert to Integer
    public Integer extractAndValidateNumbers(String input) {
        Pattern pattern = Pattern.compile("\\d+"); // Pattern to match sequences of digits
        Matcher matcher = pattern.matcher(input);
        StringBuilder numberString = new StringBuilder();

        // Find all matches and append to the StringBuilder
        while (matcher.find()) {
            numberString.append(matcher.group());
        }

        // Convert to Integer if any numbers were found
        if (numberString.length() > 0) {
            try {
                Integer result = Integer.valueOf(numberString.toString());
                System.out.println("Extracted Number as Integer: " + result);

                return result;
            } catch (NumberFormatException e) {
                System.out.println("Number format exception: " + e.getMessage());
            }
        } else {
            System.out.println("No numbers found in the string");
        }
        return null;
    }

    // Method to extract letters from the string
    public static String extractLetters(String input) {
        Pattern pattern = Pattern.compile("[a-zA-Z]"); // Pattern to match letters (both uppercase and lowercase)
        Matcher matcher = pattern.matcher(input);
        StringBuilder letterString = new StringBuilder();

        // Find all matches and append to the StringBuilder
        while (matcher.find()) {
            letterString.append(matcher.group());
            // Print the current letter being extracted
            System.out.println("Current letter extracted: " + matcher.group());
        }

        return letterString.toString(); // Return the letters as a string
    }
}
