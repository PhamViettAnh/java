import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class bai1Chuong4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arraylistNumber = new ArrayList<Integer>();
        int number = sc.nextInt();
        System.out.println("so phan tu Arraylist =");
        int n = sc.nextInt();
        for (int i = 0; i< n;i++){
            System.out.println("nhap phan tu thu "+ i + "=");
            number = sc.nextInt();
            arraylistNumber.add(number);
        }
        int Max = arraylistNumber.get(0);
        for(int i=1;i <arraylistNumber.size();i++){
            if(arraylistNumber.get(i).compareTo(Max) > 0){
                Max = arraylistNumber.get(i);
            }
        }
        System.out.println("phan tu lon nhat trong arraylist =" +Max);
        System.out.print("Nhập vào số nguyên để xóa các phần tử có giá trị bằng số đó: ");
        int removeN = sc.nextInt();
        arraylistNumber.removeIf(number->number == removeN);
        arraylistNumber.sort(number);
        System.out.println("day so sau khi sap xep :"+number);
    }
}
