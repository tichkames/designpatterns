package com.hod.structural.proxy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public interface Internet {
    void connect() throws Exception;
}

//Subject
class RealInternet implements Internet{
    private String hostName;

    public RealInternet(String hostName){
        this.hostName = hostName;
    }

    @Override
    public void connect(){
        System.out.println(String.format("Connected to site %s", hostName));
    }
}

//Proxy
class ProxyInternet implements Internet{
    private String hostName;
    private RealInternet realInternet;
    private List<String> restrictedSites = new ArrayList<>(Arrays.asList("abc.com"));

    public ProxyInternet(String hostName){
        this.hostName = hostName;
    }

    @Override
    public void connect() throws Exception {
        if(restrictedSites.contains(hostName)){
            System.out.println("Access Denied");
            throw new Exception(String.format("Restricted site %s ", hostName));
        }

        realInternet = new RealInternet(hostName);
        realInternet.connect();
    }
}