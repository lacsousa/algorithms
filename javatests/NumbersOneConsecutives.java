package javatests;

public class NumbersOneConsecutives {

  public static void main(String[] args) {

    int[] arr = { 1,0,1,1,0,1,1,1,1,0 };
    findMaxConsecutiveOnes(arr);

  }

  public static int findMaxConsecutiveOnes(int[] nums) {

    int numbersOneConsec    = 0 ;
    int numbersOneConsecMax = 0 ; 
    
   
    for (int i = 0; i < nums.length ; i++) {
      if (nums[i] == 1) {
        numbersOneConsec++;
        numbersOneConsecMax = Math.max(numbersOneConsecMax,numbersOneConsec);

      }
      else {   
        numbersOneConsec = 0; 
      }
    }
    System.out.println(numbersOneConsecMax); 
 
    return numbersOneConsecMax;
  }
}