public class patterns {
    public static void main(String[] args) {
        pattern7(6);
    // }
    // static void pattern1(int n) {
    //     for (int row = 1; row <= n; row++) {
    //         //for every row run the col
    //         for (int col = 1; col <= row; col++) {
    //             System.out.print("* ");
    //         }
    //         //when one row is printed, we need to add aa newline
    //         System.out.println();
    //     }




    }
    //PATTERN 2

    // static void pattern2(int n) {
    //     for (int row = 1; row <= n; row++) {
    //         for (int col = 1; col <= n; col++) {
    //                 System.out.print("* ");
    //             }
    //         System.out.println();
    //     }
    // }




    //PATTERN 3

    // static void pattern3(int n) {
    //     for (int row = 1; row <= n; row++) {
    //         for (int col = n; col > row-1; col--) {
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }






    //PATTERN 4

    // static void pattern4(int n) {
    //     for (int row = 1; row <= n; row++) {
    //         for (int col = 1; col <= row; col++) {
    //             System.out.print(col + " ");
    //         }
    //         System.out.println();
    //     }
    // }





    // PATTERN 5

    // static void pattern5 (int n) {
    //     for (int row = 1; row <= 2 * n; row++) {
    //         int totalColInRow = row > n ? 2 * n - row : row;
    //         for (int col = 0; col < totalColInRow; col++) {
    //            System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
    // }







    //PATTERN 6
    
    // static void pattern6(int n) {
    //     for (int row = 1; row < 2 * n; row++) {
    //         int totalColInRow = row > n ? 2 * n - row : row;
    //         int spaces = n - totalColInRow;
    //         for (int s = 0; s < spaces; s++) {
    //             System.out.print(" ");
    //         }
    //         for (int col = 0; col < totalColInRow; col++) {
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
    // }






    // PATTERN 7

    static void pattern7(int n) {
        for (int row = 1; row <= n; row++) {
            for (int spaces = 0; spaces < n - row; spaces++){
                System.out.print("  ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
