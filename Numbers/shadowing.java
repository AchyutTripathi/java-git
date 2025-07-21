
import java.util.Arrays;
import java.util.Scanner;

public class shadowing {
    // static int x = 90;  //this will be shadowed at line 6
    // public static void main(String[] args) {
    //     System.out.println(x); //90
    //     int x = 40;
    //     System.out.println(x); //40
    //     fun();
    // }

    // static void fun(){
    //     System.out.println(x);
    // }



    //veriables length arguments
    // static void fun(int ...v){  //v is arrays of int
    //     System.out.println(Arrays.toString(v));
    // }
    // public static void main(String[] args) {
    //     fun(2,3,5,4,6,9,8,7,56,35,15,51);
    // }



    //function Overloading
    // static void fun(int a){
    //     System.out.println("First one");
    //     System.out.println(a);
    // }
    // static void fun(String name){
    //     System.out.println("Second one");
    //     System.out.println(name);
    // }
    // static int sum(int a, int b){
    //     return a+b;
    // }
    // static int sum(int a, int b, int c){
    //     return a+b+c;
    // }
    // public static void main(String[] args) {
    //     fun(67);
    //     fun("Kunal");
    //     int ans1 = sum(5, 4);
    //     System.out.println(ans1);
    //     int ans2 = sum(5,9 ,6 );
    //     System.out.println(ans2);
    // }

    //To check the number is prime or not?
    // static boolean isPrime(int n){
    //     if(n <= 1){
    //         return false;
    //     }
    //     int c = 2;
    //     while(c * c <= n){
    //         if(n % c == 0){
    //             return false;
    //         }
    //         c++;
    //     }
    //     return c * c > n;
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     boolean ans = isPrime(n);
    //     System.out.println(ans);
    // }



    //Print all the 3 digits armstrong numbers?
    static boolean isArmstrong(int n){
        int original = n;
        int sum = 0;
        while (n > 0){
            int rem = n % 10;
            n = n / 10;
            sum = sum + rem*rem*rem;
        }
        return sum == original;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isArmstrong(n));
    }
}
