package lianxi.Readily;

//拷贝从指定下标form到to的数组元素
public class Shuzufuzhi {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] copy = copyarray(arr, 3, 7);
        for (int i = 0; i < copy.length; i++) {
            int j = copy[i];
            System.out.print(j + " ");
        }
    }

    public static int[] copyarray(int[] arr, int from, int to) {
        int newarr[] = new int[to - from];
        int index = 0;
        for (int i = from; i < to; i++) {
            newarr[index] = arr[i];
            index++;
        }
        return newarr;
    }
}
