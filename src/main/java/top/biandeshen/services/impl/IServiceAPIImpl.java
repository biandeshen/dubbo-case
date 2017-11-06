package top.biandeshen.services.impl;

import top.biandeshen.services.IServiceAPI;

public class IServiceAPIImpl implements IServiceAPI {
    public String showMessage(String message){
        return message+"\t"+"service1";
    }


}
