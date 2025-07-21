import java.util.Scanner;

public class demo {
    public static void main(String[] args) 
    {
        // Scanner input = new Scanner(System.in);
        // System.out.println(input.nextInt());
        // System.out.println(input.nextLine());
        // System.out.print("Please enter the roll number:");
        // int rollno = input.nextInt();
        // System.out.println("Your roll number is = " + rollno);
        
        // 
        
        // float num1 = input.nextInt();
        // float num2 = input.nextInt();

        // float sum = num1 + num2;

        // System.out.println("Sum = " + sum);

        // Scanner input = new Scanner(System.in);
        // float num = input.nextFloat();
        // System.out.println(num);
        
        //typecasting
    //    int num = (int)(67.95f); 
    //     System.out.println(num);

        //automatic type promotion in expression
        // int a = 257;
        // byte b = (byte)(a);

        // byte a = 40;
        // byte b = 50;
        // byte c = 100;
        // int d = (a * b) / c;
        
        // System.out.println(d);


        // byte b = 50;
        // b = b * 2;

        // int number = 'A';
        // System.out.println(number);

        // System.out.println(5.67 * 3);
        
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b) + (i / c) - (d - s);
        //float + int - double = double
        System.out.println((f * b) + " " + (i / c) + " " + (d - s));
        System.out.println(result);

        
    }
}
