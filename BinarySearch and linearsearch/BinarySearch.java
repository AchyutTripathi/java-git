import java.util.Arrays;

public class BinarySearch {
    // public static void main(String[] args) {
    //     int[] arr = {-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
    //     int ans = binarySearch(arr, 22);
    //     System.out.println(ans);
    // }

    // //return the index
    // //return -1 if it does not exist
    // static int binarySearch(int[] arr, int target) {
    //     int start  = 0;
    //     int end = arr.length - 1;

    //     while(start <= end){
    //         //find the middle element
    //         //int mid = (start + end) / 2;  //might be possible that (start + end) exceeds the range of int in java
    //         int mid = start + (end - start) / 2;
            
    //         if(target < arr[mid]){
    //             end = mid - 1;
    //         } 
    //         else if (target > arr[mid]) {
    //             start = mid + 1;
    //         }
    //         else {
    //             //ans found
    //             return mid;
    //         }
    //     }
    //     return -1;

    // }
    
    

    
    // ORDER AGNOSTIC BINARY SEARCH
    // public static void main(String[] args) {
    //     int[] arr = {-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
    //     int target = 22;
    //     int ans = orderAgnosticBS(arr, target);
    //     System.out.println(ans);
    // }
    // static int orderAgnosticBS(int[] arr, int target){
    //     int start  = 0;
    //     int end = arr.length - 1;

    //     //find weather the array is sorted in ascending or descending
    //     boolean isAsc = arr[start] < arr[end];

    //     while(start <= end){
    //         //find the middle element
    //         //int mid = (start + end) / 2;  //might be possible that (start + end) exceeds the range of int in java
    //         int mid = start + (end - start) / 2;

    //         if (arr[mid] == target){
    //             return mid;
    //         }


    //         if(isAsc){
    //             if(target < arr[mid]){
    //                 end = mid - 1;
    //             } 
    //             else {
    //                 start = mid + 1;
    //             }
    //         }
            
    //         else {
    //             if(target > arr[mid]){
    //                 end = mid - 1;
    //             } 
    //             else {
    //                 start = mid + 1;
    //             }
    //         }
    //     }
    //     return -1;
    // }




    //Find the position of an element in a sorted array of infinite numbers?
    //(Amazon Interview ques, 2021)
//     public static void main(String[] args) {
//        int[] arr = {3,5,7,9,10,90,100,130,140,160,170};
//        int target = 10;
//        System.out.println(ans(arr, target));
//     }
//     static int ans(int[] arr, int target) {
//         //first find the range
//         //first start with the box of size 2
//         int start = 0;
//         int end = 1;

//         //condition for the target to lie in the range
//         while(target > arr[end]){
//             int newStart = end + 1;
//             //double the box value
//             //end  = previous end + size of box
//             end = end + (end - start + 1) * 2;
//             start = newStart;
//         }
//         return binarySearch(arr, target, start, end);
//     }
//     static int binarySearch(int[] arr, int target, int start, int end){
//         while(start <= end){
//             int mid = start + (end - start) / 2;
//             if(target < arr[mid]){
//                 end = mid - 1;
//             }
//             else if(target > arr[mid]){
//                 start = mid + 1;
//             }
//             else{
//                 return mid;
//             }
//         }
//         return -1;
//     }
// }






//LEETCODE QUES 33 NOT COMPLETED
//this will not work for duplicate value
//class Solution {
//     public int search(int[] nums, int target) {
    //     int pivot = findPivot(nums);
    //     if(pivot == -1){
    //         return binarySearch(nums, target, 0 , nums.length - 1);
    //     }
    //     if(nums[pivot] == target){
    //         return pivot;
    //     }
    //     if(target >= nums[0]){
    //         return binarySearch(nums, target, 0 , pivot - 1);
    //     }
    //     return binarySearch(nums, target, pivot + 1, nums.length - 1);
    // }
    // int binarySearch(int[] arr, int target, int start, int end){
    //     while(start <= end){
    //         int mid = start + (end - start) / 2;
    //         if(target <= arr[mid]){
    //             end = mid - 1;
    //         }
    //         else if(target >= arr[mid]){
    //             start = mid + 1;
    //         }
    //         else{
    //             return mid;
    //         }
    //     }
    //     return -1;
    // }
    //     int findPivot(int[] nums){
    //     int start = 0;
    //     int end = nums.length - 1;
    //     while(start <= end){
    //         int mid = start + (end - start) / 2;
    //         if(mid < end && nums[mid] > nums[mid + 1]){
    //             return mid;
    //         }
    //         else if(mid > start && nums[mid] < nums[mid - 1]){
    //             return mid - 1;  
    //         }else if(nums[mid] <= nums[start]){
    //             end = mid - 1; 
    //         }else{
    //             start = mid + 1;
    //         }
    //     }
    //     return -1;
//     }





//Rotated binary search in array with duplicate values
//eg - [2, 2, 2, 2, 9]
// int findPivotwithDuplicateEelement(int[] nums){
//         int start = 0;
//         int end = nums.length - 1;
//         while(start <= end){
//             int mid = start + (end - start) / 2;
//             if(mid < end && nums[mid] > nums[mid + 1]){
//                 return mid;
//             }
//             else if(mid > start && nums[mid] < nums[mid - 1]){
//                 return mid - 1;  
//             }
//              //if elements at middle, start, end are equal then just skip the duplicates
//              if(nums[mid] == nums[start] && nums[mid] == nums[end]){
//             //skip the duplicates
//             //NOTE : what if these elements at start and end were the pivot??
//             //check if start is pivot
//             if(nums[start] > nums[start+1]){
//                 return start;
//             }
//             start++;

//             //check weather end is pivot
//             if(nums[end] < nums[end-1]){
//                 return end-1;
//             }
//             end--;
//         }
//         //left side is sorted, so pivot should be in right
//         else if(nums[start] < nums[mid] || (nums[start] == nums[mid] && nums[mid] > nums[end])){
//             start = mid + 1;
//         }
//         else {
//             end = mid - 1;
//         }
//         }
//         return -1;
//     }



//FIND THE ROTATION COUNT IN ROTATED SORTED ARRAY
// public static void main(String[] args) {
//     int[] arr = {4,5,6,7,0,1,2};
//     System.out.println(countRotations(arr));
// }
// private static int countRotations(int[] arr){
//     int pivot = findPivot(arr);
//     return pivot + 1;
// }

// //USE THIS FOR NON-DUPLICATES
// static int findPivot(int[] nums){
//         int start = 0;
//         int end = nums.length - 1;
//         while(start <= end){
//             int mid = start + (end - start) / 2;
//             if(mid < end && nums[mid] > nums[mid + 1]){
//                 return mid;
//             }
//             else if(mid > start && nums[mid] < nums[mid - 1]){
//                 return mid - 1;  
//             }else if(nums[mid] <= nums[start]){
//                 end = mid - 1; 
//             }else{
//                 start = mid + 1;
//             }
//         }
//         return -1;
//     }

//     //USE THIS FOR DUPLICATES
//     static int findPivotwithDuplicateEelement(int[] nums){
//                 int start = 0;
//                 int end = nums.length - 1;
//                 while(start <= end){
//                     int mid = start + (end - start) / 2;
//                     if(mid < end && nums[mid] > nums[mid + 1]){
//                         return mid;
//                     }
//                     else if(mid > start && nums[mid] < nums[mid - 1]){
//                         return mid - 1;  
//                     }
//                      //if elements at middle, start, end are equal then just skip the duplicates
//                 if(nums[mid] == nums[start] && nums[mid] == nums[end]){
//                     //skip the duplicates
//                     //NOTE : what if these elements at start and end were the pivot??
//                     //check if start is pivot
//                     if(nums[start] > nums[start+1]){
//                         return start;
//                     }
//                     start++;
        
//                     //check weather end is pivot
//                     if(nums[end] < nums[end-1]){
//                         return end-1;
//                     }
//                     end--;
//                 }
//                 //left side is sorted, so pivot should be in right
//                 else if(nums[start] < nums[mid] || (nums[start] == nums[mid] && nums[mid] > nums[end])){
//                     start = mid + 1;
//                 }
//                 else {
//                     end = mid - 1;
//                 }
//                 }
//                 return -1;
//             }




//Ques : 410 leetcode




//BINARY SEARCH IN 2D ARRAY
// public static void main(String[] args) {
//     int[][] arr = {
//         {10,20,30,40},
//         {15,25,35,45},
//         {28,29,37,49},
//         {33,34,38,50}
//     };
//     System.out.println(Arrays.toString(search(arr, 37)));
// }

//     static int[] search(int[][] matrix, int target){
//         int r = 0;
//         int c = matrix.length - 1;

//         while(r < matrix.length && c >= 0) {
//             if (matrix[r][c] == target) {
//                 return new int[]{r, c};
//             }
//             else if (matrix[r][c] < target) {
//                 r++;
//             }
//             else {
//                 c--;
//             }
//         }
//         return new int[] {-1,-1};
//     }








//SORTED MATRIX
public static void main(String[] args) {
    int[][] arr = {
        {1,2,3},
        {4,5,6},
        {7,8,9}
    };
    System.out.println(Arrays.toString(search(arr, 6)));
    
}
    //search in the row provided between the column provided
    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target){
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (matrix[row][mid] == target) {
                return new int[] {row,mid};
            }
            if (matrix[row][mid] < target) {
                cStart = mid + 1;
            }
            else {
                cEnd = mid - 1;
            }
        }
        return new int[] {-1,-1};
    }

    static int[] search(int[][] matrix, int target){
        int rows = matrix.length;
        int cols = matrix[0].length; // be cautious, matrix may be empty
        
        if (rows == 1) {
            return binarySearch(matrix, 0, 0, cols-1, target);
        }

        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;
        // run the loop till 2 rows are remaining
        while (rStart < (rEnd - 1)) { // while this is true it will have more then 2 rows
            int mid = rStart + (rEnd - rStart) / 2;
            if (matrix[mid][cMid] == target) {
                return new int[] {mid,cMid};
            }
             if (matrix[mid][cMid] < target) {
                rStart = mid;
             }
             else {
                rEnd = mid;
             }
        }


        // now we have 2 rows
        // check weather the target is in the col of 2 rows
        if (matrix[rStart][cMid] == target) {
            return new int[]{rStart, cMid};
        }
        if (matrix[rStart + 1][cMid] == target) {
            return new int[]{rStart + 1, cMid};
        }

        // otherwise search in 1st half
        if (target <= matrix[rStart][cMid - 1]) {
            return binarySearch(matrix, rStart, 0, cMid - 1, target);
        }
        // otherwise search in 2st half
        if (target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][cols - 1]) {
            return binarySearch(matrix, rStart, cMid + 1, cols - 1, target);
        }
        // otherwise search in 3st half
        if (target <= matrix[rStart + 1][cMid - 1]) {
            return binarySearch(matrix, rStart + 1, 0, cols - 1, target);
        }
        else {
            return binarySearch(matrix, rStart + 1, cMid + 1, cols - 1, target);
        }
    }
}

