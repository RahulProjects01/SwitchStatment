
// p = prime number 
// o = odd number 
// e =even number

import java.util.Scanner;

public class File_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the chois 'p' = prime number 'o' = odd number 'e' = even number :");
        char user = sc.next().charAt(0);
        System.out.print("Enter the number :");
        int num = sc.nextInt();
        switch (user) {
            case 'p': {
                int i = 2;
                boolean flag = false;
                while (i <= num / 2) {
                    if (num % i == 0) {
                        flag = true;
                        break;
                    }
                    ++i;
                }
                if (!flag)
                    System.out.println(num + " is a prime number.");
                else
                    System.out.println(num + " is not a prime number.");
                break;
            }
            case 'o': {
                if (num % 2 != 0)
                    System.out.print("Odd Number");
                else
                    System.out.print(" Not Odd Number");
                break;
            }
            case 'e': {
                if (num % 2 == 0)
                    System.out.print("Even Number");
                else
                    System.out.print(" Not Even Number");
                break;
            }
            default: {
                System.out.print("Not Match");
            }
        }
    }
}
