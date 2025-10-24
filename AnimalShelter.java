package test1_HuzaifaAmir_40467081;

//importing the java.util class
import java.util.*;

public class AnimalShelter {

	public static void main(String[] args) {
		// creating a scanner to take user input
		Scanner keyboard = new Scanner(System.in);
		// Assigning variables for the different weight types
		double totalWeight = 0;
		double averageWeight = 0;
		double lightestWeight = 1000;
		int underOverweight = 0;
		// asking the user to enter the number of animals to track
		System.out.print("Enter the Number of Animals to Track (2-10): ");
		int tracker = keyboard.nextInt();
		// create a while loop to tell the user to input the correct numbers 2 to 10
		// inclusive
		while (tracker > 10 || tracker < 2) {
			// outputting an error message if the number isn't 2-10 inclusive
			System.out.println("Error: Number of animals must be between 2 and 10.");
			// asking the user to renter a number
			System.out.print("Enter the Number of Animals to Track (2-10): ");
			tracker = keyboard.nextInt();
		}
		// Statement allowing the program to skip a line
		System.out.println();
		// writing a for loop to ask the user to enter the weight of each animal
		for (int count = 1; count <= tracker; count++) {
			double weight;
			// asking the user to enter the weight of each animal
			System.out.print("Enter Weight of Animal " + count + " (in kg): ");
			weight = keyboard.nextDouble();
			// code allowing the program to keep adding up all the weight as the program
			// runs
			totalWeight = totalWeight + weight;
			// code allowing the program to get the average weight of all the animals
			averageWeight = totalWeight / tracker;
			// if statement allowing the code to check for the the lowest weight and
			// replacing it
			if (lightestWeight > weight) {
				lightestWeight = weight;
			}
			// if statement allowing the code to count any animal if the don't meet the
			// weight criteria
			if (weight > 15 || weight < 5) {
				underOverweight++;
			}
		}
		// Statement allowing the program to skip a line
		System.out.println();
		// output telling us that the program is complete
		System.out.println("--- Analysis Complete ---");
		// output telling us the total weight up to 2 decimal point
		System.out.printf("Total Weight Sum: %.2f kg \n", totalWeight);
		// output telling us the average weight up to 2 decimal point
		System.out.printf("Average Weight: %.2f kg \n", averageWeight);
		// output telling us the lowest weight of the animal
		System.out.printf("Lightest Weight Recorded: %.1f kg \n", lightestWeight);
		// output telling us the number of animals that are either over or under the
		// weight limit
		System.out.println("Number of Animals under/overweight: " + underOverweight);
		// closing the scanner
		keyboard.close();

	}

}
