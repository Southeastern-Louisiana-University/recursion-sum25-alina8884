package chapter7;

import java.util.Scanner;

public class LinearSearch {

  /** The method for finding a key in the list */
  public static int linearSearch(int[] list, int key) {
    for (int i = 0; i < list.length; i++) {
      if (key == list[i])
        return i;  // Key found at index i
    }
    return -1;     // Key not found
  }

  /** Main method to test the linear search */
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Ask for the number of elements
    System.out.print("Enter the number of elements: ");
    int n = input.nextInt();

    int[] list = new int[n];

    // Input array elements
    System.out.println("Enter " + n + " integers:");
    for (int i = 0; i < n; i++) {
      list[i] = input.nextInt();
    }

    // Input key to search
    System.out.print("Enter the key to search for: ");
    int key = input.nextInt();

    // Perform linear search
    int index = linearSearch(list, key);

    // Output results
    if (index != -1) {
      System.out.println("Key " + key + " found at index " + index + ".");
    } else {
      System.out.println("Key " + key + " not found in the list.");
    }

    input.close();
  }
}
