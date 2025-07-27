package chapter7;

import java.util.Scanner;

public class BinarySearch {

  /** Use binary search to find the key in the list */
  public static int binarySearch(int[] list, int key) {
    int low = 0;
    int high = list.length - 1;

    while (high >= low) {
      int mid = low + ((high - low) >>> 1); // overflow-safe
      if (key < list[mid]) {
        high = mid - 1;
      } else if (key > list[mid]) {
        low = mid + 1;
      } else {
        return mid; // found
      }
    }

    return -low - 1; // not found: negative insertion point - 1
  }

  /** Simple driver to try it out */
  public static void main(String[] args) {
    try (Scanner in = new Scanner(System.in)) {
      System.out.print("How many numbers? ");
      int n = in.nextInt();

      int[] list = new int[n];
      System.out.println("Enter " + n + " integers in **ascending order**:");
      for (int i = 0; i < n; i++) {
        list[i] = in.nextInt();
      }

      System.out.print("Enter key to search: ");
      int key = in.nextInt();

      int idx = binarySearch(list, key);
      if (idx >= 0) {
        System.out.println("Found " + key + " at index " + idx);
      } else {
        int insertionPoint = -idx - 1;
        System.out.println("Not found. Insertion point = " + insertionPoint);
      }
    }
  }
}