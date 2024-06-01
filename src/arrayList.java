import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int num = (int) (Math.random() * 10);
            al.add(num);
        }
        System.out.println(al);
        System.out.println("size: " + al.size());
        System.out.println("Is empty: "+al.isEmpty());
        al.remove(2);
        System.out.println(al);
    }
}
