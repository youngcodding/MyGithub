package com.yn.socket.threadSocket;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author yn
 * @class MyGithub
 * @describe
 * @date 2020/12/4-18:49
 */
public class ServerThread implements Runnable {
    private Socket client;

    private ServerThread(){}

    public ServerThread(Socket client) {
        this.client = client;
    }

    @Override
    public void run() {
        try {
            //获取客户端的输出流
            PrintStream out = new PrintStream(client.getOutputStream());
            //获取客户端的输入流
            Scanner in = new Scanner(client.getInputStream());
            //定义一个变量
            boolean flag = true;
            while (flag) {
                if (in.hasNext()) {
                    String str = in.nextLine().trim();
                    if ("byebye".equals(str)) {
                        out.println("拜拜，再见！");
                        flag = false;
                    } else {
                        out.println("Echo:" + str);
                    }
                }
            }
            //关闭资源
            client.close();
            in.close();
            out.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
