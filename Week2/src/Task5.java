public class Task5 {
    public static class Monkey {
        private String name;
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        Monkey(String s){
            this.name=s;
        }
        public void speak(){
            System.out.println("咿咿呀呀.........");
        }
    }
    public static class People00 extends Monkey {
        People00(String s) {
            super(s);
        }
        public void speak(){
            System.out.println("小样的，不错嘛！会说话了！");
        }
        void think(){
            System.out.println("别说话！认真思考！");
        }
    }
    public static class E {
        public static void main(String[] args) {
            Monkey m=new Monkey("Toney");
            System.out.println("我是猴子"+m.getName());
            m.speak();
            People00 p=new People00("Tom");
            System.out.println("我是人类"+p.getName());
            p.speak();
            p.think();
        }
    }
}
