import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        String fruit = in.next();
//
//        switch (fruit) {
//            case "mango" -> System.out.println("King of fruit");
//            case "apple" -> System.out.println("a sweet red fruit");
//            case "orange" -> System.out.println("round fruit");
//            case "grapes" -> System.out.println("small fruit");
//            default -> System.out.println("New fruit");
//        }

//        int year = in.nextInt();
//        switch (year) {
//            case 1 -> System.out.println("January");
//            case 2 -> System.out.println("February");
//            case 3 -> System.out.println("March");
//            case 4 -> System.out.println("April");
//            case 5 -> System.out.println("May");
//            case 6 -> System.out.println("June");
//            case 7 -> System.out.println("July");
//            case 8 -> System.out.println("August");
//            case 9 -> System.out.println("September");
//            case 10 -> System.out.println("October");
//            case 11 -> System.out.println("November");
//            case 12 -> System.out.println("December");
//            default -> System.out.println("Please Enter a valid year");
//        }

//        nested switch cases

        int empId = in.nextInt();
        String department = in.next();

        switch (empId) {
            case 1 -> System.out.println("Nasir");
            case 2 -> System.out.println("Arman");
            case 3 -> {
                System.out.println("Emp number 3");
                switch (department) {
                    case "IT" -> System.out.println("IT department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("No department entered");
                }
            }
            default -> System.out.println("Enter correct empId");
        }

    }
}
