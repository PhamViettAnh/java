
import java.util.LinkedHashSet;
import java.util.Scanner;
public class LinkedHashSett {
    public static void main(String[] args) {
        String name;
        LinkedHashSet<String> HashSet = new LinkedHashSet<String>();
        Scanner sc = new Scanner(System.in);
        HashSet.add("java");
        HashSet.add("C++");
        HashSet.add("PHP");
        HashSet.add("Python");
        HashSet.add("C#");
        System.out.println("cac phan tu trong HashSet:");
        System.out.println(HashSet);
        System.out.println("phan tu can xoa:");
        name = sc.nextLine();
        
        if(HashSet.contains(name)){
            HashSet.remove(name);
            System.out.println("cac phan tu trong HashSet:");
            System.out.println(HashSet);
        }else{
            System.out.println("xoa thanh cong");
        }
        for(String Str : HashSet){
            System.out.println(Str);
        }
    }
}
