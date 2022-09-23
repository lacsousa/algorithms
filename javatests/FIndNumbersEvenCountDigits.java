package javatests;

public class FIndNumbersEvenCountDigits {
  

  public static void main(String[] args) {
    
    int [] arr = {12,345,2,6,7896};

    countNumbersEvenDigits(arr);

  }


  public static int countNumbersEvenDigits(int[] nums){

    int countNumbersEvenDigits = 0 ;

    for(int i=0; i< nums.length; i++){
      String numStr = String.valueOf(nums[i]);

      if (numStr.length() % 2 == 0) {
        countNumbersEvenDigits++;
      }
    }
    System.out.println(countNumbersEvenDigits);
    return countNumbersEvenDigits;
  }

}
