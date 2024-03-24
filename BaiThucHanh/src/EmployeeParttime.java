import java.util.Scanner;

public class EmployeeParttime extends Employee {
    public float ThoiGianLamViec;
    public float TienLuongTheoGio;
    public void nhapThongTin(){
        System.out.println("Thoi Gian Lam Viec =");
        System.out.println("Tien Luong Theo Gio =");
        Scanner sc = new Scanner(System.in);
        ThoiGianLamViec = TienLuongTheoGio = sc.nextFloat();
    }
    public void tinhLuong(){
        Luong = ThoiGianLamViec*TienLuongTheoGio;
    }
    
}
