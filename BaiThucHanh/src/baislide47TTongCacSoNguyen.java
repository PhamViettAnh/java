import java.util.Scanner;

public class baislide47TTongCacSoNguyen {
    public static void main(String[]arg){
        int n, Tong = 0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("nhap vao cac so nguyen = ");
            n = sc.nextInt();
            Tong += n;
        }while(Tong<=100);
        System.out.println("Tong cac so nguyen=" +Tong);
    }
}
