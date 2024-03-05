import java.util.Scanner;

public class HinhTron {
    float BanKinh;
    final float PI = 3.14f;
    float ChuVi;
    float DienTich;
    public void nhapBanKinh()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap Ban Kinh =");
        BanKinh = sc.nextFloat();
    }
    public void tinhChuVi()
    {
        ChuVi = 2 * PI * BanKinh;
    }
    public void tinhDienTich()
    {
        DienTich = PI * BanKinh *BanKinh;
    }
    public void inThongTin()
    {
        System.out.print("Chu vi hinh tron = " +ChuVi);
        System.out.print("\nDien tich hinh tron = "+DienTich);
    }
    public static void main(String[]Arg){
        HinhTron ht = new HinhTron();
        
            ht.nhapBanKinh();
            ht.tinhChuVi();
            ht.tinhDienTich();
            ht.inThongTin();
        
    }
}
