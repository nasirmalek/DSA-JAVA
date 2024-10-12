import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        int ans = sum1(23,56);
        System.out.println(ans);

//        Scanner in = new Scanner(System.in);
//
//        int num1,num2,sum;
//        System.out.print("Enter number 1: ");
//        num1 = in.nextInt();
//        System.out.print("Enter number 2: ");
//        num2 = in.nextInt();
//        sum = num1 + num2;
//        System.out.println("the sum = " + sum);

        // using function



    }

    static void sum(){
        Scanner in = new Scanner(System.in);

        int num1,num2,sum;
        System.out.print("Enter number 1: ");
        num1 = in.nextInt();
        System.out.print("Enter number 2: ");
        num2 = in.nextInt();
        sum = num1 + num2;
        System.out.println("the sum = " + sum);

    }


    static int sum1(int a, int b){
        int sum = a + b;
        return sum;
    }

}
