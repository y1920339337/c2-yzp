public class Task9 {
    public static void main(String[] args) {
        Star s  = new Star();
        s.shine();

        System.out.println("====================");

        Universe universe = new Sun();

        universe.doAnything();
        Sun sun  = (Sun) universe;
        sun.shine();
    }
}

interface  Universe{
    public abstract void doAnything();
}

class Star {
    public void shine(){
        System.out.println("star:星星一闪一闪亮晶晶");
    }
}
class  Sun extends Star implements Universe{
    @Override
    public void doAnything() {
        System.out.println("sun:太阳吸引着9大行星旋转");
    }
    @Override
    public void shine() {
        System.out.println("sun:光照八分钟,到达地球");
    }
}
