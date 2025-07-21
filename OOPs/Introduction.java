

public class Introduction {
    public static void main(String[] args) {
        // store 5 roll no.
        int[] numbers = new int[5];

        // store 5 names
        String[] names = new String[5];

        // data of 5 students {roll no, name, marks}
        int[] rno = new int[5];
        String[] name = new String[5];
        Float[] marks = new Float[5];


        // creating own datatype that contains all 3 things
        Student[] student = new Student[5];

        // // just declaring
        // Student Achyut;
        // Achyut = new Student();


        Student Achyut = new Student(100, "Achyut Tripathi", 88.5f);
        Student Rahul = new Student();

        // modifying it
        // Achyut.rno = 13;
        // Achyut.name = "Achyut Tripathi";
        // Achyut.marks = 88.5f;

        // Achyut.changeName("Ishu");
        // Achyut.greeting();


        System.out.println(Achyut.rno);
        System.out.println(Achyut.name);
        System.out.println(Achyut.marks);


        Student random = new Student(Achyut);
        System.out.println(random.name);


        Student random2 = new Student();
        System.out.println(random2.name);


        Student one = new Student();
        Student two = one;

        one.name = "Something something";

        System.out.println(two.name);
    } 
}   

// create a class
// for every single student
class Student {
    int rno;
    String name;
    float marks;

    //we need  a way to add the values of the above properties object by object
    // we need one word to access every object


    // greeting function
    void greeting() {
        System.out.println("Hello! My name is " + this.name);
    }

    void changeName(String newName) {
        name = newName;
    }


    Student (Student other) {
        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;
    }

    // constructor
    Student () { 
       // this is how you call a constructor from another constructor
       // internally : new Student (13, "default person", 101.0f); 
       this (13, "default person", 101.0f);
    }



    // Student Arpit = new Student(17, "Arpit", 75.6f);
    // here, this will be replaced with Arpit
    Student (int rno, String name, float marks) { 
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }
}

