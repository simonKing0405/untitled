package IoStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exercise_01 {
    public static void main(String[] args) throws IOException {
//        参数可以是字符串表示的路径，也可以是创建的文件对象。如果文件不存在，会自动创建一个新的文件，但一定要保证父级路径要存在。
        /*FileOutputStream fos = new FileOutputStream("D:\\Javaxiangmu\\untitled\\src\\IoStream\\test.txt");
        fos.write(97);            //写进a，如果文件中已经有内容，则会产生覆盖
        fos.write(100);
        fos.close();*/


        FileOutputStream fos1 = new FileOutputStream("E:\\deleted\\新建文件夹\\新建文件夹\\新建文本文档.txt", true);
        String s = "\n醉后不知天在水，满船清梦压星河。\n";
        byte[] byties = s.getBytes();
        fos1.write(byties);
        String s1 = "酒虽美，不能使悲者乐。不能使悲者乐，故是酒真.";
        fos1.write(s1.getBytes());
        String s3 = "\n绿杨芳草长亭路。年少抛人容易去。楼头残梦五更钟，花底离情三月雨无情不似多情苦。一寸还成千万缕。天涯地角有穷时，只有相思无尽处。";
        fos1.write(s3.getBytes());
        fos1.close();
    }

}
