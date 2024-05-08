import java.util.ArrayList;
import java.util.Scanner;

public class MaxArraylist {
    public static void main(String[] args) {
        
        ArrayList<Integer> arraylistNumber = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int N;
        System.out.println("so phan tu Arraylist =");
        int n = sc.nextInt();
        for (int i = 0; i< n;i++){
            System.out.println("nhap phan tu thu "+ i + "=");
            N = sc.nextInt();
            arraylistNumber.add(N);
        }
        int Max = arraylistNumber.get(0);

        for(int i=1;i <arraylistNumber.size();i++){
            if(arraylistNumber.get(i).compareTo(Max) > 0){
                Max = arraylistNumber.get(i);
            }
        }
        System.out.println("phan tu lon nhat trong arraylist =" +Max);
       
    }
}
