package File_exercise;
/*
找出指定路径下的所有以特定字符结尾的文件，包括子文件
*/

import java.io.File;

public class Findall {
    public static void main(String[] args) {
        File file = new File("E:\\deleted\\新建文件夹\\新建文件夹\\a.txt");
        find(file);
    }

    public static void find(File file) {
        //进入数组
        File[] files = file.listFiles();
        if (files != null) { //判断文件权限,因为file表示文件或文件夹，不可能为空，但files可能为空。
            for (File f : files) { //遍历文件数组
                if (f.isFile()) { //是文件，直接进行判断

                    System.out.println(f);

                } else { //是文件夹，采用递归继续判断
                    find(f); //再次调用本方法的时候，参数一定是file的次一级路径
                }
            }
        }
    }
}