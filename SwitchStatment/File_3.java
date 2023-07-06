
//=================================VOWEL AND COSONAT========================================================================================

import java.util.*;

public class File_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a vowel charecter: ");
        char vowel = sc.next().charAt(0);
        System.out.println(vowel);

        switch (vowel) {
            case 'a': {
                System.out.println("vowel");
                break;
            }
            case 'e': {
                System.out.println("vowel");
                break;
            }
            case 'i': {
                System.out.println("vowel");
                break;
            }
            case 'o': {
                System.out.println("vowel");
            }
            case 'u': {
                System.out.println("vowel");
                break;
            }
            default: {
                System.out.println("consonat ");
            }
        }
    }
}
