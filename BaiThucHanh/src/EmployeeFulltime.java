import java.util.Scanner;

public class EmployeeFulltime extends Employee{
    public float LuongCoBan;
    public int ThoiGianLamThem;
    public float TienTangCa;
    public void nhapThongTin(){
        System.out.println("Luong co ban = ");
        System.out.println("Thoi gian lam them =");
        System.out.println("Tien Tang Ca =");
        Scanner sc = new Scanner(System.in);
        LuongCoBan = sc.nextFloat();
        ThoiGianLamThem = sc.nextInt();
        TienTangCa = sc.nextFloat();
    }
    public void tinhLuong(){
        Luong = LuongCoBan +ThoiGianLamThem*TienTangCa;
    }
}
