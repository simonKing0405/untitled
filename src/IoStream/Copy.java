package IoStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("E:\\deleted\\新建文件夹\\新建文件夹\\新建文本文档.txt");
        FileOutputStream fos = new FileOutputStream("E:\\deleted\\新建文件夹\\新建文件夹\\copy.txt");
        int b;
        while ((b = fis.read()) != -1) {
            fos.write(b);
        }
        fos.close();
        fis.close();
        long end = System.currentTimeMillis();
        long dif = end - start;
        System.out.println(dif);

        long start1 = System.currentTimeMillis();
        FileInputStream fis1 = new FileInputStream("E:\\deleted\\新建文件夹\\新建文件夹\\新建文本文档.txt");
        FileOutputStream fos1 = new FileOutputStream("E:\\deleted\\新建文件夹\\新建文件夹\\copy1.txt");
        int len;
        byte[] bytes = new byte[32];
        while ((len = fis1.read(bytes)) != -1) {
            fos1.write(bytes, 0, len);
        }
        fos1.close();
        fis1.close();
        long end1 = System.currentTimeMillis();
        long dif1 = end1 - start1;
        System.out.println(dif1);
        System.out.println(Math.max(dif, dif1));
    }
}
