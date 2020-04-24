package com.liulin.rpc;


import java.lang.reflect.Proxy;

/**
 * Create by DbL on 2020/4/23 0023
 */
public class RpcProxyClient {
    public <T> T clientProxy(final Class<T> interfaceCls ,final String host,final int port){
        return (T) Proxy.newProxyInstance(interfaceCls.getClassLoader(),new Class<?>[]{interfaceCls},new RemoteInvocationHandler(host,port) );
    }
}
