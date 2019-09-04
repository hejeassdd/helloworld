package com.company.socket_tcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println("0-等待客户端的链接！");
        Socket socket = serverSocket.accept();
        String hostAddress = socket.getInetAddress().getHostAddress();
        String hostName = socket.getInetAddress().getHostName();
        InputStream inputStream = socket.getInputStream();
        byte[] buffer = new byte[1024];
        int length = inputStream.read(buffer);
        System.out.println(String.format("IP地址：%s,主机名：%s,内容：%s",hostAddress,hostName,new String(buffer,0,length)));

        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("2-在的，恭喜你已经连接上服务器！".getBytes());

        int length2 = inputStream.read(buffer);
        System.out.println(String.format("IP地址：%s,主机名：%s,内容：%s",hostAddress,hostName,new String(buffer,0,length2)));

        BufferedOutputStream fileOut = new BufferedOutputStream(new FileOutputStream("D:\\10.101.2.133.jpg"));
        int len = -1;
        while ((len = inputStream.read(buffer))!=-1){
//            写入目的地的字节输出流
            fileOut.write(buffer,0,len);
        }

        outputStream.write("4-在的，图片上传成功！".getBytes());

        fileOut.close();
        outputStream.close();
        inputStream.close();
        socket.close();

    }
}
