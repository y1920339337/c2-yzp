package substring;
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
public class Task2{
    public static void main(String[] args){
        System.out.println("请输入字符串：");
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        in.close();
        String[] str=s.split(" ");
        Queue<Character> queue=new LinkedList <Character>();
        for(int i=0;i<str.length;i++){
            if(str[i].equals(""))
                System.out.print("");
            String temp=str[i];
            Queue<Character> qtemp=new LinkedList<Character>();
            if(i==0){
                for(int j=0;j<temp.length();j++){
                    queue.add(temp.charAt(j));
                }
            }
            else{
                for(int j=0;j<temp.length();j++){
                    if(Character.valueOf(temp.charAt(j)).equals(queue.poll())){
                        qtemp.add(temp.charAt(j));
                    }
                    else{
                        break;
                    }
                }
                queue=qtemp;
            }
        }
        String res=new String();

        while(!queue.isEmpty()){
            res=res+queue.poll();
        }
        System.out.print(res);
        return;
    }
}




