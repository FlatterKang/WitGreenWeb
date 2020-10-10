package com.witgreen.iot.bean;

import java.util.Date;


public class Equiment {

    private Integer is;
    private String name;
    private String protocol;
    private Date add_time;
    private String user_id;

    public Equiment(Integer is, String name, String protocol, Date add_time, String user_id) {
        this.is = is;
        this.name = name;
        this.protocol = protocol;
        this.add_time = add_time;
        this.user_id = user_id;
    }

    public Integer getIs() {
        return is;
    }

    public void setIs(Integer is) {
        this.is = is;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public Date getAdd_time() {
        return add_time;
    }

    public void setAdd_time(Date add_time) {
        this.add_time = add_time;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    @Override
    public String toString() {
        return "Equiment{" +
                "is=" + is +
                ", name='" + name + '\'' +
                ", protocol='" + protocol + '\'' +
                ", add_time=" + add_time +
                ", user_id='" + user_id + '\'' +
                '}';
    }
}
