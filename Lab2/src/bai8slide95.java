import java.util.Scanner;

public class bai8slide95 {
    public static void main(String[] args) {
        int n;
        float Tong = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so phan tu:");
        n = sc.nextInt();
        int A[] = new int [ n ];
        for(int i =0;i< n;i++){
            System.out.print("nhap phaan tu thu "+i+" la :");
            A[i]= sc.nextInt();
        }
        for(int i =0;i<n;i++){
            Tong += A[i];
        }
        Tong = Tong /n;
        System.out.print("trung binh cong cua "+n +"so la :"+Tong);
    }
}
