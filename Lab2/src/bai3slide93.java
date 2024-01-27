import java.util.Scanner;

public class bai3slide93 {
    public static void main(String[]arg){
        String Ten;
        int Tuoi;
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap Ten cua ban:");
        Ten = sc.nextLine();
        System.out.print("nhap Tuoi cua ban:");
        Tuoi = sc.nextInt();
        if(Tuoi<16){
            System.out.print("Ban " + Ten + " o do tuoi vi thanh nien");
        }else if(Tuoi>=16&&Tuoi<18){
            System.out.print("Ban " + Ten + " o do tuoi truong thanh");
        }else{
            System.out.print("Ban " + Ten + " da gia");
        }
    }
}
