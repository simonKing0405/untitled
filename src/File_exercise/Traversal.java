/* public File[]listFiles（）    说明：获取当前该路径下所有内容
 * 当调用者File表示的路径不存在时，返回null
 * 当调用者File表示的路径是文件时，返回null
 * 当调用者File表示的路径是一个空文件时，返回一个数组长度为0的数组
 * 当调用者Field表示的路径是一个有内容的文件时，将里面所有的文件和文件夹的路径放在File数组中返回
 * 当调用者Field表示的路径是一个有隐藏文件的文件夹时，将里面所有的文件和文件夹的路径放在File数组中返回，包含隐藏文件
 * 当调用者Field表示的路径是需要权限才能访问的文件时，返回null
 * */

package File_exercise;

import java.io.File;

public class Traversal {
    public static void main(String[] args) {
        File f = new File("E:\\EXERCISE\\a");
        File[] files = f.listFiles();
        for (File file : files) {
            System.out.println(file);
        }
    }
}
