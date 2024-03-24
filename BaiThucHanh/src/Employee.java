import java.util.Scanner;

public class Employee extends person{
    public String NgheNghiep;
    public float ThoiGianLamViec;
    public float Luong;
    public void nhapThongTin(){
        super.nhapID();
        super.nhapHoTen();
        super.nhapDiaChi();
        super.nhapChucVu();
        System.out.println("Nghe Nghiep:");
        System.out.println("Luong = ");
        Scanner sc = new Scanner(System.in);
        NgheNghiep = sc.nextLine();
        ThoiGianLamViec = sc.nextFloat();
        Luong = sc.nextFloat();
    }
    public void inthongtin(){
        super.inthongtin();
        System.out.println("Nghe Nghiep la: "+NgheNghiep);
        System.out.println("Luong ="+Luong);
    }
}