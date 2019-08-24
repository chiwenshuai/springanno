package com.cap2.controller;

public class Test {

   public static void main(String args[]) {
       Param1 param1 = new Param1();
       param1.setName("shuaishuai");
       External comExternalGWInfo = new External();
       comExternalGWInfo.setB("external1");
       param1.setComExternalGWInfo(comExternalGWInfo);


       param2 param2 = new param2();
       param2.setName(param1.getName());
       External external = new External();
       if (param1.getComExternalGWInfo() != null) {
           if (param1.getComExternalGWInfo() != null) {
               param2.setExternal(param1.getComExternalGWInfo());
           }
       }


   }
}
