package lianxi.Readily;

import java.util.Scanner;

public class exchangeNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] Arrays = str.split(",");   //通过“，”分离12
        int[] a = new int[Arrays.length];
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(Arrays[i]);   //将String型转化成int型
            System.out.print(a[i] + " ");
        }
    }
}
