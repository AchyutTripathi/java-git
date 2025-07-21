
import java.util.Arrays;

public class linearsearch {
    // public static void main(String[] args) {
    //     //linear Search
    //    int[] nums = {23,45,1,2,8,19,-3,16,-11,28};
    //    int target = 19;
    //    int ans = Linearsearch(nums, target);
    //    System.out.println(ans);    
   
    //    }
   
    //    //search in the array
    //    static int Linearsearch(int[] arr, int target){
    //        if(arr.length == 0){
    //            return -1;
    //        }
   
    //        for(int index = 0; index < arr.length; index++){
    //            int element = arr[index];
    //            if(element == target)
    //            {
    //                return index;
    //            }
    //        }
    //        return -1;
    //    }



       //Search in String
        // static boolean Search(String str, char target){
        //     if(str.length() == 0){
        //         return false;
        //     }
        //     for(int i = 0; i<str.length(); i++){
        //         if(target == str.charAt(i)){
        //             return true;
        //         }
        //     }
        //     return false;
        // }

        // public static void main(String[] args) {
        //     String name = "Achyut";
        //     char target = 'u';
        //     System.out.println(Search(name, target));
        // }    	

        


        //USING for each loop and conveting string into character array
        // static boolean search(String str, char target){
        //     if(str.length() == 0){
        //         return false;
        //     }
        //     //for each loop
        //     for(char ch : str.toCharArray()){
        //         if(ch == target){
        //             return true;
        //         }
        //     }
        //     return false;
        // }
        // public static void main(String[] args) {
        //     String name = "Achyut";
        //     char target = 'u';
        //     System.out.println(Arrays.toString(name.toCharArray()));
        // }

       

        //SEARCH IN RANGE
        // static int search(int[] arr, int target, int start, int end){
        //     if(arr.length == 0){
        //         return -1;
        //     }
        //     for(int i = start; i <= end; i++){
        //         int element = arr[i];
        //         if(element == target){
        //             return i;
        //         }
        //     }
        //     return -1;
        // }
        // public static void main(String[] args) {
        //     int[] arr = {18, 12, -7, 3, 14, 28};
        //     int target = 3;
        //     System.out.println(search(arr, target, 1, 4));
        // }



        //FIND MINIMUM NUMBER
        // static int min(int[] arr){
        //     int ans = arr[0];
        //     for(int i = 1; i < arr.length; i++){
        //         if(arr[i] < ans){
        //             ans = arr[i];
        //         }
        //     }
        //     return ans;
        // }
        // public static void main(String[] args) {
        //     int[] arr = {18, 12, -7, 3, 14, 28};
        //     System.out.println(min(arr));
        // }



        //SEARCH IN 2D ARRAY
        // public static void main(String[] args) {
        //     int[][] arr = {
        //         {23, 4, 1},
        //         {18, 12, 3, 9},
        //         {78, 99, 34, 56},
        //         {18, 12}
        //     };
        //     int target = 34;
        //     int[] ans = search(arr, target);
        //     System.out.println(Arrays.toString(ans));
        // }
        // static int[] search(int[][] arr, int target){
        //     for(int row = 0; row < arr.length; row++){
        //         for(int col = 0; col < arr[row].length; col++){
        //             if(arr[row][col] == target){
        //                 return new int[]{row, col};
        //             }
        //         }
        //     }
        //     return new int[] {-1, -1};
        // }



        //TO FIND MAX VALUE
        // public static void main(String[] args) {
        //     int[][] arr = {
        //         {23, 4, 1},
        //         {18, 12, 3, 9},
        //         {78, 99, 34, 56},
        //         {18, 12}
        //     };
        //     int[] ans = search(arr);
        //     System.out.println(Arrays.toString(ans));
        // }
        // static int search(int[][] arr){
        //     int max = Integer.MIN_VALUE;
        //     for(int row = 0; row < arr.length; row++){
        //         for(int col = 0; col < arr[row].length; col++){
        //             if(arr[row][col] > max){
        //                 max = arr[row][col];
        //             }
        //         }
        //     }
        //     return max;
        // }




        //LEETCODE PROBLEM 1295
        // public static void main(String[] args) {
        //    int[] nums = {12,345,2,6,7896};
        //    System.out.println(findNumbers(nums));
        // }

        // static int findNumbers(int[] nums){
        //     int count = 0;
        //     //for each loop
        //     for(int num : nums){
        //         if(even(num)){
        //             count++;
        //         }
        //     }
        //     return count;
        // }

        //function to check weather number contains even number or not
        // static boolean even(int num){
        //     int numberofDigits = digits(num);
            /* 
            if(numberofDigits % 2 == 0){
                return true;
            }
            return false;
            */
        //     return numberofDigits % 2 == 0;
        // }
        // int digits(int num){
        //     if(num < 0){
        //         num = num * -1;
        //     }
        //     return (int)(Math.log10(num)) + 1;
        // }



        //SHORTCUT TO FIND NUMBER OF DIGITS
        // static int digits2(int num){
        //     return (int)(Math.log10(num)) + 1;
        // }



        //count number of digits in a number
        // static int digits(int num){
        //     int count = 0;
        //     while(num > 0){
        //         count++;
        //         num = num / 10;  // num /= 10
        //     }
        //     return count;
        // }



        // LEETCODE 1672
        public static void main(String[] args) {
            
        }
        public int maximumWealth(int[][] accounts) {
            int ans = Integer.MIN_VALUE;
            for(int[] ints : accounts){
                    int sum = 0;
                for(int anInt : ints){
                    sum +=  anInt;
                }

                //now we have sum of accounts of person
                //check with overall ans
                if(sum > ans){
                    ans = sum;
                }
            }
            return ans;
        
        }
   }

