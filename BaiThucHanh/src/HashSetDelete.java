import java.util.HashSet;
import java.util.Scanner;

public class HashSetDelete {
    public static void main(String[] args) {
        String name;
        HashSet<String> HashSet = new HashSet<String>();
        Scanner sc = new Scanner(System.in);
        HashSet.add("Lambighini");
        HashSet.add("BWM");
        HashSet.add("ToYoTa");
        HashSet.add("VOLVO");
        HashSet.add("Kia");
        HashSet.add("Mecedes");
        System.out.println("cac phan tu trong HashSet");
        System.out.println(HashSet);
        System.out.println("phan tu can xoa:");
        name = sc.nextLine();
        if(HashSet.contains(name)){
            HashSet.remove(name);
            System.out.println("xoa thanh cong");
            System.out.println("cac phan tu trong HashSet:");
            System.out.println(HashSet);
        }else{
            System.out.println("xoa thanh cong");
        }
    }
}
