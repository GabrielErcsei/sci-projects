package ro.sciit.junit.homework;

import java.lang.reflect.Array;
import java.util.*;

public class Utility {

    private String input;
    private List<String> numbersAsString = new ArrayList<String>(
            Arrays.asList("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"));
    private List<String> numbersAsInt = new ArrayList<String>(
            Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9"));
    private List<String> whitespaces = new ArrayList<String>(
            Arrays.asList("", "//s", ","));
    private List<String> userInputList = new ArrayList<String>();

    /**
     * method that removes white space from given input
     * @return input as string with whitespaces removed
     */
    public String inputWithWhiteSpacesRemoved() {
        //initializes user input
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter a word or phrase: ");
        // variable for storing the modified string
        String stringWithoutWhiteSpaces = "";

        //checks if scanner doesn't receive a break key, it continues to request user input
        while (userInput.hasNextLine()) {
            //transforms input to lower case letters
            input = userInput.nextLine().toLowerCase();

            //checks if input differs from null and contains some letters and is different from the letter q
            if (input != null && !input.isEmpty() && !input.equals("q")) {
                // input is added to userInputList
                stringWithoutWhiteSpaces = input;
                userInputList.add(stringWithoutWhiteSpaces);
            } else if (input.equals("q")) {
                //if the letter q is pressed, the program exits
                break;
            } else {
                //if no input is entered, the program loops until something is entered
                System.out.println("Nothing entered. Enter another word or type 'Q' to exit.");
            }
        }

        //returns input as a string with whitespaces removed
        return stringWithoutWhiteSpaces.replaceAll("\\s+", "");
    }

    /**
     * method that replaces word written numbers with mathematical numbers
     * @return input as string with numbers replaced
     */
    public String numberReplacer() {
        Scanner userInput = new Scanner(System.in);
        userInput = userInput.useDelimiter("\\n");
        System.out.println("Please enter a word or phrase: ");
        //variable that stores userInput
        String splitInput = "";
        String splitResult = "";
        String printWithNewLine = System.lineSeparator();

        while (userInput.hasNextLine()) {
            input = userInput.nextLine().toLowerCase();

            if (input != null && !input.isEmpty() && !input.equals("q")) {
                splitInput += input + "\n";
            } else if (input.equals("q")) {
                break;}

            else {
                System.out.println("Nothing entered. Enter another word or type 'Q' to exit.");
            }
        }
        userInputList.addAll(Arrays.asList(splitInput.split("((?<=\\ |\\,|\\.|\t|\n|\\;|\\:|\\!|\\? )" +
                        "|(?=\\ |\\,|\\.|\t|n|\\;|\\:|\\!|\\?))")));

        //cycles through the userInputList to see if it contains elements from the numbersAsString list
        //if the check return true, the elements matching an element in numbersAsString list
        // is replaces with the corresponding elements from numbersAsInt list
        for (int i = 0; i < userInputList.size(); i++) {
            for (int j = 0; j < numbersAsString.size(); j++) {
                if (userInputList.get(i).equals(numbersAsString.get(j))) {
                    userInputList.set(i, numbersAsInt.get(j));
                    userInputList.remove(userInputList.size()-1);
                }
            }
        }

        //Converts the userInputList back into a String
        for (String s : userInputList) {
            splitResult += s.replace("\\n", ".");
        }

        return splitResult;

    }
}
