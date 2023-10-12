package project1;

import java.util.Scanner;
public class Procedural{
    public static float Circle(int radius){
        return 22*radius*radius/7;
    }
    public static int rectangle(int a, int b){
        return (a*b);
    }
    public static int Square(int a){
        return a*a;
    }
    public static float sphere(int radius){
        return 4*22*radius*radius/7;
    }
    public static void main(String args[]){
        Scanner s =  new Scanner(System.in);
        //Circle
        System.out.println("Enter the radius of circle: ");
        int radius =  s.nextInt();
        System.out.println("The area of circle : " + Procedural.Circle(radius));

        // Rectangle
        System.out.println("Enter the length and breadth of rectangle: ");
        int length =  s.nextInt();
        int breadth =  s.nextInt();
        System.out.println("The area of rectangle : " + Procedural.rectangle(length,breadth));

        // Square
        System.out.println("Enter the length of square: ");
        int length1 =  s.nextInt();
        System.out.println("The area of square : " + Procedural.Square(length1));

        //Sphere      
        System.out.println("Enter the radius of sphere: ");
        int radius1 =  s.nextInt();
        System.out.println("The area of sphere : " + Procedural.sphere(radius1));
    }
} 

