import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {1,3,5,235,35,6,8};
        arr = mergesort(arr);
        System.out.println(Arrays.toString(arr));
        
    }
     static int[] mergesort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }

        int mid = arr.length / 2;

        // it is creating new objects for every function call
        int [] left = mergesort(Arrays.copyOfRange(arr, 0, mid)); // copyofRange: is used to copy the specific range of original array in new array (original array is not being sorted )
        int [] right = mergesort(Arrays.copyOfRange(arr, mid, arr.length));
        
        return merge(left, right); // merge two sorted arrays
     }

    private static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length]; // new array to store the merged result

        int i = 0; // pointer for first array
        int j = 0; // pointer for second array
        int k = 0; // pointer for mixed array

        // merge two sorted arrays
        while(i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        // it may be possible that one array is not complete, so we need to add the remaining elements
        while(i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }

        while(j < second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }

        return mix;














        // without creating new objects at every function call
        // public static void main(String[] args) {
        //     int[] arr = {1,3,5,235,35,6,8};
        //     mergesortInPlace(arr, 0, arr.length);
        //     System.out.println(Arrays.toString(arr));
            
        // }
        //  static void mergesortInPlace(int[] arr, int s, int e) {
        //     if (e - s == 1) {
        //         return;
        //     }
    
        //     int mid = (s + e) / 2;
    
            
        //     mergesortInPlace(arr, s, mid); 
        //     mergesortInPlace(arr, mid, e);
            
        //     mergesortInPlace(arr, s, mid, e); // merge two sorted arrays
        //  }
    
        // private static void mergesortInPlace(int[] arr, int s, int mid, int e) {
        //     int[] mix = new int[e - s];
    
        //     int i = s;
        //     int j = mid;
        //     int k = 0;
    
        //     while(i < mid && j < e) {
        //         if (arr[i] < arr[j]) {
        //             mix[k] = arr[i];
        //             i++;
        //         } else {
        //             mix[k] = arr[j];
        //             j++;
        //         }
        //         k++;
        //     }
    
        //     // it may be possible that one array is not complete, so we need to add the remaining elements
        //     while(i < mid) {
        //         mix[k] = arr[i];
        //         i++;
        //         k++;
        //     }
    
        //     while(j < e) {
        //         mix[k] = arr[j];
        //         j++;
        //         k++;
        //     }
    
        //     for (int p = 0; p < mix.length; p++) {
        //         arr[s + p] = mix[p];
        //     }

     }
}
