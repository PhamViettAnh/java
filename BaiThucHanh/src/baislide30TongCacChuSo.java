import java.util.Scanner;

public class baislide30TongCacChuSo {
    public static void main(String[]arg){
        int n, soDu, Tong = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print( "nhap so nguyen :");
        n = sc.nextInt();
        while(n>0){
            soDu = n % 10;
            n = n / 10;
            Tong += soDu;
        }
        System.out.println("Tong cac chu so ="+Tong);
    }
}
