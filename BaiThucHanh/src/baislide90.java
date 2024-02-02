import java.util.Scanner;

public class baislide90 {
    public static void main(String[] args) {
        String Chuoi;
        char Kytu;
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap vao chuoi bat ky : ");
        Chuoi = sc.nextLine();
        System.out.println("cac ky tu trong chuoi la :");
        for(int i=0;i<Chuoi.length();i++){
            Kytu = Chuoi.charAt(i);
            System.out.println("Ky tu :"+Kytu);
        }
    }
}
