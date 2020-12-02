package com.yn.io;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @author yn
 * @class MyGithub
 * @describe
 * @date 2020/12/1-8:53
 */
public class FIndFile {
    /*
    * 递归查找指定目录下的所有文件和文件夹
    * 包括子目录的文件
    * */
    public static void main(String[] args) {
        String pathname = "D:"+File.separator+"yl.xiong";
        List<File> findfiles = findfiles(new File(pathname));
        for (File findfile : findfiles) {
            System.out.println(findfile);
        }
    }


    public static List<File> findfiles(File findFile){
        //先判断这个文件夹是否存在
        if (!findFile.exists()){
            return null;
        }
        List<File> result = new ArrayList<>();
       for (File childFile :  findFile.listFiles()){
           if (childFile.isDirectory()){
               //是目录
               result.add(childFile);
               //递归查询
               List<File> findfiles = findfiles(childFile);
               result.addAll(findfiles);
           }else if (childFile.isFile()){
               //是文件
               result.add(childFile);
           }else {
               return null;
           }

       }
        return result;
    }
}
