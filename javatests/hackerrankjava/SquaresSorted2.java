package javatests.hackerrankjava;

public class SquaresSorted2 {

  public static void main(String[] args) {

    // int [] nums = {-4, -1, 0, 3, 10};
    int[] nums = { -1, 10, 3, 4, 2 };

    sortAndSquare2(nums);

  }

  public static int[] sortAndSquare2(int[] array) {

    int[] result = new int[array.length];

    int smallerValueIndex = 0;
    int largerValueIndex = array.length - 1;

    for (int i = array.length -1; i >=0; i--) {
      int smallerValue = array[smallerValueIndex];
      int largerValue = array[largerValueIndex];

      if (Math.abs(smallerValue) > Math.abs(largerValue)) {
        result[i] = smallerValue * smallerValue;
        smallerValueIndex++;
      } else {
        result[i] = largerValue * largerValue;
        largerValueIndex--;
      }
    }

    for ( int n: result ) {
      System.out.println(n);
    } 

    return result;
  }

}
