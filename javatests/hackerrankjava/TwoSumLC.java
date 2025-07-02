package javatests.hackerrankjava;

class TwoSumLC {
  public static int[] secArray = new int[2];

  public static void main(String[] args) {
    int[] param1 = { 3, 2, 4 };

    twoNumberSum(param1, 6);
    System.out.println(secArray[0] + " " + secArray[1]);
  }

  public static int[] twoNumberSum(int[] nums, int target) {

    for (int i = 0; i < nums.length; i++) {

      int firstNum = nums[i];

      for (int j = i + 1; j < nums.length; j++) {

        if ((firstNum + nums[j]) == target) {
          secArray[0] = i;
          secArray[1] = j;
          return secArray;
        } else {
          secArray[0] = i;
          secArray[1] = j;
        }
      }
    }
    return secArray;
  }
}