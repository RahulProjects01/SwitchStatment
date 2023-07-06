
//=================================================================================================================

import java.util.Scanner;

public class File_5 {

    public static void main(String[] args)
    {
        int c;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the operter '+' '-' '*' '/' '%' :");

        char operter = sc.next().charAt(0);
        System.out.print("enter the a value :");

        int a = sc.nextInt();

        System.out.print("enter the b value :");

        int b = sc.nextInt();

        switch (operter)
        {
            case '+': {
                c = a + b;
                System.out.print("result = " + c);
                break;
            }
            case '-': {
                c = a - b;
                System.out.print("result = " + c);
                break;
            }
            case '*': {
                c = a * b;
                System.out.print("result = " + c);
                break;
            }
            case '/': {
                c = a / b;
                System.out.print("result = " + c);
                break;
            }
            case '%': {
                c = a % b;
                System.out.print("result = " + c);
                break;
            }
            default: {
                System.out.print("Not Match");
            }
        }
    }
}
