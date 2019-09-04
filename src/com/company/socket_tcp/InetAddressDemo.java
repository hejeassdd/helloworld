package com.company.socket_tcp;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println("本机的IP地址为："+localHost.getHostAddress());
        System.out.println("本机的主机名为："+localHost.getHostName());
    }
}
