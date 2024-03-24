import java.util.Scanner;

public class person {
    public String ID, HoTen,DiaChi;
    public int ChucVu;
    public person(){
        ID = "1214";
        HoTen = "phamvietanh";
        ChucVu = 12;
        DiaChi = "HaiDUong";
    }
    Scanner sc = new Scanner(System.in);
    public void nhapID(){
        System.out.println("ID =");
        ID = sc.nextLine();
    }
    public void nhapID(int ID){
        System.out.println("ID ="+ID);
    }
    public void nhapHoTen(){
        System.out.println("HO va Ten:");
        HoTen = sc.nextLine();
    }
    public void nhapChucVu(){
        System.out.println("Chuc Vu :");
        ChucVu = sc.nextInt();
    }
    public void nhapChucVu(String ChucVu){
        System.out.println("Chuc Vu :"+ChucVu);
    }
    public void nhapDiaChi(){
        System.out.println("Dia Chi :");
        DiaChi = sc.nextLine();
    }
    public void inthongtin(){
        System.out.println("ID ="+ID);
        System.out.println("Ho Ten :"+HoTen);
        System.out.println("Chuc Vu ="+ChucVu);
        System.out.println("Dia Chi : "+DiaChi);
    }
    public static void main(String[] args) {
        person PE = new person();
        PE.nhapID(321);
        PE.nhapHoTen();
        PE.nhapChucVu("QuanLy");
        PE.nhapDiaChi();
    }

}
