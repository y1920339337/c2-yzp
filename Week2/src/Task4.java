import java.util.Scanner;

public class Task4 {
    public static class Game{
    int v = 100;
    int count = 0;
    public void guess() {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        if (v > i) {
            System.out.println("猜的有点小，再试一下吧！");
            count++;
            guess();
            return;
        } else if (v < i) {
            System.out.println("猜的有点大，再试一下吧！");
            count++;
            guess();
            return;
        } else {
            System.out.println("恭喜你猜对了！");
            count++;
        }
        System.out.println("一共猜了" + count + "次");

    }
    public static void main(String[] args) {
        Game m = new Game();
        Scanner sc = new Scanner(System.in);
        System.out.println("欢迎来到猜字游戏，请输入一个数：");
        m.guess();
    }

}


}
