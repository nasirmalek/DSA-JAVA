import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        for loops
       int a = in.nextInt();
       for (int num = 1;num <= a;num++){
//            System.out.println(num);
           System.out.println("Hello world");
       }

//        while loops
//        int num =1;
//        while(num <= 10){
//            System.out.println(num);
//            num += 1;
//        }

//        do while loops
        int n=1;
        do {
            System.out.println("Hello world");
        } while (n != 1);
    }
}
