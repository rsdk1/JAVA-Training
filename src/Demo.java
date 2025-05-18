import java.util.*;
public class Demo {
    public static void main(String[] args) {

        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        arrayList.add("javascript");
        linkedList.add("Javascript");

        arrayList.add("Flutter");
        linkedList.add("Flutter");

        arrayList.add(1, "C++");
        linkedList.add(1, "C++");

        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);
    }
}
