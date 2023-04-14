//集合的遍历
package jihe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Exercise_01 {
    public static void main(String[] args) {
         /*Collection<Student> list = new ArrayList<>();
        Student stu1 = new Student("zhangsan", 25);
        list.add(stu1);
        System.out.println(((ArrayList<Student>) list).get(0));*/
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("111");
        list2.add("222");
        list2.add("333");
        list2.add("444");


        //迭代器遍历，迭代器不依赖索引
//        Iterator<String> it = list2.iterator();          //创建指针，指针指向0索引
        /*while (it.hasNext()) {                           //判断索引对应的位置是否有元素
            String str = it.next();//获取原集合的值，移动指针指向下一个索引

            System.out.print(str + " ");
        }
        System.out.println();*/

        /*for (int i = 0; i < list2.size(); i++) {
            System.out.print(list2.get(i) + " ");
        }*/
       /* for (String s : list2) {
            System.out.println(s);
        }*/
    }


}