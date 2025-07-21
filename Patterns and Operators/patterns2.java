public class patterns2 {
    public static void main(String[] args) {
     //solid rectangle 
    for(int i = 1; i<=5; i++)
    {
        for(int j = 1; j<=5; j++)
        {
            System.out.print("*");
        }
        System.out.println();
    }


    //hollow rectangle
    int n = 4, m = 5;
    for(int i = 1; i<=n; i++)
    {
        for(int j = 1; j<=m; j++)
        {
         if(i == 1 || j == 1 || i == n || j == m)
         {
          System.out.print("*");  
         }
         else{
            System.out.print(" ");
         } 
        }
        System.out.println();
    }
     

    //Half Pyramid
    int a = 5;
    for(int i = 1; i <= a; i++){
        for(int j = 1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
    }


    //inverted half pyramid
    int b = 5;
    for(int i = b; i>=1; i--){
        for(int j = 1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
    }


    //inverted half pyramid (rotated by 180 degree)
    int c = 5;
    for(int i = 1; i<=c; i++){
        for(int j=1; j<=c-i; j++){
            System.out.print(" ");
        }
        for(int j = 1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
    }


    //half pyramid with numbers
    int d=5;
    for(int i = 1; i<=d; i++){
        for(int j=1; j<=i; j++){
            System.out.print(j+" ");
        }
        System.out.println();
    }


    //inverted half pyramid with numbers
    int e=5;
    for(int i=e; i>=1; i--){
        for(int j = 1; j<=i; j++){
            System.out.print(j+" ");
        }
        System.out.println();
    }


    //Floyd's triangle
    int f=5;
    int number = 1;
    for(int i=1; i<=f; i++){
        for(int j=1; j<=i; j++){
            System.out.print(number+" ");
            number++;
        }
        System.out.println();
    }


    //0-1 triangle
    int k=5;
    for(int i=1; i<=k; i++){
        for(int j=1; j<=i; j++){
            int sum = i+j;
            if(sum % 2 == 0){
            System.out.print("1 ");
            }else{
                System.out.print("0 ");
            }
        }
        System.out.println();
    }
    }
    
}
