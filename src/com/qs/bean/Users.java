package com.qs.bean;


public class Users {

  private Integer id;
  private String username;
  private String password;
  private String sex;
  private String tel;
  private String email;
  private String love;

  @Override
  public String toString() {
    return "Users{" +
            "id=" + id +
            ", username='" + username + '\'' +
            ", password='" + password + '\'' +
            ", sex='" + sex + '\'' +
            ", tel='" + tel + '\'' +
            ", email='" + email + '\'' +
            ", love='" + love + '\'' +
            '}';
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }


  public String getTel() {
    return tel;
  }

  public void setTel(String tel) {
    this.tel = tel;
  }


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public String getLove() {
    return love;
  }

  public void setLove(String love) {
    this.love = love;
  }

}
