import java.util.Scanner;

public class baislide35TimSoNhoNhat {
    public static void main(String[]arg){
        double a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so a=");
        a = sc.nextDouble();
        System.out.print("nhap so b=");
        b = sc.nextDouble();
        double SoNhoNhat = a;
        if(a>b){
            SoNhoNhat = b;
        }else{
            SoNhoNhat = a;
        }
        System.out.println("So nho nhat = " +SoNhoNhat);
    }
}