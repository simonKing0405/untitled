package IoStream;

import java.io.*;

public class Copy2 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("E:\\deleted\\新建文件夹\\新建文件夹");
        File f2 = new File("E:\\deleted1");
        copy(f1, f2);
//        show(f1);
        
    }

    public static void copy(File f1, File f2) throws IOException {
//
        File[] files = f1.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    FileInputStream fis = new FileInputStream(file);
                    FileOutputStream fos = new FileOutputStream(new File(f2, f1.getName()));
                    byte[] bytes = new byte[1024 * 1024 * 5];
                    int len;
                    while ((len = fis.read(bytes)) != -1) {
                        fos.write(bytes, 0, len);
                    }
                    fos.close();
                    fis.close();
                } else {
                    copy(f1, new File(f2, f1.getName()));
                }
            }
        }
    }

    public static void show(File file) {
        //进入数组
        File[] files = file.listFiles();
        if (files != null) { //判断文件权限,因为file表示文件或文件夹，不可能为空，但files可能为空。
            for (File f : files) { //遍历文件数组
                if (f.isFile()) { //是文件，直接进行判断
                    if (f.getName().endsWith(".txt")) { //是否以“.pdf”结尾
                        System.out.println(f);
                    }
                } else { //是文件夹，采用递归继续判断
                    show(f); //再次调用本方法的时候，参数一定是file的次一级路径
                }
            }
        }
    }
}
