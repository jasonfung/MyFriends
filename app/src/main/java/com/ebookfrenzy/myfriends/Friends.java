package com.ebookfrenzy.myfriends;

/**
 * Created by student on 4/7/15.
 */

public class Friends {

    private String id;
    private String name;
    private String email;
    private String phone;

    public Friends(){}

    public Friends(String id, String email, String phone, String Name) {
        this.id = id;
        this.email = email;
        this.phone = phone;
        this.name = Name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Friend{" +
                "id='" + id + '\'' +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

}
