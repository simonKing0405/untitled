//将数组中的数据用逗号连接
package lianxi.Readily;

import java.util.StringJoiner;

public class Zifupingjie {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3}; //定义数组
        //输出数组的每一个值
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
        //用StringBuilder创建一个sb对象
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) { //如果是最后一个索引，直接添加值
                sb.append(arr[i]);
            } else { //如果不是最后一个索引，添加值的同时加上逗号
                sb.append(arr[i] + ",");
            }
        }
        sb.append("]");
        System.out.println(sb); //输出
        //用StringJoier：StringJoier（“间隔符”，“开始值”，“结束值：）
        StringJoiner sj = new StringJoiner(",", "[", "]");
        for (int i = 0; i < arr.length; i++) {
            sj.add(arr[i] + "");
        }
        System.out.println(sj);
    }
}
