package javatests;

import java.util.*;
import java.util.Arrays;

public class ArrayInAnother {

  public static void main(String[] args) {

    Integer[] firstArray = new Integer[] { 5, 1, 22, 25, 6, -1, 8, 10 };
    Integer[] secondArray = new Integer[] { 5, 1, 10 };

    List<Integer> firstList = new ArrayList<>(Arrays.asList(firstArray));
    List<Integer> secondList = new ArrayList<>(Arrays.asList(secondArray));

    System.out.println(isValidSubsequence(firstList, secondList));
  }

  // Check it if the second array can be construct by the first array
  public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {

    int indArr = 0;
    int indSeq = 0;

    while (indArr < array.size() && indSeq < sequence.size()) {

      if (array.get(indArr).equals(sequence.get(indSeq))) {
        indSeq++;
      }
      indArr++;
    }
    return indSeq == sequence.size();
  }

}
