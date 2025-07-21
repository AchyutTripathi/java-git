import java.util.ArrayList;

public class Ascii {
    public static void main(String[] args) {
        // char ch = 'a';
        // System.out.println(ch + 0);
        // subseq("", "abc");
        System.out.println(subseq("", "abc"));
    }


    // if we want to return a ascii value
    // static void subseq(String p, String up) {
    //     if(up.isEmpty()) {
    //         System.out.println(p);
    //         return;
    //     }
    
    //     char ch = up.charAt(0);
    
    //     //two recursion call add it or remove it
    //     subseq(p + ch, up.substring(1));
    //     subseq(p, up.substring(1));
    //     subseq(p + (ch + 0), up.substring(1));
        
    // }


    
    // if we want to add in an ArrayList
    static ArrayList<String> subseq(String p, String up){
        if(up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> left = subseq(p + ch, up.substring(1));
        ArrayList<String> right = subseq(p, up.substring(1));
        ArrayList<String> ascii = subseq(p + (ch + 0), up.substring(1));

        left.addAll(right);
        left.addAll(ascii);
        return left;
    }
}
