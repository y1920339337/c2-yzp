import java.util.Scanner;

public class Task3{

    public static void main(String[] args) {
        System.out.println("请输入一段字符串:");
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        str=str.trim();
        String str2="";
        if(str != null && !"".equals(str)){
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)>=48 && str.charAt(i)<=57){
                    str2+=str.charAt(i);
                }
            }

        }
        System.out.println(str2);
    }

}
