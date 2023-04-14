package File_exercise;

import java.io.File;
import java.io.IOException;

public class Exercise_01 {
    public static void main(String[] args) throws IOException {

        File f1 = new File("D:\\EXERCISE\\a.txt");    //File表示路径，可以是文件文件夹，可以是存在的也可以是不存在的。创建一个新的空文件
        f1.createNewFile();
        //createnewfile的返回值为Boolean类型，若此前不存在则返回true；System.out.println(f1.isDirectory());//判断是否为文件夹
        System.out.println(f1.isFile());//判断是否为文件
        System.out.println(f1.exists());//判断文件是否为空
        System.out.println(f1);
        System.out.println(f1.length());//返回文件大小
        System.out.println(f1.getName());//若路径对应的是文件则会返回带有后缀的文件名称，若路径指向文件，则会返回文件夹名称
        System.out.println(f1.getPath());
        System.out.println(f1.getAbsolutePath());
        System.out.println(f1.lastModified());//返回文件最后的修改时间（毫秒）


        //创建文件夹，若用mkdir，则只能创建单极目录，所以一般用mkdirs
        File f2 = new File("D:\\EXERCISE\\a\\a.a\\a.a.1");
        f2.mkdirs();
        System.out.println(f2);


        //清除
        //f1.delete();//若删除一个文件，则删除不会到回收站；若删除一个空文件夹，则删除。
    }
}

