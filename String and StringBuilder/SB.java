import java.util.ArrayList;
import java.util.Arrays;

public class SB {
    public static void main(String[] args) {
        // String a = "Achyut";
        // String b = "Achyut";
        // String c = a;
        // //comparison
        // // System.out.println(c == a);

        // String name1 = new String("Achyut");
        // String name2 = new String("Achyut");

        // // System.out.println(name1 == name2);

        // System.out.println(name1.equals(name2));
        
        // System.out.println(name1.charAt(0));


        // System.out.println(Arrays.toString(new int[] {2, 4, 6, 7, 9}));



        //PRETTYPRINTING
        // float a = 453.1234f;
        // System.out.printf("Formatted number is %.2f", a);

        // System.out.printf("Pie: %.3f",Math.PI);

        // System.out.printf("Hellow my name is %s and I am %s", "Achyut", "Tripathi");



        //OPERATORS
        // System.out.println('a' + 'b');
        // System.out.println("a" + "b");
        // System.out.println((char)('a' + 3));

        // System.out.println("a" + 1);
        //this is samew as after the few steps: "a" + "1"
        //integer will be converted into Integer that call toString()

        // System.out.println("Achyut" + new ArrayList<>()); // output - Achyut[]

        // System.out.println("Achyut" + new Integer(56));

        

        //PERFORMANCE - IMP FOR INTERVIEW

        // String series = "";
        // for (int i = 0; i < 26; i++) {
        //     char ch = (char)('a' + i);
        //     // System.out.println(ch);
        //     series = series + ch;
        // }
        // System.out.println(series);



        //STRINGBUILDER CLASS 
    //     StringBuilder builder = new StringBuilder();
    //     for (int i = 0; i < 26; i++) {
    //             char ch = (char)('a' + i);
    //             builder.append(ch);

    // }
    // System.out.println(builder.toString());
    
    //output - abcdefghijklmnopqrstuvwxyz






    //STRING METHODS
    // String name = "Achyut Tripathi Hello World";
    // System.out.println(Arrays.toString(name.toCharArray()));
    // System.out.println(name.toLowerCase());
    // //original one will not change it will create a new object
    // System.out.println(name);
    // System.out.println(name.indexOf('a'));
    // System.out.println( "     Achyut      ".strip());
    // System.out.println(Arrays.toString(name.split(" ")));
}
}
