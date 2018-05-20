package com.iFox.hh.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "user")
public class User{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nickName",nullable = false,length = 20)
    private String nickName;

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Column(name = "account",nullable = false,length = 50)
    private String account;

    @Column(name = "password",nullable = false,length = 255)
    private String password;

    @Column(name = "sex",nullable = false,length = 4)
    private int sex;

    @Column(name = "email",nullable = false,length = 255)
    private String email;

    @Column(name = "age",nullable = false,length = 20)
    private int age;
    @Column(name = "avatar",nullable = true,length = 255)
    private String avatar;

    @ManyToMany(cascade = {CascadeType.REFRESH},fetch = FetchType.EAGER)
    @JoinTable(name = "users_friends", joinColumns = {
            @JoinColumn(name = "current_id", referencedColumnName = "id")}, inverseJoinColumns = {
            @JoinColumn(name = "friend_id", referencedColumnName = "id")})
    private List<User> friends;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public User() {
    }

    public User(String nickName, String account, int sex, String email, int age, String avatar, List<User> friends) {
        this.nickName = nickName;
        this.account = account;
        this.sex = sex;
        this.email = email;
        this.age = age;
        this.avatar = avatar;
        this.friends = friends;
    }

    public void setAccount(String account) {

        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public List<User> getFriends() {
        return friends;
    }

    public void setFriends(List<User> friends) {
        this.friends = friends;
    }
}
