import java.util.Scanner;

public class bai2slide93 {
    public static void main(String[]arg){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so nguyen=");
        n = sc.nextInt();
        if( n % 2 == 0){
            System.out.print("so chan");
        }else{
            System.out.print("so le");
        }
    }
}