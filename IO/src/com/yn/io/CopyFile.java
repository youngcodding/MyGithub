package com.yn.io;

import java.io.*;

/**
 * @author yn
 * @class MyGithub
 * @describe
 * @date 2020/12/8-20:50
 */
public class CopyFile {


    public static void main(String[] args) {
        //指定原文件和目标文件
        String sreName = "D:"+File.separator+"yn"+File.separator+"demo"+File.separator+"java";
        String desName = "D:"+File.separator+"yn"+File.separator+"demo"+File.separator+"copy";
        copyDirectory(sreName,desName);
    }


    /**
     * 拷贝目录
     * @param sreName：原目录的抽象路径名
     * @param desName：目标目录的抽象路径名
     */
    public static void copyDirectory(String sreName,String desName){
        //根据给定的原路径和目标路径的字符串创建File对象
        File source = new File(sreName);
        File dest = new File(desName);
        if (!dest.exists()){
            dest.mkdirs();
        }
        //判断当前File是文件还是目录
        if (source.isFile()){//如果是文件
            //调用拷贝文件的方法
            copyFile(source,dest);
        }else {//开始拷贝目录
            //先获取目录下的子目录和文件
            String[] files = source.list();
            //获取原目录和目标目录的绝对路径
            String srcPath = source.getAbsolutePath();
            String destPath = dest.getAbsolutePath();
            //转换为File对象
            File sFile;
            File dFile;
            //遍历当前目录
            for (int i = 0; i < files.length; i++) {
                //创建File对象
                sFile = new File(srcPath,files[i]);
                dFile = new File(destPath,files[i]);
                //判断当前File是目录还是文件
                if (sFile.isFile()){
                    //调用拷贝文件方法
                    copyFile(sFile,dFile);
                }else {
                    //向目标路径创建目录
                    dFile.mkdir();
                    copyDirectory(sFile.getAbsolutePath(),dFile.getAbsolutePath());
                }
            }
        }
    }

    /**
     * 拷贝文件
     * @param source：源文件的File对象
     * @param dest：目标文件的FIle对象
     */
    public static void  copyFile(File source , File dest){
        //定义文件输入流和输出流对象
        FileInputStream fis = null;
        FileOutputStream fot = null;
        try {
            //创建流对象
            fis = new FileInputStream(source);
            fot = new FileOutputStream(dest);

            //定义缓冲数组
            byte[] buff = new byte[1024];
            //定义临时保存的字节
            int len = 0;
            //循环读取
            while ((len=fis.read(buff))!=-1){
                //将读取的数据写入输出流中
                fot.write(buff,0,len);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fis.close();
                fot.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
