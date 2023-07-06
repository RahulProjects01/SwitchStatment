
// r =number reverse 
// f=factorial 
// p = pallindrome 
// a=armstrong 
// t=fibonacci series 

import java.util.Scanner;

public class File_6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the char 'r' 'f' 'p' 'a' 't' :");
        char alfa = sc.next().charAt(0);
        System.out.print("enter the number : ");
        int num = sc.nextInt();
        switch (alfa) {
            case 'r': {
                int rem, sum = 0;
                int temp = num;
                while (num > 0) {
                    rem = num % 10;
                    sum = sum * 10 + rem;
                    num = num / 10;
                }
                System.out.println(sum);
                break;
            }
            case 'f': {
                int i, fact = 1;
                for (i = 1; i <= num; i++) {
                    fact = fact * i;
                }
                System.out.println("the factorial num is :" + fact);
                break;
            }
            case 'p': {
                int rem, sum = 0;
                int temp = num;
                while (num > 0) {
                    rem = num % 10;
                    sum = sum * 10 + rem;
                    num = num / 10;
                }
                if (temp == sum) {
                    System.out.println("this is pallindrome number");
                } else {
                    System.out.println("this is not pallindrome number");
                }
                break;
            }
            case 'a': {
                int rem, sum = 0;
                int temp = num;
                while (num > 0) {
                    rem = num % 10;
                    sum = sum + rem * rem * rem;
                    num = num / 10;
                }
                if (temp == sum) {
                    System.out.println("armstrong number");
                } else {
                    System.out.println("not armstrong number");
                }
                break;
            }
            case 't': {
                int firstTerm = 0, secondTerm = 1;
                System.out.println("Fibonacci Series till " + num + " terms:");
                for (int i = 1; i <= num; ++i) {
                    System.out.print(firstTerm + ", ");
                    int nextTerm = firstTerm + secondTerm;
                    firstTerm = secondTerm;
                    secondTerm = nextTerm;
                }
                break;
            }
            default: {
                System.out.print("Not Match");
            }
        }
    }
}