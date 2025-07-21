import java.util.ArrayList;
public class permutations {
    public static void main(String[] args) {
        permutation("", "abc");
        ArrayList<String> list = permutationsList("", "abc");
        System.out.println(list);
        System.out.println(permutationCount("", "abc"));

        
    }

    static void permutation(String p, String up) {
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());
            permutation(first + ch + second, up.substring(1));
        }
    }






    // if we want to add in an ArrayList
    static ArrayList<String> permutationsList(String p, String up) {
        if(up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        //local to this call
        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());
            ArrayList<String> rec = permutationsList(first + ch + second, up.substring(1));
            ans.addAll(rec);
        }
        return ans;
    }









    // if we want to return the count
    static int permutationCount(String p, String up) {
        if(up.isEmpty()) {
            return 1;
        }

        int count = 0;
        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());
            count = count + permutationCount(first + ch + second, up.substring(1));
        }
        return count;
    }
}
