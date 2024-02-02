import java.util.Scanner;

public class bai11slide97 {
    public static void main(String[] args) {
        int n,temp;
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so phan tu cua mang :");
        n = sc.nextInt();
        int A[] = new int[n];
        for (int i =0; i<n ; i++){
            A[i] = sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            for(int j=i+1; j<n;j++){
                if (A[i]>A[j]){
                    temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }
            }
        }
        System.out.print("mang sau khi sap xep tang dan : ");
        for (int i=0; i<n;i++){
            System.out.print(A[i] +" ");
        }
    }
}
