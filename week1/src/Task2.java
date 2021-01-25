public class Task2 {
    public static void main(String[] args){
        int a=100,e=0;
        for(a=100;a<1000;a++)
        {
            int b, c, d;
            b = a / 100;/* b为百位*/
            c = (a - b * 100) / 10;/*c为十位*/
            d = (a - b * 100 - c * 10) / 1;/*d为个位*/
            if (a == Math.pow(b, 3) + Math.pow(c, 3) + Math.pow(d, 3))
            {
                int i = e++;
//                System.out.println(a);
            }
        }
        System.out.println("1000以内的水仙数有"+e+"个");
    }
}
