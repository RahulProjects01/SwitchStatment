
//==================================   WEEK NAME  ============================================================================================

import java.util.*;

public class File_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a month number: ");
        int week = sc.nextInt();
        System.out.println(week);

        switch (week) {
            case 1: {
                System.out.println("Monday");
                break;
            }
            case 2: {
                System.out.println("Tuesday");
                break;
            }
            case 3: {
                System.out.println("Wednesday");
                break;
            }
            case 4: {
                System.out.println("Thursday");
            }
            case 5: {
                System.out.println("Friday");
                break;
            }
            case 6: {
                System.out.println("Saturday");
                break;
            }
            case 7: {
                System.out.println("Sunday");
                break;
            }
            default: {
                System.out.println("Sorry,i can't undastand");
            }
        }
    }
}
