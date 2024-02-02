import java.util.Scanner;

public class bai6slide95 {
    public static void main(String[] args) {
        int n,giaithua = 1;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("nhap vao so nguyen duong bat ky = ");
            n = sc.nextInt();
        }while(n<0);
        for(int i =1;i<n;i++){
            giaithua = giaithua*i;
        }
        System.out.print("giai thua cua " +n +" la "+giaithua);
    }
}
