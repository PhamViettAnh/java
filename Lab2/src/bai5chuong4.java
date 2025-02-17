package Lab2;
import java.util.HashMap;
import java.util.Scanner;

public class bai5chuong4 {
     public static void main(String[] args) {
        HashMap<Integer, SinhVien> dssv = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("so sinh vien : ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= n; i++) {
            System.out.println("Nhap ma sinh vien " + i + ": ");
            int masv = sc.nextInt();
            sc.nextLine();
            System.out.println("Nhap ho va ten sinh vien " + i + ": ");
            String hoten = sc.nextLine();
            System.out.println("Nhap lop cua sinh vien " + i + ": ");
            String lop = sc.nextLine();
            SinhVien sv = new SinhVien(masv, hoten, lop);
            dssv.put(masv, sv);
        }
        System.out.println("Nhap ten lop can tim: ");
        String LopHoc = sc.nextLine();
        for (SinhVien sv : dssv.values()) {
            if (((String) sv.lop).equalsIgnoreCase(LopHoc)) {
                System.out.println("Sinh vien hoc lop " + LopHoc + ": " + sv.hoten);
            }
        }
        System.out.println("Nhap ma sinh vien can tim: ");
        int TimMasv = sc.nextInt();
        if (dssv.containsKey(TimMasv)) {
            SinhVien found = dssv.get(TimMasv);
            System.out.println("Ho va ten sinh vien: " + found.hoten);
            System.out.println("Lop: " + found.lop);
        } else {
            System.out.println("Khong tim thay sinh vien co ma sinh vien " + TimMasv);
        }
    }
}
