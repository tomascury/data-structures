package data.structure;

public class MainArray {

  /***
   * Fixed length
   * Continuous block in memory
   * Every element occupies the same amount of space in memory
   * It stores the reference of the objects, making it possible to calculate the memory address of each element
   *   (x + i * y)
   *   x = starting memory address
   *   y = size of the element
   *   i = element index
   *
   */
  public static void main(String[] args) {

    int[] intArray = new int[7];

    intArray[0] = 20;
    intArray[1] = 35;
    intArray[2] = -15;
    intArray[3] = 7;
    intArray[4] = 55;
    intArray[5] = 1;
    intArray[6] = -22;

    for (int i = 0; i < intArray.length; i++) {
      //Search by Index = O(1) [constant time complexity]
      System.out.println(intArray[i]);
    }

    int index = -1;
    for (int i = 0; i < intArray.length; i++) {
      //Search without Index = O(n) [linear time complexity]
      if (intArray[i] == 7) {
        index = i;
        break;
      }
    }
    System.out.println("Index " + index + " = value: " + intArray[index]);

  }
}