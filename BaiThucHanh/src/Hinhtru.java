import java.util.Scanner;

public class Hinhtru extends hinhtron2{
    public float ChieuCao;

public Hinhtru(){
    TenHinh = "Hinh Tru";
}
public void nhapChieuCao(){
    super.nhapBanKinh();
    System.out.println("Chieu Cao =");
    Scanner sc = new Scanner(System.in);
    ChieuCao = sc.nextFloat();
}
public void tinhTheTich(){
    super.tinhDienTich();
    TheTich = DienTich*ChieuCao;
}
}
