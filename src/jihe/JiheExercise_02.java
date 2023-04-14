package jihe;

import java.util.ArrayList;

public class JiheExercise_02 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("111");
        list.add(1, "3");
        String a = list.get(1);
        System.out.println(list);
        System.out.println(a);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
