import java.util.Scanner;

public class QuanLyNhanVien {
    public String MANV, HoTen,GioiTinh, ChucVu;
    public int NamSinh, Tuoi;
    Scanner sc = new Scanner(System.in);
    void nhapMANV(){
        System.out.print("\nMANV: ");
        MANV = sc.nextLine();
    }
    void nhapHoTen(){
        System.out.print("\nHo va Ten: ");
        HoTen = sc.nextLine();
    }
    void nhapGioiTinh(){
        System.out.print("\nGioi Tinh: ");
        GioiTinh = sc.nextLine();
    }
    void nhapChucVu(){
        System.out.print("\nChuc Vu: ");
        ChucVu = sc.nextLine();
    }
    void nhapNamSinh(){
        System.out.print("\nNam Sinh; ");
        NamSinh = sc.nextInt();
    }
    void TinhTuoi(){
        Tuoi = 2024 - NamSinh;
    }
    void InThongTin(){
        System.out.println("MANV: " +MANV);
        System.out.println("Ho va Ten: " +HoTen);
        System.out.println("Gioi Tinh: " +GioiTinh);
        System.out.println("Chuc Vu: " +ChucVu);
        System.out.println("Nam SInh: " +NamSinh);
        System.out.println("Tuoi: " +Tuoi);
    }
    public static void main(String[] args) {
        QuanLyNhanVien QL = new QuanLyNhanVien();
        QL.nhapMANV();
        QL.nhapHoTen();
        QL.nhapGioiTinh();
        QL.nhapChucVu();
        QL.nhapNamSinh();
        QL.TinhTuoi();
        QL.InThongTin();

    }
}
