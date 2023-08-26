import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Bye world...");
        System.out.print("Hello world!");
        System.out.print("Bye world...");
        System.out.print("Hello world \n");
        int x=5;
        int y=6;
        System.out.println("x=" + x + "; y=" + y); // x=5; y=6
        System.out.println();

        int a=5;
        int b=6;
        System.out.printf("a=%d; b=%d \n", a, b); // a=5; b=6
        System.out.println();

        String name = "Tom";
        int age = 30;
        float height = 1.7f;
        System.out.printf("Name: %s  Age: %d  Height: %.2f \n", name, age, height); // Name: Tom  Age: 30  Height: 1,70
        System.out.println();

        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = in.nextInt();
        System.out.printf("Your number: %d \n", num);
        System.out.println();

        Scanner in2 = new Scanner(System.in);
        System.out.print("Input name: ");
        String name2 = in2.nextLine();
        System.out.print("Input age: ");
        int age2 = in2.nextInt();
        System.out.print("Input height: ");
        float height2 = in2.nextFloat();
        System.out.printf("Name: %s  Age: %d  Height: %.2f \n", name2, age2, height2);
        in.close();
    }
}