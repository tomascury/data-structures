package sort.algorithm;

import java.util.Arrays;

public class Insertion {

  /***
   * In-place algorithm = Logically partitioned
   * O(n2) [quadratic time complexity]
   * Stable Algorithm
   */
  public static void main(String[] args) {

    int[] numbers = {20, 35, -15, 7, 55, 1, -22};

    int firstUnsortedPartitionIndex = 1;

    while (firstUnsortedPartitionIndex < numbers.length) {

      for (int i = firstUnsortedPartitionIndex; i > 0; i--) {
        if (numbers[i] < numbers[i - 1]) {
          swap(numbers, i, i - 1);
        } else {
          break;
        }
      }
      firstUnsortedPartitionIndex++;
    }

    System.out.println(Arrays.toString(numbers));

  }


  private static void swap(int[] numbers, int i, int y) {
    int aux = numbers[i];
    numbers[i] = numbers[y];
    numbers[y] = aux;
  }

}
