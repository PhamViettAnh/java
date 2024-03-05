import java.util.Scanner;

public class QuanLyHocSInh {
    public  String MSSV, HoTen, GioiTinh, Khoa, QueQuan;
    Scanner sc = new Scanner(System.in);
    public void nhapMSSV(){
        System.out.print("\nnhap MSSV :");
        MSSV =  sc.nextLine();
    }
    public void nhapHoTen(){
        System.out.print("\nnhap HoTen:");
        HoTen = sc.nextLine();
    }
    public void nhapGioiTinh(){
        System.out.print("\nnhap gioi tinh:");
        GioiTinh = sc.nextLine();
    }
    public void nhapKhoa(){
        System.out.print("\nnhap Khoa:");
        Khoa = sc.nextLine();
    }
    public void nhapQueQuan(){
        System.out.print("\nnhap que quan:");
        QueQuan = sc.nextLine();
    }
    public void inthongtin(){
        System.out.println("MSSV: " +MSSV);
        System.out.println("HoTen: "+HoTen);
        System.out.println("Gioi Tinh: "+GioiTinh);
        System.out.println("Khoa: "+Khoa);
        System.out.println("Que Quan: "+QueQuan);
    }
    public static void main(String[]arg){
        QuanLyHocSInh QL = new QuanLyHocSInh();
        QL.nhapMSSV();
        QL.nhapHoTen();
        QL.nhapGioiTinh();
        QL.nhapKhoa();
        QL.nhapQueQuan();
        QL.inthongtin();
    }
}
