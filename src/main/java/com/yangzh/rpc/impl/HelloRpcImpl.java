package com.yangzh.rpc.impl;

import com.yangzh.model.User;
import com.yangzh.rpc.HelloRpc;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloRpcImpl extends UnicastRemoteObject implements HelloRpc {

    public HelloRpcImpl()throws RemoteException {
        super();
    }

    public User queryByName(String name) throws RemoteException {
        System.out.println("根据名称查询!!!");
        User user = new User();
        user.setName(name);
        return user;
    }
}
