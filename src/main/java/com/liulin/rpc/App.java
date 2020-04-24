package com.liulin.rpc;

import com.liulin.rpcserver.IHelloService;

/**
 * Create by DbL on 2020/4/23 0023
 */
public class App {
    public static void main(String[] args) {
        System.setProperty("java.net.preferIPv4Stack", "true");
        RpcProxyClient client = new RpcProxyClient();
        IHelloService iHelloService = client.clientProxy(IHelloService.class,"localhost",8888);
        String content = iHelloService.sayHello("DBL");
        System.out.println(content);
    }
}
