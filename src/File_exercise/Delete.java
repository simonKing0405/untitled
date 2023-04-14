package File_exercise;
/*
删除整个文件夹
**/

import java.io.File;

public class Delete {
    public static void main(String[] args) {
        File file = new File("E:\\deleted");
        find(file);
//        delete(file);

    }


    /*
    功能：删除整个文件夹
    参数：文件对象
    返回值：无
    * */
    public static void delete(File file) {
        File[] files = file.listFiles();//进入文件
        //        先删除文件里的所有内容
        if (files != null) {//无权限的文件数组为空值
            for (File f : files) {//遍历
                if (f.isFile()) {//判断是否为文件
                    f.delete();
                } else {//是文件夹，迭代删除
                    delete(f);
                }
            }
        }
//        再删除文件本身
        file.delete();
    }


    /*功能：遍历打印文件目录下的所有文件
     * 参数：文件对象
     * 返回值：无
     * */
    public static void find(File file) {
        File[] files = file.listFiles();
        if (files != null) {
            for (File f : files) {
                if (f.isFile()) {
                    System.out.println(f.getName());
                } else {
                    find(f);
                }
            }
        }
    }
}
