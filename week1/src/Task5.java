import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Cricle cricle = new Cricle();
        Scanner in = new Scanner(System.in);
        double r;
        System.out.print("输入：");
        r=in.nextFloat();
        cricle.r=r;
      cricle.getArea();
      cricle.getPerimeter();
    }

    public static class Cricle {
        double r;
        void getArea(){
            double s=r*r*3.14;
            System.out.println("the area is "+s);

        }
        void getPerimeter(){
            double c=2*r*3.14;
            System.out.println("the perimeter is "+c);

        }
            }
}
