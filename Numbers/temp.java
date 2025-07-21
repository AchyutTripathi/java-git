
import java.util.Scanner;

public class temp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter temp in c: ");
        float tempC = sc.nextFloat();

        float tempF = (tempC * 9/5) + 32;

        System.out.println(tempF);
    }
    
}
