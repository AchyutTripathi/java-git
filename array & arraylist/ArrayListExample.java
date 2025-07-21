import java.util.ArrayList;
import java.util.*;
public class ArrayListExample {
    //reversing the array
//     public static void main(String[] args) {
//         int[] arr = {1, 3, 6, 9, 12, 15};
//         //swap(arr, 1, 3);
//         reverse(arr);
//         System.out.println(Arrays.toString(arr));
//     }
//     static void reverse(int [] arr){
//         int start = 0;
//         int end = arr.length - 1;
//         while(start < end){
//             //swap
//             swap(arr, start, end);
//             start++;
//             end--;
//         }
//     }
//     static void swap(int[] arr, int index1, int index2){
//         int temp = arr[index1];
//         arr[index1] = arr[index2];
//         arr[index2] = temp;
//     }
    
// }
        //syntax
        //ArrayList<Integer> list = new ArrayList<>(10);
        //Scanner sc = new Scanner(System.in);
        // list.add(67);
        // list.add(56);
        // list.add(75);
        // list.add(99);
        // list.add(66);
        // list.add(55);
        // //System.out.println(list.contains(55));
        // System.out.println(list);
        // list.set(0, 99);

        // list.remove(2);
        // System.out.println(list);

        //input
        // for(int i = 0; i < 5; i++){
        //     list.add(sc.nextInt());
        // }
        
        // for(int i = 0; i < 5; i++){
        //     System.out.println(list.get(i));
        //     list.sort();
        //     // list.lastIndexOf();
        //      System.out.println(list);
        //     // list.indexOf(sc)
        // }


        
        
//     }
// }



// //MULTIDIMENTIONAL ARRAYLIST
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    
//     //initialization
//     for(int i = 0; i < 3; i++){
//         list.add(new ArrayList<>());
//     }

//     //add element
//     for(int i = 0; i < 3; i++){
//         for(int j = 0; j < 3; j++){
//             list.get(i).add(sc.nextInt());
//         }
//     }
//     System.out.println(list);
// }
// }


//PRINT MAXIMUM ITEM
//     public static void main(String[] args) {
//         int[] arr = {1, 3, 23, 9, 18};
//         System.out.println(max(arr));
//     }
//     static int max(int[] arr){
//         int maxval = arr[0];
//         for(int i = 0; i < arr.length; i++){
//             if (arr[i] > maxval){
//                 maxval = arr[i];
//             }
//         }
//         return maxval;
//     } 
// }








// public static void main(String[] args) {
//     ArrayList <Integer> list = new ArrayList<>();
//     // for (int i = 0; i <= 5; i++) {
//     //     list.add(i++);
//     // }
//     list.add(1);
//     list.add(2);
//     list.add(3);
//     list.add(4);
//     list.add(5);
//     list.add(6);
//     list.add(7);
//     list.add(8);
//     list.add(9);
//     list.add(10);
//     list.addAll(list);
//     System.out.println(list);
// }
// }








public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList<>();
    System.out.println("Enter the number of elements you want to enter in the list :");
    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
        System.out.println("Enter number" + (i + 1) + ": ");
        int num = sc.nextInt();
        list.add(num);
    }
    int total = Sum(list);
    System.out.println("The sum of the elements in the Arraylist is :" + total);
    sc.close();
}

    public static int Sum(ArrayList<Integer> list) {
        int sum = 0;
        for (int n : list) {
            sum += n;
        }
        return sum;
    }
}

