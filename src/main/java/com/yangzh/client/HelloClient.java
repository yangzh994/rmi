package com.yangzh.client;

import com.yangzh.model.User;
import com.yangzh.rpc.HelloRpc;

import java.rmi.Remote;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class HelloClient {

    public static void main(String[] args) {
        Registry registry;
        try{
            registry = LocateRegistry.getRegistry("localhost",8088);

            HelloRpc hello = (HelloRpc) registry.lookup("hello");

            User user = hello.queryByName("yang");

            System.out.println(user);

        }catch ( Exception e){
            e.printStackTrace();
        }
    }

}
