package javatests;

class CheckSum {
  public static int [] secArray = new int[2];

  public static void main(String[] args){
    //int [] param1 = {3, 5, -4, 8, 11, 1, -1, 6};
    int [] param1 = {4,6};

    twoNumberSum( param1, 10);
    System.out.println(secArray[0] + " " + secArray[1] );
  }

  public static int[] twoNumberSum(int[] array, int targetSum) {

    for (int i=0; i < array.length; i++){

      int firstNum = array[i];
      for(int j=i+1; j < array.length; j++){
        if (firstNum + array[j] == targetSum){

          secArray[0] =firstNum;
          secArray[1] = array[j];
        }
        
      }
     
    }
    
    return secArray;
  }

}