
public class Task6 {


    public static class Vehicle
    {
        //定义成员变量
        private int wheels;
        private double weight;
        public int getWheels() {
            return wheels;
        }
        public void setWheels(int wheels) {
            this.wheels = wheels;
        }
        public double getWeight() {
            return weight;
        }
        public void setWeight(double weight) {
            this.weight = weight;
        }

        //构造方法
        public Vehicle(int wheels, double weight) {
            super();
            this.wheels = wheels;
            this.weight = weight;
        }



    }

    public static class Car extends Vehicle {
        // 定义新的成员变量
        private int loader;

        public int getLoader() {
            return loader;
        }

        public void setLoader(int loader) {
            this.loader = loader;
        }

        // 调用父类构造方法
        public Car(int wheels, double weight,int loader) {
            super(wheels, weight);
            this.loader=loader;

        }
    }

    public static class Truck extends Car
    {
        //添加新的成员变量
        private double payload;

        public double getPayload() {
            return payload;
        }

        public void setPayload(double payload) {
            this.payload = payload;
        }

        //调用父类构造方法
        public Truck(int wheels, double weight, int loader, double payload ) {
            super(wheels, weight, loader);
            this.payload=payload;
        }

    }

    public static class Text_car {

        public static void main(String[] args) {

            //实例化car对象
            Car c = new Car(4,1150,6);
            System.out.println("车轮的个数是"+c.getWheels()+"  车重是"+c.getWeight()+"\n这是一辆小车，能载"+c.getLoader()+"人,实载3人");

            System.out.println("----------------------");
            //实例化Truck对象
            Truck t= new Truck(6,15000,3,5000);
            System.out.println("车轮的个数是"+t.getWheels()+"  车重是"+t.getWeight()+"\n这是一辆卡车，能载"+t.getLoader()+"人,实载1人\n这是一辆卡车核载"+t.getPayload()+"kg,你已装载3000.0kg");
        }

    }
}
