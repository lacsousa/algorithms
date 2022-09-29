package javatests;

public class SquaresSorted2 {
  
  public static void main(String[] args) {
    
    //int [] nums = {-4, -1, 0, 3, 10};
    int [] nums = {-1,10,3,4,2};
  
    sortAndSquare2(nums);
  }

  public static int[] sortAndSquare2(int[] array) {

    int counter = array.length - 1;
    int firstInd = 0;
    int lastInd = array.length - 1;

    int [] result = new int[array.length];
    
    for(int i=0; i< array.length; i++){
      if (Math.abs(array[firstInd]) > Math.abs(array[lastInd])){
        result[counter - i] = array[firstInd] * array[firstInd];
        firstInd++;  
      } else { 
        result[counter - i] = array[lastInd] * array[lastInd];
        lastInd--;
      }
    }
    for (int numSortedSquare : result){
      System.out.println(numSortedSquare);
    }
    return result;
  }
  
}
