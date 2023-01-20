package sort.algorithm;

import java.util.Arrays;

public class Bubble {

  /***
   * In-place algorithm = Logically partitioned
   * O(2) [quadratic time complexity]
   */
  public static void main(String[] args) {

    int[] numbers = {20, 35, -15, 7, 55, 1, -22};

    int unsortedPartitionIndex = numbers.length - 1;

    while (unsortedPartitionIndex >= 0) {
      for (int i = 0; i < unsortedPartitionIndex; i++) {
        swap(numbers, i);
      }
      unsortedPartitionIndex--;
    }

    System.out.println(Arrays.toString(numbers));
  }

  private static void swap(int[] numbers, int i) {
    if (numbers[i] > numbers[i + 1]) {
      int aux = numbers[i];
      numbers[i] = numbers[i + 1];
      numbers[i + 1] = aux;
    }
  }

}
