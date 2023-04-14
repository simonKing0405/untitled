package IoStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exercise_02 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("E:\\deleted\\新建文件夹\\新建文件夹\\a.txt");
        int b;//定义第三方变量接收读取到的内容，防止一次循环里调用两次read方法
        while ((b = fis.read()) != -1) {
            System.out.print((char) b);
        }
        fis.close();
    }
}
