import java.util.Scanner;

public class Task7 {
    public  static void main(String args[]){
        complex c=new complex();
        c.Complex();
    }

    public static class complex {
        public int a = 0;
        public int b = 0;

        public complex() {
            System.out.println("输入:");
            Scanner in = new Scanner(System.in);
            int c,d;
            c=in.nextInt();
            d=in.nextInt();
            this.a = c;
            this.b = d;
        }

        public void Complex() {
            Scanner in = new Scanner(System.in);
            int c,d,e,f,g,h,i,j;
            c=in.nextInt();
            d=in.nextInt();
            System.out.println("输出：");
            e = a + c;
            f = b + d;
            System.out.println("两复数相加的结果为：" + e + "+" + f + "i");
            g=a-c;
            h=b-d;
            System.out.println("两复数相减的结果为：" + g + "+" + h + "i");
            i=a*c;
            j=b*d;
            System.out.println("两复数相乘的结果为：" + i + "+" + j + "i");
        }
    }
}
