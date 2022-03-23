import java.util.Scanner;

class OddEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = scan.nextInt();

        if (num % 2 != 0) {
            System.out.println(num + "is odd number");;
        } else {
            System.out.println(num + "is even number");
        }

       
    }
}