import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nums[] = {0,1,0,3,12};
        int num=0;//用来计算0的个数
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){//如果nums[i]=0,zeroNum个数加一

            }else if(num!=0){//如果nums[i]不等于0,将nums[i]跟前zeroNum个交换，并且将nums[i]赋值为0
                nums[i-num]=nums[i];
                nums[i]=0;
            }
        }
        System.out.print("输出:[");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+",");
        }
        System.out.print("]");
    }

}