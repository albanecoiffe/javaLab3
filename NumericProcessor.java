import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// Create a new class file with the main method with any name:
public class NumericProcessor {

    public static void main(String[] args) {
        //Ask the user to input a list of numbers with spaces in between
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input a list of numbers with spaces in between
        System.out.print("Enter a list of numbers separated by spaces: ");
        String userInput = scanner.nextLine();
        scanner.close();

        // Call your method and pass the user input to this method
        double average = calculateAverage(userInput);

        // Print the average that you will receive from your method
        System.out.println("The average of the entered numbers is: " + average);

    }

    // Add a method with any name that:
    private static double calculateAverage(String numbers) {
        // accepts a user input which is a string of numeric values, for example: "20 30 50 40"
        // Convert the string of numbers into an array list
        List<String> numberList = new ArrayList<>(Arrays.asList(numbers.split(" ")));
        List<Double> doubleList = new ArrayList<>();

        for (String number : numberList) {
            try {
                doubleList.add(Double.parseDouble(number));
                    //Double.parseDouble(number): This is a static method provided by the Double wrapper class in Java.
                            //It's used to convert a String into its double primitive data type.
                    //doubleList.add(...) : doubleList is a list that stores double values 
            } catch (NumberFormatException e) {
                System.out.println("Invalid number format for: " + number);
            }
        }
        // loop through the array using "for each" to calculate the total
        double total = 0;
        for (double number : doubleList) {
            total += number;
        }
        // Find and return the average
        return total / doubleList.size();
    }

}

