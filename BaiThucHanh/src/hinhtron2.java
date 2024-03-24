import java.util.Scanner;

public class hinhtron2 extends HinhHoc {
    public float BanKinh;
    public hinhtron2(){
        TenHinh = "Hinh Tron";
    }
    public void nhapBanKinh(){
        System.out.println("nhap ban kinh =");
        Scanner sc = new Scanner(System.in);
        BanKinh = sc.nextFloat();
    }
    public void tinhChuVi(){
        ChuVi = 2*PI*BanKinh;
    }
    public void tinhDienTich(){
        DienTich = PI*BanKinh*BanKinh;
    }
}
