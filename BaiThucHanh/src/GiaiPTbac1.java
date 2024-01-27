import java.util.Scanner;

public class GiaiPTbac1 {
    public static void main(String[]args){
        double a,b,x;
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap a=");
        a = sc.nextDouble();
        System.out.print("nhap b=");
        b = sc.nextDouble();
        if( a==0){
            System.out.println("khong phai phuong trinh bac 1");
        }else{
            x=-b/a;
            System.out.println("x="+x);
        }
    }
}
    
