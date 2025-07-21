
import java.util.Scanner;


public class sheet1 {
    //Average of three numbers by making function.
    // public static float Average(int a, int b, int c){
    //     int avg = (a+b+c)/3;
    //     return avg;
    // }
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int a = sc.nextInt();
    // int b = sc.nextInt();
    // int c = sc.nextInt();
    // float avg = Average(a, b, c);
    // System.out.println("The average of three numbers is : "+avg);
       
    // }



    //Sum of all odd numbers from 1 to n.
    // public static int Sum(int n)
    // {
    //     int total = 0;
    //     for(int i = 1; i<=n; i++)
    //     {
    //         if(i % 2 == 1)
    //         {
    //              total += i;
                
    //         }
            
    //     }
    //   return total;  
    // }
    // public static void main(String[] args)
    // {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     int result = Sum(n);
    //     System.out.println("sum of odd numbers is: "+ result);
    // }



    //Write a function to find the circumference of circle.
    // public static double Circumference(int r){
    //     double c = (2*3.14*r);
    //     return c;
    // } 
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int r = sc.nextInt();
    //     double result = Circumference(r);
    //     System.out.println("The circumference of circle is: "+ result);
    // }



    //To check that person is eligible to vote or not.
    // public static String Eligible(int a){
    //     if(a < 18){
    //         return "Not Eligible to vote";
    //     }
    //     else{
    //         return "Eligible to vote";
    //     }
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter your age: ");
    //     int a = sc.nextInt();
    //     String result = Eligible(a);
    //     System.out.println(result);
    // }



    //Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.
public static int Count(int zeros, int positive, int negative){
    zeros = 0;
    positive = 0;
    negative = 0;
    int[] arr = new int[10];
        for(int i = 0; i<=10; i++){
            if (arr[i] == 0){
                zeros++;
            }
            else if(arr[i] > 0){
                positive++;
            }
            else {
                negative++;
            }
        }
        return Count(zeros, positive, negative);
    }
    public static void main(String[] args) {
        System.out.println("Enter 10 number: ");
        Scanner sc = new Scanner(System.in);
        int result = Count(0, 0, 0);
        System.out.println(result);
    }
}
