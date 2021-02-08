public class Task7 {
    public static void main(String[] args) {
        Duck duck = new Duck("鸭子", "感冒", "发烧", 2);
        duck.showMsg();
        duck.showSymptom();
    }
}

/*
1.定义抽象家禽类(Poultry)
*/
abstract class Poultry {
    //	i.成员变量(私有):

    private String name;
    private String illness;

    // 症状(symptom)
    private String symptom;
    //	年龄(age)
    private int age;

    //	ii.成员方法:  showSymptom
    public abstract void showSymptom();

    // 成员方法:  showMsg
    public void showMsg() {
        System.out.print("动物种类:" + name);
        System.out.println(",年龄:" + age + "岁");
        System.out.println("入院原因:" + illness);
    }

    //	iii.提供空参和带参构造方法
    public Poultry() {
        super();
    }

    public Poultry(String name, String illness, String symptom, int age) {
        this.name = name;
        this.illness = illness;
        this.symptom = symptom;
        this.age = age;
    }

    //	iv.提供setXxx和getXxx方法
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIllness() {
        return illness;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }

    public String getSymptom() {
        return symptom;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }
}

// Duck 类

class Duck extends Poultry {

    public Duck() {

    }

    public Duck(String name, String illness, String symptom, int age) {

        super(name, illness, symptom, age);

    }

    @Override

    public void showSymptom() {

        System.out.println("症状为:" + getSymptom());

    }

}
