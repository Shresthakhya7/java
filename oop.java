package project1;

import java.util.Scanner;
public class oop{
    public float Circle(int radius){
        return 22*radius*radius/7;
    }
    public int rectangle(int a, int b){
        return (a*b);
    }
    public int Square(int a){
        return a*a;
    }
    public float sphere(int radius){
        return 4*22*radius*radius/7;
    }
    public static void main(String args[]){
        oop obj =  new oop();
        Scanner s =  new Scanner(System.in);
        //Circle
        System.out.println("Enter the radius of circle: ");
        int radius =  s.nextInt();
        System.out.println("The area of circle : " + obj.Circle(radius));

        // Rectangle
        System.out.println("Enter the length and breadth of rectangle: ");
        int length =  s.nextInt();
        int breadth =  s.nextInt();
        System.out.println("The area of rectangle : " + obj.rectangle(length,breadth));

        // Square
        System.out.println("Enter the length of square: ");
        int length1 =  s.nextInt();
        System.out.println("The area of square : " + obj.Square(length1));

        //Sphere
        System.out.println("Enter the radius of sphere: ");
        int radius1 =  s.nextInt();
        System.out.println("The area of sphere : " + obj.sphere(radius1));
    }
}

