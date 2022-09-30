package javatests;

public class SquaresSorted2 {

  public static void main(String[] args) {

    // int [] nums = {-4, -1, 0, 3, 10};
    int[] nums = { -1, 10, 3, 4, 2 };

    sortAndSquare2(nums);
  }

  public static int[] sortAndSquare2(int[] array) {

    int indMenores = 0;
    int indMaiores = array.length - 1;

    int[] result = new int[array.length];

    for (int i = array.length; i >= 0; i--) {

      int menorValor = array[indMenores];
      int maiorValor = array[indMaiores];

      if (Math.abs(menorValor) > Math.abs(maiorValor)) {
        result[i] = menorValor * menorValor;
        indMenores++;
      } else {
        result[i] = maiorValor * maiorValor;
        indMaiores--;
      }
    }
    for (int numSortedSquare : result) {
      System.out.println(numSortedSquare);
    }
    return result;
  }

}
