// Write a program that prompts the user to enter the side of a hexagon and displays its area.
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter the side of a hexagon and assigns the value to the variable side 
    System.out.print("Enter the side: ");
    double side = input.nextDouble();

    // Calculates the area of a hexagon and prints the area using the user input
    double area = (6 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 6));
    System.out.println("The area of the hexagon is " + area);
  }
}