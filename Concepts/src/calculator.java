import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int ans = 0;
        while (true)
        {
        System.out.println("Enter the two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter the operator");
        char op = sc.next().trim().charAt(0);
        if (op == '+'){
            ans = a + b;
        }
         else if (op == '-'){
            ans = a - b;
        }
         else if (op == '*'){
            ans = a * b;
        }
        else if (op == '/'){
            if (b != 0)
            {
            ans = a / b;
            }
        }
         else if (op == '%'){
            ans = a % b;
        }
        else{
            System.out.println("Invalid Choice");
        }
        
        System.out.println(ans);
        } 
        

    }
    
}
