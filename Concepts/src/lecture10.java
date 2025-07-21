import java.util.Scanner;

public class lecture10 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
    //     String fruit = sc.next();

    //     switch (fruit){
    //         case "Mango":
    //         System.out.println("King of Fruits");
    //         break;
    //          case "Apple":
    //         System.out.println("A sweet red Fruit");
    //         break;
    //          case "Orange":
    //         System.out.println("Round Fruit");
    //         break;
    //          case "Grapes":
    //         System.out.println("Small round Fruit");
    //         break;
    //         default:
    //         System.out.println("Please enter a valid fruit");
    // }

//     int day = sc.nextInt();
//     switch (day) {
//         case 1:
//             System.out.println("Monday");
//             break;
//     case 2:
//             System.out.println("Tuesday");
//             break;
//     case 3:
//              System.out.println("Wednesday");
//              break;
//     case 4:
//              System.out.println("Thursday");
//              break;
//     case 5:
//              System.out.println("Friday");
//              break;
//     case 6:
//              System.out.println("Saturday");
//              break;
//     case 7:
//              System.out.println("Sunday");
//              break;
//      default:
//              System.out.println("Please enter a valid Day");
//     }
    
// }
// }
//Nested Switch case

        int empID = sc.nextInt();
        String department = sc.next();

        switch (empID) {
            case 1:
                System.out.println("Achyut Tripathi");
                break;
            case 2:
                System.out.println("Ritik Tripathi");
                break;
            case 3:
                System.out.println("Emp Number 3");
                switch (department) {
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("Invalid Choice");
                }
            default:
                System.out.println("Enter correct empID");
        }
    }
}

