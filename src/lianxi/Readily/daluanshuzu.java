package lianxi.Readily;

import java.util.Random;

public class daluanshuzu {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int x = r.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[x];
            arr[x] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
