import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5,1,4,3,2};
        quicksort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }  
    
    static void quicksort(int[] nums, int low, int high) {
        if (low >= high) {
            return; 
        } 

        int start = low;
        int end = high;
        int mid = start + (end - start) / 2;
        int pivot = nums[mid];

        while(start <= end) {

            // also the reason why if it already sorted it will not swap
            while(nums[start] < pivot) {
                start++;
            }

            while(nums[end] > pivot) {
                end--;
            }

            if(start <= end) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }

        // now my pivot is at correct index, plz sort two halves now
        quicksort(nums, low, end);
        quicksort(nums, start, high);
    }
}
