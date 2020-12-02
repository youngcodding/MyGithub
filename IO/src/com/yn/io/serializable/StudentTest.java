package com.yn.io.serializable;

import java.io.*;

/**
 * @author yn
 * @class MyGithub
 * @describe
 * @date 2020/12/1-20:00
 */
public class StudentTest {
    public static void main(String[] args)throws Exception {
        String pathname = "D:"+File.separator+"yn"+File.separator+"demo"+File.separator+"student.txt";
        File file = new File(pathname);
        Student student = new Student("1100", "张三", '男', 20, "湖北武汉");
        //序列化对象
        ser(file,student);
        dser(file);
    }

    /**
     * 实现对象的序列化
     * @param file
     * @param o
     */
    public static void ser(File file,Object o) throws IOException {
        if (!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }
        if (!file.exists()){
            file.createNewFile();
        }
        //创建字节输出流
        OutputStream outputStream = new FileOutputStream(file);
        //创建序列化对象
        ObjectOutputStream out = new ObjectOutputStream(outputStream);
        //序列化对象
        out.writeObject(o);
        //关闭流
        outputStream.close();
        out.close();
    }

    /**
     * 反序列化对象
     * @param file
     */
    public static void dser(File file) throws IOException, ClassNotFoundException {
        //创建字节输入流
        InputStream inputStream = new FileInputStream(file);
        //创建反序列化对象
        ObjectInputStream in = new ObjectInputStream(inputStream);
        //反序列化
        Object o = in.readObject();
        System.out.println(o);
    }
}
