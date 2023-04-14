package File_exercise;
/*
 * 定义一个方法，在指定文件中找到以“avi“结尾的文件
 * */

import java.io.File;

public class Find {
    public static void main(String[] args) {


        //不考虑子文件夹
        File file = new File("E:\\EXERCISE\\a");//指定路径
        if (isCotaiin(file)) {
            System.out.println(file);
        }
    }

    public static boolean isCotaiin(File file) {
        File[] files = file.listFiles();//创建文件数组
        for (File f : files) {//遍历
            if (f.isFile() && f.getName().endsWith("avi")) {//判断
                return true;
            }
        }
        return false;
    }
}
