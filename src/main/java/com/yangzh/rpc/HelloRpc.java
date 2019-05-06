package com.yangzh.rpc;

import com.yangzh.model.User;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface HelloRpc extends Remote{


    public User queryByName(String name) throws RemoteException;
}
