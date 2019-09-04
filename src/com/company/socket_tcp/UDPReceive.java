package com.company.socket_tcp;

import java.io.IOException;
import java.net.*;

public class UDPReceive {
    public static void main(String[] args) throws IOException {
        DatagramSocket receiveSocket = new DatagramSocket(6666);
        byte[] buffer = new byte[1024];
        DatagramPacket datagramPacket = new DatagramPacket(buffer, 1024);
        receiveSocket.receive(datagramPacket);
        InetAddress address = datagramPacket.getAddress();
        String hostAddress = address.getHostAddress();
        String hostName = address.getHostName();
        byte[] data = datagramPacket.getData();
        int length = datagramPacket.getLength();
        String s = new String(data, 0, length);
        System.out.println(String.format("IP地址：%s,主机名：%s，数据：%s",hostAddress,hostName,s));


        receiveSocket.close();
    }
}
