package com.hod.structural.proxy;

public class Client {
    public static void main(String[] args) throws Exception {
        Internet internet = new ProxyInternet("abcd.com");
        internet.connect();

        internet = new ProxyInternet("abc.com");
        internet.connect();
    }
}
