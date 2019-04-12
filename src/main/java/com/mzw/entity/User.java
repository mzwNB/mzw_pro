package com.mzw.entity;

public class User {
    private Integer userId;
    private String  userName;
    private String userPassword;
    private String userCardNo;
    private String userTel;
    private String userAddress;
    private String userPostNumber;
    private Integer userIsAdmin;
    private String  userQuestion;
    private String userAnswer;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserCardNo() {
        return userCardNo;
    }

    public void setUserCardNo(String userCardNo) {
        this.userCardNo = userCardNo;
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserPostNumber() {
        return userPostNumber;
    }

    public void setUserPostNumber(String userPostNumber) {
        this.userPostNumber = userPostNumber;
    }

    public Integer getUserIsAdmin() {
        return userIsAdmin;
    }

    public void setUserIsAdmin(Integer userIsAdmin) {
        this.userIsAdmin = userIsAdmin;
    }

    public String getUserQuestion() {
        return userQuestion;
    }

    public void setUserQuestion(String userQuestion) {
        this.userQuestion = userQuestion;
    }

    public String getUserAnswer() {
        return userAnswer;
    }

    public void setUserAnswer(String userAnswer) {
        this.userAnswer = userAnswer;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userCardNo='" + userCardNo + '\'' +
                ", userTel='" + userTel + '\'' +
                ", userAddress='" + userAddress + '\'' +
                ", userPostNumber='" + userPostNumber + '\'' +
                ", userIsAdmin=" + userIsAdmin +
                ", userQuestion='" + userQuestion + '\'' +
                ", userAnswer='" + userAnswer + '\'' +
                '}';
    }
}
