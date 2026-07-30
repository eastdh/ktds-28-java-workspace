package com.ktdsuniversity.edu.oop.generics;

import com.ktdsuniversity.edu.oop.exceptions.Goods;

public class PrintTest {

  public static void main(String[] args) {
    Print<Integer> intPrint = new Print<>(0);
    Print<Double> doublePrint = new Print<>(0d);
    Print<Long> longPrint = new Print<>(0L);
    Print<Boolean> booleanPrint = new Print<>(false);

    int a = intPrint.getPrintData();
    double b = doublePrint.getPrintData();
    long c = longPrint.getPrintData();
    boolean d = booleanPrint.getPrintData();

    Print<Goods> goodsPrint = new Print<>(new Goods("A", 100));
    Goods goods = goodsPrint.getPrintData();
    goodsPrint.print();
    System.out.println(goods);

  }
}
