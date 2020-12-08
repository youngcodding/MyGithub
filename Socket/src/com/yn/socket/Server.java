package com.yn.socket;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author yn
 * @class MyGithub
 * @describe
 * @date 2020/12/4-17:58
 */
public class Server {
    public static void main(String[] args) throws IOException {
        //创建一个服务端对象
        ServerSocket server = new ServerSocket(8888);
        //给出提示信息
        System.out.println("***等待连接***");
        /*
        * 监听来自客户端的连接，如果有客户端来连接当前服务器
        * 则可以取得表示客户端的连接对象（在接收到连接之前该方法是阻塞的）
        * */
        Socket client = server.accept();

        //获取客户端的输出流
        PrintStream out = new PrintStream(client.getOutputStream());
        //获取客户端的输入流
        Scanner in = new Scanner(client.getInputStream());
        //定义一个变量
        boolean flag = true;
        while (flag){
            if (in.hasNext()){
                String str = in.nextLine().trim();
                if ("byebye".equals(str)){
                    out.println("拜拜，再见！");
                    flag = false;
                }else {
                    out.println("Echo:"+str);
                }
            }
        }
        //关闭资源
        client.close();
        in.close();
        out.close();
        server.close();
    }
}
