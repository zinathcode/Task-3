import java.util.Scanner;

public class ShapeMain {

    public static void main(String args[]) {
        int length, breadth, area;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the length of the rectangle ::");
            length = sc.nextInt();
            System.out.println("Enter the breadth of the rectangle ::");
            breadth = sc.nextInt();
        }
        area = length * breadth;
        System.out.println("Area of the rectangle is ::" + area);
    }
}
