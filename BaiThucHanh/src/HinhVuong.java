import java.util.Scanner;

public class HinhVuong extends HinhChuNhat{
    public float Canh;
    public HinhVuong(){
        TenHinh = "Hinh Vuong";
    }
    public void nhapCanh(){
        System.out.println("Do Dai Canh =");
        Scanner sc = new Scanner(System.in);
        Canh = sc.nextFloat();
    }
    public void tinhChuVi(){
        ChuVi = Canh*4;
    }
    public void tinhDienTich(){
        DienTich = Canh*Canh;
    }
}
