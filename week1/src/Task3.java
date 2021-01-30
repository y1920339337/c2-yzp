import java.util.*;

public class Task3 {
   public static StringBuilder reverse(String s)
    {
        return new StringBuilder(s).reverse();
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s;
        System.out.print("输入：");
        s=in.nextLine();
            System.out.println("输出：" + reverse(s));

    }
}

