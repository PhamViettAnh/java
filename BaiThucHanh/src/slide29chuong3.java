import java.util.Scanner;

public class slide29chuong3 {
    public float BanKinh, ToaDo;
    Scanner sc = new Scanner(System.in);
    public void nhapbankinh(){
        System.out.println("Ban Kinh =");
        BanKinh = sc.nextFloat();
    }
    public void nhapbankinh(int R){
        System.out.println(R+ "=");
    }
    public void nhapToaDo(){
        System.out.println("Toa Do =");
        ToaDo = sc.nextFloat();
    }
    public void nhapToaDo(float X,int Y){
        System.out.println(X+ ";"+Y);
    }
    public void inthongtin(){
        System.out.println("Ban Kinh =" +BanKinh);
        System.out.println("Toa Do ="+ToaDo);
    }
    public static void main(String[] args) {
        slide29chuong3 HT = new slide29chuong3();
        HT.nhapbankinh();   
        HT.nhapToaDo();
        HT.inthongtin();
    }
}
