public class Swap{
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Before swapping: " + a + " " + b);

        //swapping logic
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping: " + a + " " + b);
    }
}  