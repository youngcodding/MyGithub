package com.yn.socket.threadSocket;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author yn
 * @class MyGithub
 * @describe
 * @date 2020/12/4-18:15
 */
public class ClientB {
    public static void main(String[] args) throws IOException {
        //创建一个表示客户端连接对象
        Socket client = new Socket("localhost",8888);
        //取得输入流对象（目的是获取服务端返回数据）
        Scanner in  = new Scanner(client.getInputStream());
        //取得输出流对象（目的是向服务端输出数据）
        PrintStream out = new PrintStream(client.getOutputStream());
        //取得一个输入流对象（接收键盘输入的内容）
        Scanner bordIn = new Scanner(System.in);
        boolean flag = true;
        while(flag){
            System.out.println("请输入发送到服务端的数据：");
            String string = bordIn.nextLine().trim();
            out.println(string);
            if ("byebye".equals(string)){
                flag = false;
            }
            if (in.hasNext()){
                System.out.println(in.nextLine());
            }
        }
        //关闭相关资源
        in.close();
        out.close();
        bordIn.close();
        client.close();
    }
}
