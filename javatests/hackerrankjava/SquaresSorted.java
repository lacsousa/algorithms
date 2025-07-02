package javatests.hackerrankjava;

import java.util.Arrays;

public class SquaresSorted {
  
  public static void main(String[] args) {
    
    int [] array = {-4, -1, 0, 3, 10};
  
    sortAndSquare(array);
  }

  public static int[] sortAndSquare(int[] nums) {

    for(int i=0; i < nums.length; i++){
      nums[i] = nums[i] * nums[i];

      System.out.print(nums[i] + " ");
    }
    System.out.println(" ");
    Arrays.sort(nums);

    for(int n: nums){
      System.out.println(n);
    }

    return nums;  
  }
}
