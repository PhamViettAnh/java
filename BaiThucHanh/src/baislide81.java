import java.util.Scanner;

public class baislide81 {
    public static void main(String[] args) {
        int m,n;
        Scanner sc  = new Scanner(System.in);
        System.out.print("nhap so dong cua ma tran = ");
        m = sc.nextInt();
        System.out.print("nhap co cot cua ma tran = ");
        n = sc.nextInt();
        int A[][] =  new int[m][n];
        System.out.print("nhap ma tran :");
        for(int i = 0;i < m;i++){
            for(int j =0;j < n;j++){
                System.out.print("A ["+ i + "]["+ j + "]=");
                A[i][j] = sc.nextInt();
            }
        }
        int Max =  A[0][0];
        for(int i = 0;i < m;i++){
            for(int j = 0;i < n;j ++){
                if (Max < A[i][j]){
                    Max = A[i][j];
                }
            }System.out.print("Max cua ma tran la:"+Max);
        }
    }
}
