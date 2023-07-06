
//====================================  EVEN - ODD NUMBER ==================================================================

import java.util.*;

public class File_4{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a vowel charecter for e even number and o for odd number: ");
        char user = sc.next().charAt(0);
        System.out.println(user);

        switch (user) {
            case 'e': {

                System.out.println("Entera number to check: ");
                int num = sc.nextInt();
                if(num%2==0)
                {
                    System.out.println("even");
                }
                else 
                {
                     System.out.println("odd");
                }
                break;
            }
            case 'o': 
            {
                System.out.println("Enter a number: ");
                int num = sc.nextInt();
                 if(num%2!=0)
                {
                    System.out.println("odd");
                }
                else 
                {
                     System.out.println("even");
                }
                break;
            }
            default: {
                System.out.println("Wrong input ");
            }
        }
    }
}
