package problem3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter C for Circle\nEnter R for Rectangle\nEnter T for Triangle");
        String sel = sc.nextLine();

        if(sel.equals("C")){
            System.out.println("Enter the radius of the Circle: ");
            double radius = sc.nextDouble();
            Circle cir = new Circle(radius);
            System.out.println("The area of Circle is: " + cir.computeArea());
        }
        else if(sel.equals("R")){
            System.out.println("Enter the width of the Rectangle: ");
            double width = sc.nextDouble();
            System.out.println("Enter the length of the Rectangle: ");
            double length = sc.nextDouble();
            Rectangle rec = new Rectangle(width,length);
            System.out.println("The area of Rectangle is: " + rec.computeArea());
        }
        else if(sel.equals("T")){
            System.out.println("Enter the base of the Triangle: ");
            double base = sc.nextDouble();
            System.out.println("Enter the height of the Triangle: ");
            double height = sc.nextDouble();
            Triangle tri = new Triangle(base,height);
            System.out.println("The area of Triangle is: " + tri.computeArea());
        }
        else {
            System.out.println("Invalid selection");
        }
    }
}
