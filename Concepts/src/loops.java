import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
       //for loop
    //    for(int num = 1; num <= 5; num += 1){
    //     System.out.println(num);
    //    }
       
       //print number from 1 to num
    //    Scanner sc = new Scanner(System.in);
    //    int n = sc.nextInt();

    //    for (int num = 1; num <= n; num++) {
    //     System.out.print(num + " ");
    //     System.out.println("Hello World");
    //    }

         
       //while loops
    //    int num = 1;
    //    while (num <= 5) {
    //     System.out.println(num);
    //     num += 1;
        
    //    }

    //do while loop
    //execute atleast ones
    // int n = 1;
    // do{
    //     System.out.println(n);
    //     n++;
    // }while (n <= 5);

    Scanner sc = new Scanner(System.in);
    

    //to find maximum number
    // int a = sc.nextInt();
    // int b = sc.nextInt();
    // int c = sc.nextInt();

    // int max = a;
    // if (b > max){
    //     max = b;
    // }
    // if (c > max){
    //     max = c;
    // }
    // int max = Math.max(c, Math.max(a, b));
    // System.out.println(max);


    //character check program
        char ch = sc.next().trim().charAt(0);
        if (ch >= 'a' && ch <= 'z'){
            System.out.println("Lowercase");
        } else{
            System.out.println("Uppercase");
        }

        System.out.println(ch);
    }
    
}

