import java.util.Scanner;
import java.util.TreeSet;

public class TreesetAdd {
    public static void main(String[]args){
        int N;
        TreeSet<Integer> TreeSet = new TreeSet<Integer>();
        Scanner sc = new Scanner(System.in);
        TreeSet.add(0);
        TreeSet.add(9);
        TreeSet.add(8);
        TreeSet.add(5);
        TreeSet.add(7);
        TreeSet.add(5);
        System.out.println("cac phan tu trong HashSet:");
        System.out.println(TreeSet);
        System.out.println("nhap phan tu can them:");
        N = sc.nextInt();
        if(!TreeSet.contains(N)){
            TreeSet.add(N);
            System.out.println("Them thanh cong");
            System.out.println("cac phan tu trong HashSet sau khi them:");
            System.out.println(TreeSet);
        }else{
            System.out.println("phan tu" +N+"da ton tai!");
        }
    }
}
