import java.util.LinkedList;

public class linked {
    public static void main(String[] args) {
        LinkedList<String> List = new LinkedList<String>();
        List.add("java");
        List.add("python");
        List.add("C++");
        List.add("PHP");
        List.remove("PHP");
        System.out.println("Phuong thuc addALL()");
        LinkedList<String> ListA = new LinkedList<>();
        ListA.addAll(List);
        System.out.println("ListA:");
        showList(ListA);
        System.out.println("phuong thuc retainALL()");
        LinkedList<String> ListB = new LinkedList<String>();
        ListB.add("java");
        ListA.retainAll(ListB);
        System.out.println("ListA:");
        showList(ListA);
        System.out.println("phuong thuc removeALL()");
        List.removeAll(ListB);
        System.out.println("List:");
        showList(List);
    }
    public static void showList( LinkedList <String> List){
        for(String obj :List){
            System.out.println("\t" + obj +",");
        }
        System.out.println();
    }
}
