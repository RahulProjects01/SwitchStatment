
// ------------------------number swap three method--------------------------

import java.util.Scanner;

public class File_9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the swap method 1 first way ,2 second way ,3 third way :");
        int a = sc.nextInt();
        System.out.print("enter the value of x :");
        int x = sc.nextInt();
        System.out.print("enter the value of y :");
        int y = sc.nextInt();
        int z;
        switch (a) {
            case 1: {
                System.out.println("the value of x is :" + x);
                System.out.println("the value of y is :" + y);
                x = x + y;
                y = x - y;
                x = x - y;
                System.out.println("the swap value of x is :" + x);
                System.out.print("the swap value of y is :" + y);
                break;
            }
            case 2: {
                System.out.println("the value of x is :" + x);
                System.out.println("the value of y is :" + y);
                x = x * y;
                y = x / y;
                x = x / y;
                System.out.println("the swap value of x is :" + x);
                System.out.print("the swap value of y is :" + y);
                break;
            }
            case 3: {
                System.out.println("the value of x is :" + x);
                System.out.println("the value of y is :" + y);
                z = x;
                x = y;
                y = z;
                System.out.println("the swap value of x is :" + x);
                System.out.print("the swap value of y is :" + y);
                break;
            }
            default: {
                System.out.print("this value swap not posibal");
            }
        }
    }
}
