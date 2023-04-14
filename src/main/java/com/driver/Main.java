package com.driver;

public class Main {
  public static void main(String args[]){
      RWOnly rwOnly = new RWOnly();

      rwOnly.setName("Saikrsna");
      String value = rwOnly.getName();

      System.out.println(value);
  }
}