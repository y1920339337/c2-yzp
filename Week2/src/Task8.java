public class Task8 {
    public static void main(String[] args) {
        // 创建C对象
        C c = new C();
        // 调用c 中方法
        c.showA();
        c.showB();
        c.showC();
    }
}

abstract  class A{
    int numa = 10;
    public abstract void showA();
}

abstract  class B extends A{
    int numb = 20;
    public abstract void showB();
}

class C extends B{
    int numc = 30;

    @Override
    public void showA() {
        System.out.println("A类中numa:"+numa);
    }

    @Override
    public void showB() {
        System.out.println("B类中numb:"+numb);

    }
    public void showC(){
        System.out.println("C类中numc:"+numc);
    }
}
