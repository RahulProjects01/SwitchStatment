import java.util.*;

public class File_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a week number: ");
        int month = sc.nextInt();
        System.out.println(month);

        switch (month) {
            case 1: {
                System.out.println("January");
                break;
            }
            case 2: {
                System.out.println("Feb.");
                break;
            }
            case 3: {
                System.out.println("March");
                break;
            }
            case 4: {
                System.out.println("April");
            }
            case 5: {
                System.out.println("may");
                break;
            }
            case 6: {
                System.out.println("June");
                break;
            }
            case 7: {
                System.out.println("July");
                break;
            }
            case 8: {
                System.out.println("Augest");
                break;
            }
            case 9: {
                System.out.println("Sept.");
                break;
            }
            case 10: {
                System.out.println("Octber");
                break;
            }
            case 11: {
                System.out.println("November");
                break;
            }
            case 12: {
                System.out.println("December");
                break;
            }
            default: {
                System.out.println("Sorry,i can't undastand");
            }
        }
    }
}