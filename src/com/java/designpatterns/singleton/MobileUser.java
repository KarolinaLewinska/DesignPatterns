package com.java.designpatterns.singleton;

public class MobileUser {
    private static MobileUser mobileUser;
    private String login;
    private String name;
    private String surname;
    private Integer age;
    private String token;

    protected MobileUser() {

    }

    public String getLogin() {
        return login;
    }

    private void setLogin(String login) {
        this.login = login;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    private void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAge() {
        return age;
    }

    private void setAge(Integer age) {
        this.age = age;
    }

    public String getToken() {
        return token;
    }

    private void setToken(String token) {
        this.token = token;
    }

    public static synchronized MobileUser returnMobileUser() {
        if (mobileUser == null) {
            mobileUser = new MobileUser();
        }
        return mobileUser;
    }

    public void logIn(String login, String name, String surname, Integer age, String token) {
        this.login = login;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.token = token;
    }
}