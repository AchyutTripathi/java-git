public class WrapperExample {
    public static void main(String[] args) {
        // int a = 10;
        // int b = 20;


        // Integer num = 45;

        Integer a = 10;
        Integer b = 20;

        swap(a, b);
        System.out.println(a + " " + b);


        // eg. of final keyword
        // final int bonus = 2;
        // bonus = 3;

       final A Achyut = new A("Achyut Tripathi");
       Achyut.name = "other name";

       // when a non-primitive is final, you cannot reassign it.
    //    Achyut = new A("new object");


    A obj;

    for(int i = 0; i < 10000000; i++){
        obj = new A("Random name");
    }



    }    

    static void swap(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
    }

   
}


class A {
    final int num = 10;
    String name;

    //constructor
    public A(String name) {
        // System.out.println("Object created");
        this.name = name;
    }


    //finalize method
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }

}
