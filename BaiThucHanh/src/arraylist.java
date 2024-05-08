import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<String> arrayListColors = new ArrayList<String>();
        arrayListColors.add("orange");
        arrayListColors.add("blue");
        arrayListColors.remove("orange");
        arrayListColors.add(1, "green");
        arrayListColors.add("purple");
        arrayListColors.add("red");
        arrayListColors.add("pink");
        System.out.println(arrayListColors.getFirst());
        System.out.println(arrayListColors.get(1));
        System.out.println(arrayListColors.contains("blue"));
        System.out.println(arrayListColors.size());
        System.out.println(arrayListColors);
    }
}
