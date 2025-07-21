public class Operators {
    // public static void main(String[] args) {
    //     int n = 67;
    //     System.out.println(isOdd(n));
    // }

    // public static boolean isOdd(int n) {
    //     return (n & 1) == 1;
    // }





    //FIND THE NUMBER WHICH APPEAR 1 TIME IN THE ARRAY
    // public static void main(String[] args) {
    //     int[] arr = {2,3,3,4,2,6,4};
    //     System.out.println(ans(arr));
    // }
    
    // public static int ans(int[] arr) {
    //     int unique = 0;
    //     for (int n : arr) {
    //         unique ^= n;
    //     }
    //     return unique;
    // }






    //MAGIC NUMBER
    public static void main(String[] args) {
        int n = 1000000000;
        int ans = 0;
        int base = 5;
        while (n > 0) {
            int last = n & 1;
            n = n >> 1;
            ans += last * base;
            base = base * 5;
        }
        System.out.println(ans);
    }
}
