/*
- Adding no of columns is not mandatory whereas adding rows is..
- Multi-dimensional is an array of arrays
*/
import java.util.Scanner;

public class MultiDimensions {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int[][] arr = new int[3][];
    int[][] arr2 = {
      {1, 2, 3},
      {4, 5, 6},
      {7, 8, 9}};

    int[][] arr3 = new int[3][3];
    System.out.println(arr3.length); //no of rows
    //taking input
    for(int row = 0; row < arr3.length; row++){
      for(int col = 0; col < arr3[row].length; col++){
        arr3[row][col] = in.nextInt();
      }
    }

    //printing output
    for(int row = 0; row < arr3.length; row++){
      for(int col = 0; col < arr3[row].length; col++){
        System.out.print(arr3[row][col] + " ");
      }
      System.out.println();
    }

    //another way of printing
    for(int row = 0; row < arr3.length; row++) {
      System.out.println(Arrays.toString(arr3[row]));
    }

    //printing using for each loop
    for(int[] a: arr3) { // just the data type will come over here
      System.out.println(Arrays.toString(a));
    }
  }
}

