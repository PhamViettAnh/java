import java.util.Scanner;

public class baislide40HientThiNgay {
    public static void main(String[]arg){
        int Ngay;
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap vao so ngay=");
        Ngay = sc.nextInt();
        do{
            switch (Ngay) {
                case 1:System.out.println("Chu Nhat");
                break;
                case 2:System.out.println("Thu Hai");
                break;
                case 3:System.out.println("Thu Ba");
                break;
                case 4:System.out.println("Thu Tu");
                break;
                case 5:System.out.println("Thu Nam");
                break;
                case 6:System.out.println("Thu Sau");
                break;
                case 7:System.out.println("Thu Bay");
                break;
                default:System.out.println("khong la ngay nao");
                break;
            }
        }while(Ngay>0&&Ngay<8);

    }
}
