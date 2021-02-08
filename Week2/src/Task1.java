import java.util.Scanner;

public class Task1 {


    public static void main(String[] args) {
        int[][] matrixDemo;
        System.out.println("请输入3X3矩阵");
        matrixDemo = createMatrix();
        System.out.println("===========");
        rotate(matrixDemo);
        printMatrix(matrixDemo);
    }

    //顺时针旋转90度打印
    private static void rotate(int[][] matrix) {
        int tR=0;
        int tC=0;
        int dR=matrix.length-1;
        int dC=matrix[0].length-1;
        while(tR<=dR) {
            rotateEdge(matrix, tR++, tC++, dR--,dC--);
        }
    }

    //顺时针旋转90度打印
    private static void rotateEdge(int[][] matrix, int tR, int tC, int dR, int dC) {
        // TODO Auto-generated method stub
        int times=dC-tC;  // timies就是总的组数
        int temp=0;
        for(int i=0; i!=times;i++) {
            //一次循环就是一组调整
            temp=matrix[tR][tC+i];
            matrix[tR][tC+i]=matrix[dR-i][tC];
            matrix[dR-i][tC]=matrix[dR][dC-i];
            matrix[dR][dC-i]=matrix[tR+i][dC];
            matrix[tR+i][dC]=temp;

        }


    }

    //生成矩阵
    private static int[][] createMatrix() {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        int matrix[][]=new int[3][3];
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                matrix[i][j]=in.nextInt();
            }
        }

        return matrix;
    }

    //顺序打印矩阵元素
    private static void printMatrix(int[][] matrix) {
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }

    }

}

