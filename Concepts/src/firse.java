import java.util.Arrays;

public class firse {
//     public static void main(String[] args) {
//         int[] arr = {2,3,5,9,14,16,18};
//         int target = 15;
//         int ans = ceiling(arr, target);
//         System.out.println(ans);
//    }
   
//        static int ceiling(int[] arr,int target){
            // if(target > arr[arr.length - 1]){
            //     return -1;
            // }
//            int start = 0;
//            int end = arr.length - 1;
//            while (start <= end){
//                int mid = start + (end - start) / 2;
//                if(target > arr[mid]){
//                    start = mid + 1;
//                }
//                else if(target < arr[mid]){
//                    end = mid - 1;
//                }
//                else{
//                    return mid;
//                }
//            }
//            return start;
//        }



// public static void main(String[] args) {
//     int[] arr = {2,3,5,9,14,16,18};
//     int target = 15;
//     int ans = floor(arr,target);
//     System.out.println(ans);
// }

//     static int floor(int[] arr, int target){
//         int start = 0;
//         int end = arr.length - 1;
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
//         return end;
//     }



// leetcode 34
// public static void main(String[] args) {
//     int[] ans = {-1, -1};
//         int start = search(true, ans, 0);
//         int end = search(false, ans, target)
//         ans[0] = start;
//         ans[1] = end;
//         return ans;
// }
//     static int search(boolean findindex, int[] nums, int target){
//         int ans = -1;
//         int start = 0;
//         int end = nums.length;
//         while (start <= end){
//             int mid = start + (end - start) / 2;
//             if(target < nums[mid]){
//                 end = mid - 1;
//             }
//             else if(target > nums[mid]){
//                 start = mid + 1;
//             }
//             else{
//                 ans = mid;
//                 if(findindex == true){
//                     end = mid - 1;
//                 }
//                 else{
//                     start = mid + 1;
//                 }
//             }
            
//         }
//         return ans;
    // }




    // ques - find target in infinite array ?

    // public static void main(String[] args) {
    //     int[] arr = {3,5,7,9,10,90,100,130,140,160,170};
    //     int target = 10;
    //     System.out.println(ans(arr, target));
        
    // }
    //     static int ans(int[] arr, int target){
    //         int start = 0;
    //         int end = 1;
    //         while(target > arr[end] ){
    //             int temp = end + 1;
    //             end = end + (end - start + 1) * 2;
    //             start = temp;
    //         }
    //         return binarySearch(arr, target, start, end);

    //     }
    //     static int binarySearch(int[] arr, int target, int start, int end){
    //         while (start <= end){
    //             int mid = start + (end - start) / 2;
    //             if (target < arr[mid]){
    //                 end = mid - 1;
    //             }
    //             else if (target > arr[mid]){
    //                 start = mid + 1;
    //             }
    //             else {
    //                 return mid;
    //             }
    //         }
    //         return -1;
    //     }



    // // leetcode = 1095
    // public static void main(String[] args) {
    //     int peak = ans(null);
    //     int firsttry = 
    // }

    // static int ans(int[] arr){
    //     int start = 0;
    //     int end = arr.length - 1;
    //     while(start < end){
    //         int mid = start + (end - start) / 2;
    //         if (arr[mid] > arr[mid + 1] ){
    //             end = mid;
    //         }
    //         else{
    //             start = mid + 1;
    //         }
    //     }
    //     return start;
    // }


    // leetcode 33
//     public static void main(String[] args) {
//         int[] arr = {4,5,6,7,0,1,2};
//         System.out.println(findPivot(arr));
//     }

//     static int search(int[] nums, int target){
//         int pivot = findPivot(nums);

//         //if u do not find pivot thatmeans array is not rotated 
//         if(pivot == -1){
//             return binarySearch(nums, target, 0, nums.length - 1);
//         }

//         //if pivot is found u have 2 asc sorted arrays
//         if(nums[pivot] == target) {
//             return pivot;
//         }

//         if(target >= nums[0]){
//             return binarySearch(nums, target, 0, pivot - 1);
//         }

//         return binarySearch(nums, target, pivot + 1, nums.length - 1);

//     }

//     static int binarySearch(int[] arr, int target, int start, int end){
//         while (start <= end){
//         int mid = start + (end - start) / 2;
//         if (target < arr[mid]){
//             end = mid - 1;
//         }
//         else if (target > arr[mid]){
//             start = mid + 1;
//         }
//         else {
//             return mid;
//         }
//     }
//     return -1;
// }
    
//     static int findPivot(int[] arr){
//         int start = 0;
//         int end = arr.length - 1;
//         while(start <= end){
//             int mid = start + (end - start) / 2;
//             //4 cases
//             if(mid < end && arr[mid] > arr[mid + 1]){
//                 return mid;
//             }
//             if(mid > start && arr[mid] < arr[mid + 1]){
//                 return mid - 1;
//             }
//             if(arr[mid] <= arr[start]){
//                 end = mid - 1;
//             }
//             else {
//                 start = mid + 1;
//             }
//         }
//         return -1;
//     }



//   BINARY SEARCH IN 2D ARRAY
//   public static void main(String[] args) {
//     int[][] arr = {
//         {10,20,30,40},
//         {15,25,35,45},
//         {28,29,37,49},
//         {33,34,38,50}
//     };

//     System.out.println(Arrays.toString(search(arr, 39)));
//   }

//   static int[] search(int[][] matrix , int target){
//     int r = 0;
//     int col = matrix.length - 1;
//     while (r < matrix.length && col >= 0) {
//         if (matrix[r][col] == target){
//             return new int[] {r,col}; 
//         }
//         if (matrix[r][col] < target) {
//             r++;

//         }else {
//             col --;
//         }
//     }
//     return new int[] {-1,-1};
//   } 


public static void main(String[] args) {
     
}
}

