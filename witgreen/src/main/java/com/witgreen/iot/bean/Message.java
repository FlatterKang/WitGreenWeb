package com.witgreen.iot.bean;


import java.util.Date;

public class Message {

    private Integer id;
    private Date upload_time;
    private String data;
    private Integer user_id;
    private Integer equiment_id;

    public Message(Integer id, Date upload_time, String data, Integer user_id, Integer equiment_id) {
        this.id = id;
        this.upload_time = upload_time;
        this.data = data;
        this.user_id = user_id;
        this.equiment_id = equiment_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getUpload_time() {
        return upload_time;
    }

    public void setUpload_time(Date upload_time) {
        this.upload_time = upload_time;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getEquiment_id() {
        return equiment_id;
    }

    public void setEquiment_id(Integer equiment_id) {
        this.equiment_id = equiment_id;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", upload_time=" + upload_time +
                ", data='" + data + '\'' +
                ", user_id=" + user_id +
                ", equiment_id=" + equiment_id +
                '}';
    }
}
