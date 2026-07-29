package com.ktdsuniversity.edu.oop.exceptions;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectExam {

  public static void main(String[] args) {

    // Reflection: 다이나믹 로딩
    // --> 클래스, 멤버 변수, 생성자, 메소드
    // --> 동적 로딩? => 클래스의 도움없이 인스턴스를 생성하거나 호출하는 방법

    // GoodsHolder holder = new GoodsHolder(4);
    try {
      Class holderClass = Class.forName("com.ktdsuniversity.edu.oop.exceptions.GoodsHolder");
      Constructor cons = holderClass.getDeclaredConstructor(int.class);
      Object holder = cons.newInstance(4);
      System.out.println(holder);
    } catch (ClassNotFoundException cnfe) {
      cnfe.printStackTrace();
    } catch (NoSuchMethodException nsme) {
      nsme.printStackTrace();
    } catch (InvocationTargetException ite) {
      ite.printStackTrace();
    } catch (IllegalAccessException iae) {
      iae.printStackTrace();
    } catch (InstantiationException ie) {
      ie.printStackTrace();
    }
  }

}
