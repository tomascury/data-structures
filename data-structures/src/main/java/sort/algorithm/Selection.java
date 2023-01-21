package sort.algorithm;

import java.util.Arrays;

public class Selection {

  /***
   * In-place algorithm = Logically partitioned
   * O(n2) [quadratic time complexity]
   * Unstable Algorithm
   */
  public static void main(String[] args) {

    int[] numbers = {20, 35, -15, 7, 55, 1, -22};

    int lastUnsortedPartitionIndex = numbers.length - 1;

    while (lastUnsortedPartitionIndex >= 0) {
      int largestIndex = 0;
      for (int i = 1; i <= lastUnsortedPartitionIndex; i++) {
        if (numbers[i] > numbers[largestIndex]) {
          largestIndex = i;
        }
      }
      swap(numbers, largestIndex, lastUnsortedPartitionIndex);
      lastUnsortedPartitionIndex--;
    }

    System.out.println(Arrays.toString(numbers));
  }

  private static void swap(int[] numbers, int i, int y) {
    int aux = numbers[i];
    numbers[i] = numbers[y];
    numbers[y] = aux;
  }
}
