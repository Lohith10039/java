import java.util.Scanner;

public class temp {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter temperature in Celsius
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        
        // Convert Celsius to Fahrenheit
        double fahrenheit = (celsius * 9/5) + 32;
        
        // Display the result
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        
        // Close the scanner
        scanner.close();
    }
}
