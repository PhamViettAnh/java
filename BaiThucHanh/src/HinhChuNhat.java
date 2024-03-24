import java.util.Scanner;

public class HinhChuNhat extends HinhHoc{
    float ChieuDai, ChieuRong;
    public HinhChuNhat(){
        TenHinh = "Hinh Chu Nhat";
    }
    public void nhapDoDai(){
        System.out.println("Chieu Dai =");
        System.out.println("Chieu Rong =");
        Scanner sc = new Scanner(System.in);
        ChieuDai = sc.nextFloat();
        ChieuRong = sc.nextFloat();
    }
    public void tinhChuVi(){
        ChuVi = (ChieuDai + ChieuRong)*2;
    }
    public void tinhDienTich(){
        DienTich = ChieuDai*ChieuRong;
    }
 }
    

