package com.company.socket_tcp;

import java.io.IOException;
import java.net.*;

public class UDPSend {
    public static void main(String[] args) throws IOException {
        DatagramSocket sendSocket = new DatagramSocket();
        byte[] bytes = "hello!UDP~".getBytes();
        DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("10.101.2.133"), 6666);
        sendSocket.send(datagramPacket);
        sendSocket.close();

    }
}
