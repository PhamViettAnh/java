import java.util.Scanner;

public class bai9slide96 {
    public static void main(String[] args) {
        int demchuthuong = 0;
        int demchuhoa = 0;
        int demso = 0;
        String chuoi;
        char kytu;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao mot chuoi bat ky: ");
        chuoi = sc.nextLine();
        for (int i = 0; i < chuoi.length(); i++) {
            kytu = chuoi.charAt(i);
            if (Character.isLowerCase( kytu)) {
                demchuthuong++;
            } else if (Character.isUpperCase(kytu)) {
                demchuhoa++;
            } else  if (Character.isDigit(kytu)) {
                demso++;
            }
        }
        System.out.println("so ky tu thuong: " + demchuthuong);
        System.out.println("so ky tu viet hoa: " + demchuhoa);
        System.out.println("ky tu so: " + demso);
    }
}
