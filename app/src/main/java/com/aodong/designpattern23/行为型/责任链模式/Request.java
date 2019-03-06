package com.aodong.designpattern23.行为型.责任链模式;

/**
 * Created by pcl on 2018/12/14
 */
public class Request {

    //申请类型
    String requestType;

    //申请内容
    String requetsContent;

    //数量
    int number;

    public Request(String requestType, String requetsContent, int number) {
        this.requestType = requestType;
        this.requetsContent = requetsContent;
        this.number = number;
    }

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public String getRequetsContent() {
        return requetsContent;
    }

    public void setRequetsContent(String requetsContent) {
        this.requetsContent = requetsContent;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
