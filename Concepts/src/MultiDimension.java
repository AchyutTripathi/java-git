import java.util.Arrays;
import java.util.*;

public class MultiDimension {
    public static void main(String[] args) {
        //2D arrays
        //input
        System.out.println("Enter row and column size");
        Scanner in = new Scanner(System.in);
        int [][] arr = new int[3][3];
        System.out.println(arr.length); // no. of rows
        for(int row = 0; row < arr.length; row++){
            //for each col in every row
            for(int col = 0; col < arr[row].length; col++){
              arr[row][col] = in.nextInt();  
            }
        }

        //output
        // for(int row = 0; row < arr.length; row++){
        //     //for each col in every row
        //     for(int col = 0; col < arr[row].length; col++){
        //       System.out.print(arr[row][col] + "  ");  
        //     }
        //     System.out.println();
        // }


        //output using Arrays.toString()
        // for(int row = 0; row < arr.length; row++){
        //     System.out.println(Arrays.toString(arr[row]));
        // }

        //using Enhanced for loop
        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }
    }
    
}


// ArrayList<Integer> arr = new ArrayList<>(10);
// ArrayList<Integer> arr = new ArrayList<>();
// ArrayList<Integer> arr = new ArrayList<>();
// ArrayList<Integer> arr = new ArrayList<>();
// ArrayList<Integer> arr = new ArrayList<>();