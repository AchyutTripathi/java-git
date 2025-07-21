import java.util.Scanner;

public class function {
    // public static void printMyName(String name){
    //     System.out.println(name);
    //     return;
    // }
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // String name = sc.next();
    
    // printMyName(name);
        
    // }
    

    //Make a function to add two numbers and return the sum

    // public static int CalculateSum (int a, int b){
    //    int sum = a + b;
    //    return sum;
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();

    //     int sum = CalculateSum(a, b);
    //     System.out.println("Sum of two numbers : "+ sum);
    // }



    //Make a function to multiply two numbers and return the products
    // public static float Product(int a, int b){
    //     int pr = a*b;
    //     return pr; 
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner (System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();

    //     float pr = Product(a, b);
    //     System.out.println("Product of two numbers is : "+ pr);
    // }
    
    

    //Find the factorial of a number
    // public static void printFactorial(int n){
    //   if(n < 0){
    //     System.out.println("Invalid number");
    //     return;
    //   }
    //   int factorial = 1;
    //   for(int i=n; i>=1; i--){
    //     factorial = factorial * i;
    //   }
    //   System.out.println(factorial);  
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();

    //     printFactorial(n);


    //Example of String
    // static String greet(){
    //   String greeting = "How are you";
    //   return greeting;
    // }
    // public static void main(String[] args) {
    //   String message = greet();
    //   System.out.println(message);
    // }



    //pass the value of a numbes when you are calling the method in main()
    static int Sum(int a, int b){
      int sum = a+b;
      return sum;
    }
    public static void main(String[] args) {
      int ans = Sum(20, 50);
      System.out.println(ans);
    }




}
