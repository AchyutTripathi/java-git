import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Iteratively {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> ans = subsets(arr);
        for (List<Integer> list : ans) {
            System.out.println(list);
        }


        // int[] arr = {1, 2, 2};
        // List<List<Integer>> ans = subsetsDuplicates(arr);
        // for (List<Integer> list : ans) {
        //     System.out.println(list);
        // }
    }

    static List<List<Integer>> subsets(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>()); // add an empty list

        for(int num : arr){
            int n = outer.size(); // get the size of the outer list
            for(int i = 0; i < n; i++){
                List<Integer> internal = new ArrayList<>(outer.get(i)); // create a new list and add the element of the outer list to it
                internal.add(num); // add the element to the new list
                outer.add(internal); // add the new list to the outer list
            }
        }
        return outer;
    }
}

// explaination
// 1. create a outer list and add an empty list to it
// 2. loop through the array
// 3. get the size of the outer list
// 4. loop through the outer list
// 5. create a new list and add the element of the outer list to it
// 6. add the new list to the outer list
// 7. return the outer list
// 8. done









// remove duplicates

// static List<List<Integer>> subsetsDuplicates(int[] arr) {
//     Arrays.sort(arr);
//     List<List<Integer>> outer = new ArrayList<>();

//     outer.add(new ArrayList<>());
//     int start = 0;
//     int end = 0;

//     for(int i = 0; i < arr.length; i++){
//         start = 0;
//         // if current and previous element are same, s = e + 1
//         if(i > 0 && arr[i] == arr[i - 1]){
//             start = end + 1;
//         }
//         end = outer.size() - 1;
//         int n = outer.size();
//         for(int j = start; j < n; j++){
//             List<Integer> internal = new ArrayList<>(outer.get(i));
//             internal.add(arr[i]);
//             outer.add(internal);
//         }
//     }
//     return outer;
// }
// }



