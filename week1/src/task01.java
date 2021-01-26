import java.util.Scanner;

public class task01 {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int a;
            float b;
            System.out.print("输入体重（kg）:");
            a=in.nextInt();
            System.out.print("输入身高（m）:");
            b=in.nextFloat();
            double BIM = a / (b * b);
            if(BIM<18.5)
                System.out.println("过轻");
            else if (BIM>=18.5&&BIM<25)
                System.out.println("正常");
            else if (BIM>=25&&BIM<28)
                System.out.println("过重");
            else if (BIM>=28&&BIM<32)
                System.out.println("肥胖");
            else
                System.out.println("非常肥胖");


        }
    }


