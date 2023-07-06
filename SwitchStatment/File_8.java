
// t = area of triangle 
// c= area of circle 
// p =perimeter of circle 
// s =volume of sphere

import java.util.Scanner;

public class File_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(
                "enter your choise 't' area of triangle 'c' area of circle 'p'perimeter of circle 's'volume of sphere :");
        char user = sc.next().charAt(0);
        switch (user) {
            case 't': {
                System.out.print("enter the base :");
                float b = sc.nextFloat();
                System.out.print("enter the hight :");
                float h = sc.nextFloat();
                float area = (b * h) / 2;
                System.out.println("Area of Triangle is: " + area);
                break;
            }
            case 'c': {
                int r;
                double pie = 3.14, ar;
                Scanner s = new Scanner(System.in);
                System.out.print("Enter int radius of circle:");
                r = s.nextInt();
                ar = pie * r * r;
                System.out.println("Area of circle:" + ar);
                break;
            }
            case 'p': {
                System.out.println("Enter the double radius:");
                double rad = sc.nextDouble();
                double per;
                System.out.println("The radius of the circle is defined as " + rad);
                per = (22 * 2 * rad) / 7;
                System.out.println("The perimeter of Circle is: " + per);
                break;
            }
            case 's': {
                System.out.println("Enter the double radius:");
                double radius = sc.nextDouble();
                double pie = 3.14285714286;
                double volume = (4.0 / 3.0) * pie * (radius * radius * radius);
                System.out.println("Volume of the sphere=" + volume);
                break;
            }
            default: {
                System.out.print("No Match");
            }
        }
    }
}
