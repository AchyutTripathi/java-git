
import java.util.*;

public class recursion2 {
    // public static void main(String[] args) {
    //     fun(1);
    // }

    // static void fun(int n) {
    //     if( n >= 6) {
    //         return; // output = 12345
    //     }

    //     System.out.println(n);
    //     fun(n + 1);
    // }


     
    //reverse
    // public static void main(String[] args) {
    //     fun(5);
    // }

    // static void fun(int n) {
    //     if( n == 0) {
    //         return; // output = 54321
    //     }

    //     System.out.println(n);
    //     fun(n - 1);
    // }




    //for both
    // public static void main(String[] args) {
    //     printDescending(5); // Start with 5 for the descending part
    //     printAscending(1);  // Start with 1 for the ascending part
    // }

    // // Recursively print numbers in descending order from n to 1
    // public static void printDescending(int n) {
    //     if (n < 1) {
    //         return;
    //     }
    //     System.out.println(n);          // Print the current number
    //     printDescending(n - 1);       // Recurse for the next lower number
    // }

    // // Recursively print numbers in ascending order from 1 to n
    // public static void printAscending(int n) {
    //     if (n > 5) {
    //         return;
    //     }
    //     System.out.println(n);          // Print the current number
    //     printAscending(n + 1);        // Recurse for the next higher number
    // }





    // Factorial number
    // public static void main(String[] args) {
    //     int ans = fact(5);
    //     System.out.println(ans);
    // }

    // static int fact(int n) {
    //     if(n <= 1) {
    //         return 1;
    //     }

    //     return n * fact(n - 1);
    // }




    // sum of n numbers
    // public static void main(String[] args) {
    //     int ans = sum(5);
    //     System.out.println(ans);
    // }

    // static int sum(int n) {
    //     if(n <= 1){
    //         return 1;
    //     }

    //     return n + sum(n - 1);
    // }





    // sum of digits
    // public static void main(String[] args) {
    //     int ans = Digitsum(1342);
    //     System.out.println(ans);     
    // }

    // static int Digitsum(int n) {
    //     if(n == 0){
    //         return 0;
    //     }

    //     return (n % 10) + Digitsum(n / 10); 
    // }





    // digit product
    // public static void main(String[] args) {
    //     int ans = prod(1342);
    //     System.out.println(ans);     
    // }

    // static int prod(int n) {
    //     if(n % 10 == n){
    //         return n;
    //     }

    //     return (n % 10) * prod(n / 10); 
    // }






    // --n vs n--
    // public static void main(String[] args) {
    //     fun(5);
    // }
    // static void fun(int n){
    //     if(n == 0){
    //         return;
    //     }
    //     System.out.println(n);
    //     // fun(n--); //stack overflow, every time return only 5
        
    //     fun(--n);
    // }








    // reverse a number
    // static int sum = 0;
    // static void rev(int n){
    //     if(n == 0){
    //         return;
    //     }

    //     int rev = n % 10;
    //     sum = sum * 10 + rev;
    //     rev(n/10);
    // }


    // public static void main(String[] args) {
    //     rev(1234);
    //     System.out.println(sum);
    // }







    // count 0's in a number
    // public static void main(String[] args) {
    //     System.out.println(count(302100));
    // }

    // static int count(int n){
    //     return helper(n, 0);
    // }

    // private static int helper(int n, int c) {
    //     if(n == 0){
    //         return c;
    //     }

    //     int rev = n % 10;
    //     if(rev == 0) {
    //         return helper(n/10, c+1);
    //     }
    //     return helper(n/10, c);
    // }






    //++++++++++++++++++++++++++++ Arrays using recursion +++++++++++++++++++++++++++++++++++++++


    // to check array is sorted or not
    // public static void main(String[] args) {
    //     int[] arr = {1, 2, 3, 4, 5, 6, 4, 8, 9};
    //     System.out.println(sorted(arr, 0));
    // }

    // static boolean sorted(int[] arr, int index) {
    //     //base condition
    //     if (index == arr.length - 1) {
    //         return true;
    //     }

    //     return arr[index] < arr[index + 1] && sorted(arr, index + 1);
    // }







    // Linear search
    // public static void main(String[] args) {
    //     int[] arr = {34,1,2,3,4,4,4,4,5,6,7,73,8,21};
    //     System.out.println(find(arr, 5, 0));
    //     System.out.println(findindex(arr, 4, 0));
    //     // findAllIndex(arr, 4, 0);
    //     // System.out.println(list);

    //     ArrayList<Integer> ans = (findAllIndex(arr, 4, 0, new ArrayList<>()));
    //     System.out.println(ans);

    //     System.out.println(findAllIndex2(arr, 4, 0));
    // }

    // static boolean find(int[] arr, int target, int index) {
    //     if (index == arr.length) {
    //         return false;
    //     }
    //     return arr[index] == target || find(arr, target, index + 1);
    // }


    // static int findindex(int[] arr, int target, int index) {
    //     if (index == arr.length) {
    //         return -1;
    //     }
    //     if (arr[index] == target) {
    //         return index;
    //     } else {
    //         return findindex(arr, target, index + 1);  
    //     }
    // }


    
    // static ArrayList<Integer> list = new ArrayList<>(); // creating arraylist outside 
    // static void findAllIndex(int[] arr, int target, int index) {
    //     if (index == arr.length) {
    //         return;
    //     }
    //     if (arr[index] == target) {
    //         list.add(index);
    //     } 
    //     findAllIndex(arr, target, index + 1);
    // }




    
    // // if u want to use arraylist as a parameter
    // static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list) {
    //     if (index == arr.length) {
    //         return list;
    //     }
    //     if (arr[index] == target) {
    //         list.add(index);
    //     } 
    //     return findAllIndex(arr, target, index + 1, list);
    // }





    // // return a ayyarlist without taking it as a argument
    // static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index) {
    //     ArrayList<Integer> list = new ArrayList<>();

    //     if (index == arr.length) {
    //         return list;
    //     }

    //     // this will contain answer for that function call only
    //     if (arr[index] == target) {
    //         list.add(index);
    //     } 
    //     ArrayList<Integer> ansFromBelowCalls = findAllIndex2(arr, target, index + 1);

    //     list.addAll(ansFromBelowCalls);

    //     return list;
    // }










    //+++++++++++++++++++++ rotated binary search ++++++++++++++

    // public static void main(String[] args) {
    //     int[] arr = {5,6,7,8,9,1,2,3};
    //     System.out.println(search(arr, 8, 0, arr.length - 1));
    // }


    // static int search(int[] arr, int target, int s, int e) {
    //     if (s > e) {
    //         return -1;
    //     }

    //     int mid = s + (e - s) / 2;
    //     if(arr[mid] == target) {
    //         return mid;
    //     }

    //     if (arr[s] <= arr[mid]) {
    //         if (target >= arr[s] && target <= arr[mid]) {
    //             return search(arr, target, s, mid-1);
    //         } else {
    //             return search(arr, target, mid+1, e);
    //         }
    //     }
    //     if (target >= arr[mid] && target <= arr[e]) {
    //         return search(arr, target, mid+1, e);
    //     } else {
    //         return search(arr, target, s, mid-1);
    //     }
    // } 









    //++++++++++++++++++++++++++++++++++++ patterns (recursion) ++++++++++++++++++++++++

    // public static void main(String[] args) {
    //     triangle(4, 0);  
    //     //triangle2(4, 0); 
    // }

    // static void triangle(int r, int c){
    //     if (r == 0) {
    //         return;
    //     }
    //     if (c < r) {
    //         System.out.print("*");
    //         triangle(r, c+1);
    //     } else {
    //         System.out.println();
    //         triangle(r-1, 0);
    //     }
    // }


    // static void triangle2(int r, int c){
    //     if (r == 0) {
    //         return;
    //     }
    //     if (c < r) {
    //         triangle2(r, c+1);
    //         System.out.print("*");
    //     } else {
    //         triangle(r-1, 0);
    //         System.out.println();
            
    //     }
    // }










    //++++++++++++++++++++++++++++++++++ bubble and selection sort +++++++++++++++++++++++++++++++

    // public static void main(String[] args) {
    //     int[] arr = {1,3,5,235,35,6,8};
    //     bubblesort(arr, arr.length - 1, 0);
    //     System.out.println(Arrays.toString(arr));
    // }

    // static void bubblesort(int[] arr, int i, int j) {
    //     if (i == 0) {
    //         return;
    //     }
    //     if (j < i) {
    //         if (arr[j] > arr[j+1]) {
    //             int temp = arr[j];
    //             arr[j] = arr[j+1];
    //             arr[j+1] = temp;
    //         }
    //         bubblesort(arr, i, j+1);
    //     } else {
    //         bubblesort(arr, i-1, 0);
    //     }
    // }








    // Selection sort
    // public static void main(String[] args) {
    //         int[] arr = {1,3,5,235,35,6,8};
    //         selection(arr, arr.length, 0, 0);
    //         System.out.println(Arrays.toString(arr));
    //     }
    
    //     static void selection(int[] arr, int i, int j, int max) {
    //         if (i == 0) {
    //             return;
    //         }
    //         if (j < i) {
    //             if (arr[j] > arr[max]) {
    //                 selection(arr, i, j+1, j);
    //             } else {
    //                 selection(arr, i, j+1, max);
    //             }
    //         } else {
    //             int temp = arr[max];
    //             arr[max] = arr[i - 1]; 
    //             arr[i - 1] = temp;
    //             selection(arr, i-1, 0, 0); 
    //         }
    //     }




}




