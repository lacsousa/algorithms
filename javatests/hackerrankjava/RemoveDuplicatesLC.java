package javatests.hackerrankjava;

class RemoveDuplicatesLC {
  public static void main(String[] args) {

    int[] arr = { 0,0,1,1,1,2,2,3,3,4 };
    removeDuplicates(arr);

  }

  public static int removeDuplicates(int[] nums) {

    int k = nums.length > 0 ? 1 : 0;

    for (int elem : nums) {
      if (elem > nums[k - 1]) {
        nums[k++] = elem;
      }
    }
    System.out.println("k = " + k) ;
    return k;
   
  }
}