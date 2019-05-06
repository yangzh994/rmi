package com.yangzh.server;

import com.yangzh.rpc.impl.HelloRpcImpl;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RpcServer {

    public static void main(String[] args) {
        Registry registry;
        try{
            registry = LocateRegistry.createRegistry(8088);

            HelloRpcImpl helloRpc = new HelloRpcImpl();

            registry.rebind("hello",helloRpc);

            System.out.println("bind server");

        }catch (Exception e){

            e.printStackTrace();
        }
    }
}
