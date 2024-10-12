import java.util.Arrays;

public class MethodOverloading {
    public static void main(String[] args) {   //basic example for overlaodding
        // fun(45);
        // fun("Nasir");

        demo(23,45,67,8,912);
        demo("nasir","arman","saalim");
        
    }
    // static void fun(int a){
    //     System.out.println("first one");
    //     System.out.println(a);
    // }

    // static void fun(String name){
    //     System.out.println("second one");
    //     System.out.println(name);
    // }

    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }
}
