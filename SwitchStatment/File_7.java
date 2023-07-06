
// o =>betwwen range 67,89=>odd number
// e =>same even 

import java.util.Scanner;

public class File_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the even number 'e' and odd number 'o':");
        char user = sc.next().charAt(0);
        System.out.print("enter the first value :");
        int first = sc.nextInt();
        System.out.print("enter the range :");
        int range = sc.nextInt();
        switch (user) {
            case 'o': {
                while (first <= range) {
                    if (first % 2 != 0) {
                        System.out.println(first);
                    }
                    first++;
                }
                break;
            }
            case 'e': {
                while (first <= range) {
                    if (first % 2 == 0) {
                        System.out.print(first);
                    }
                    first++;
                }
            }
        }
    }
}
