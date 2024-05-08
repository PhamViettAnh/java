import java.util.Scanner;

public class silde79Company {
    public String Ten;
    public double Luong;
    public String ChucVu;
    public int LuongCoBan,LuongLamThem;
    public float ThoiGianLamThem;
    public void nhapThongTin(){
        System.out.println("Ten =");
        System.out.println("Chuc Vu :");
        System.out.println("Luong Co Ban =");
        System.out.printlm("Luong Lam Them=");
        System.out.println("Thoi Gian Lam Them =");
        Scanner sc = new Scanner(System.in);
        Ten = sc.nextLine();
        ChucVu = sc.nextLine();
        LuongCoBan = sc.nextInt();
        LuongLamThem = sc.nextInt();
        ThoiGianLamThem = sc.nextFloat();
    }
    public void inthongtin(){
        System.out.println("Ten =");
        System.out.println("Chuc Vu :");
        System.out.println("Luong co ban =");
        System.out.println("Luong lam Them =");
        System.out.println("Thoi gian lam them =");
    }
    public void tinhLuong(){
        Luong = LuongCoBan *ThoiGianLamThem*LuongLamThem;
    }
    public class NhanVienFulltim extends silde79Company{
        
    }
}
