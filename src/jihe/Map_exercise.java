package jihe;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;//若羌导包，则需在35行写 Set<Map.Entry<String,Integer>> entries=m.entrySet();

public class Map_exercise {
    public static <Strinig> void main(String[] args) {
        Map<String, Integer> m = new HashMap<>();
        m.put("one", 1);
        m.put("two", 2);
        m.put("three", 3);
        m.put("four", 4);
        m.put("five", 5);


        /*//键找值，但效率较低
        Set<String> keys = m.keySet();// 创建建的集合
        //(增强for循环)
        for (String key : keys) {                   // 若无17行，则写成(String key:m.keySet()) 若无17行，则写成m.keySet()
            System.out.println(key + " " + m.get(key));
        }

        //（迭代器键找值）
        Iterator<String> it = keys.iterator();   //创建指针，指针指向0索引
        while (it.hasNext()) {//判断索引对应的位置是否有元素
            //System.out.println(it.next() + " " + m.get(it.next()));调用了两次next()，应该创建一个变量来存储键值
            String s = it.next();
            System.out.println(s + " " + m.get(s));
        }
*/


        /*//键值对方式遍历
        //增强for循环
        Set<Entry<String, Integer>> entries = m.entrySet();
        for (Map.Entry<String, Integer> entry1 : entries) {
            System.out.println(entry1.getKey() + " " + entry1.getValue());
        }

        // 迭代器遍历
        Iterator<Entry<String, Integer>> it = m.entrySet().iterator();
        while (it.hasNext()) {
            Entry<Strinig, Integer> entry2 = (Entry<Strinig, Integer>) it.next();

            System.out.println(entry2.getKey() + " " + entry2.getValue());
        }*/
    }
}
