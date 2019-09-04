package com.company.socket_tcp;

import java.io.*;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("10.101.2.133", 8888);
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("1-Hi，服务器，在吗？".getBytes());

        InputStream inputStream = socket.getInputStream();
        byte[] buffer = new byte[1024];
        int length = inputStream.read(buffer);
        System.out.println("收到的数据："+new String(buffer,0,length));

        outputStream.write("3-好的，马上开始上传文件".getBytes());

        BufferedInputStream fileIn = new BufferedInputStream(new FileInputStream("D:\\86100.jpg"));
        int len =-1;
        while ((len = fileIn.read(buffer))!=-1){
            outputStream.write(buffer,0,len);
        }

        socket.shutdownOutput();
        int length2 = inputStream.read(buffer);
        System.out.println("客户端上传文件反馈："+new String(buffer,0,length2));

        outputStream.close();
        inputStream.close();
        fileIn.close();
        socket.close();
    }
}
