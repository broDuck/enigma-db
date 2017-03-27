package com.broduck.enigma.model;

/**
 * 로그인 정보를 담아보자
 * Created by ydh0624 on 2017-03-27.
 */
public class LoginInfo {
    private String email;
    private Integer memberSn;
    private Boolean maleYn;
    private Integer age;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getMemberSn() {
        return memberSn;
    }

    public void setMemberSn(Integer memberSn) {
        this.memberSn = memberSn;
    }

    public Boolean getMaleYn() {
        return maleYn;
    }

    public void setMaleYn(Boolean maleYn) {
        this.maleYn = maleYn;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
