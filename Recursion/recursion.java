

public class recursion {
    // public static void main(String[] args) {
    //     //Write a function, that prints hello world 5 times
    //     message();
    // }

    // static void message() {
    //     System.out.println("Hello World");
    //     message1();
    // }

    // static void message1() {
    //     System.out.println("Hello World");
    //     message2();
    // }

    // static void message2() {
    //     System.out.println("Hello World");
    //     message3();
    // }

    // static void message3() {
    //     System.out.println("Hello World");
    //     message4();
    // }

    // static void message4() {
    //     System.out.println("Hello World");
    // }






    // public static void main(String[] args) {
    //     //write a function that takes in a number aand prints it 
    //     //print the first 5 numbers: 1 2 3 4 5

    //     print(1);
       
    // }

    // static void print(int n) {
    //     if (n == 5) {
    //         System.out.println(5);
    //         return;
    //     }
    //     System.out.println(n);

    //     //recursive call
    //     //if u are calling a function again and again, you can treat it as a seperate call in the stack
        
           //this is tail rucursion
    //     print(n + 1);
    // }






    // public static void main(String[] args) {
    //     System.out.println(fibo(6));
    // }

    // static int fibo(int n) {
    //     //base condition
    //     if (n < 2) {
    //         return n;
    //     }
    //     return fibo(n - 1) + fibo(n - 2);
    // }







    //BINARY SEARCH
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        // int target = 5;
        System.out.println(search(arr, 5, 0, arr.length - 1));
    }

    static int search(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }
        int mid = s + (e - s) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (target < arr[mid]) {
            return search(arr, target, s, mid - 1);
        }

        return search(arr, target, mid + 1, e);
    }
}
