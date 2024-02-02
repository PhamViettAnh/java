import java.util.Scanner;

public class baislide74 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("nhap so phan tu cua mang =");
            n = sc.nextInt();
        }while(n<0);
        int A[] = new int[n];
        for(int i = 1;i < n;i++){
            System.out.print("nhap so phan tu thu "+i +" cua mang ");
            A[i] =  sc.nextInt();
        }
        double TongCacSoChan = 0;
        for(int i = 0;i < n;i++){
            if(A[i] %2 ==0){
                TongCacSoChan +=A[i];
            }
        }System.out.println("Tong cac so chan cua mang =" +TongCacSoChan);
    }
}
