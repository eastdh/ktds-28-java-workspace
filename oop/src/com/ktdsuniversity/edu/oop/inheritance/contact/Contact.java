package com.ktdsuniversity.edu.oop.inheritance.contact;

public class Contact {

  private String name;
  private String phone;

  // public Contact() {
  // System.out.println("Contact 인스턴스 생성");
  // }

  /**
   * @param name
   * @param phone
   */
  public Contact(String name, String phone) {
    this.name = name;
    this.phone = phone;
  }



  public String getName() {
    return name;
  }

  public String getPhone() {
    return phone;
  }

  public void printContact() {
    System.out.println("name: " + this.name);
    System.out.println("phone: " + this.phone);
  }


}
