import java.util.HashSet;
import java.util.Scanner;

public class HashSetAdd {
    public static void main(String[]args){
        int N;
        HashSet<Integer> HashSetAdd = new HashSet<Integer>();
        Scanner sc = new Scanner(System.in);
        HashSetAdd.add(0);
        HashSetAdd.add(9);
        HashSetAdd.add(8);
        HashSetAdd.add(5);
        HashSetAdd.add(7);
        HashSetAdd.add(5);
        System.out.println("cac phan tu trong HashSet:");
        System.out.println(HashSetAdd);
        System.out.println("nhap phan tu can them:");
        N = sc.nextInt();
        if(!HashSetAdd.contains(N)){
            HashSetAdd.add(N);
            System.out.println("Them thanh cong");
            System.out.println("cac phan tu trong HashSet sau khi them:");
            System.out.println(HashSetAdd);
        }else{
            System.out.println("phan tu" +N+"da ton tai!");
        }
    }
}
