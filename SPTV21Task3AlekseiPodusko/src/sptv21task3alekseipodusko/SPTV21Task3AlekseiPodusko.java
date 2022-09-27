/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptv21task3alekseipodusko;

import java.util.Scanner;

public class SPTV21Task3AlekseiPodusko {

    public static void main(String[] args) {
      Scanner scanner= new Scanner(System.in);
      String word=new String();
      System.out.println("Введите свое имя ! НА ЛАТИНИЦЕ !");
      String name=scanner.nextLine();
      System.out.println("Введите свою фамилию ! НА ЛАТИНИЦЕ !");
      String surname=scanner.nextLine();
      System.out.println("Введите свой isikukood");
      String kood=scanner.nextLine();
      int pol=0;
      String strPol = kood.substring(0,1);
      pol=new Integer(strPol);
      if(pol==3 || pol==4){
        System.out.println("Вы женщина");
      }
      else if (pol==5 || pol==6){
        System.out.println("Вы мужчина");
    }
      String strYear=kood.substring(1,3);
      if (pol==5 || pol==6){
          System.out.println("20"+strYear+" года рождения");
      }
      else if (pol==3 || pol==4){
          System.out.println("19"+strYear+" года рождения");
      }
      int month=0;
      String strMonth=kood.substring(3,5);
      month=new Integer(strMonth);
      if (month ==1){
          System.out.println("Января");
      }
      else if (month ==2){
          System.out.println("Января");
    }
      if (month ==3){
          System.out.println("Января");
      }
      if (month ==4){
          System.out.println("Января");}
      if (month ==5){
          System.out.println("Января");}
      if (month ==6){
          System.out.println("Января");}
      if (month ==7){
          System.out.println("Января");}
      if (month ==8){
          System.out.println("Января");}
      if (month ==9){
          System.out.println("Января");}
      if (month ==10){
          System.out.println("Января");}
      if (month ==11){
          System.out.println("Января");}
      if (month ==12){
          System.out.println("Января");}
      
}
}