package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String word=new String();
        System.out.println("Enter Your name ! Only LATINICA !");
        String name=scanner.nextLine();
        System.out.println("Enter Your surname ! Only LATINICA !");
        String surname=scanner.nextLine();
        System.out.println("Enter your isikukood");
        String kood=scanner.nextLine();
        System.out.println("**********About You************");
        int pol=0;
        String strPol = kood.substring(0,1);
        pol=new Integer(strPol);
        if(pol==3 || pol==4){
            System.out.println("You are woman");
        }
        else if (pol==5 || pol==6){
            System.out.println("You are man");
        }
        System.out.println(name+" "+surname);
        String strYear=kood.substring(1,3);
        if (pol==5 || pol==6){
            System.out.println("20"+strYear+" year birth");
        }
        else if (pol==3 || pol==4){
            System.out.println("19"+strYear+" year birth");
        }
        int month=0;
        int day=0;
        String strDay=kood.substring(5,7);
        String strMonth=kood.substring(3,5);
        month=new Integer(strMonth);
        if (month ==1){
            System.out.println("Birthday:"+strDay+" Jan.");
        }
        else if (month ==2){
            System.out.println("Birthday:"+strDay+" Feb.");
        }
        if (month ==3){
            System.out.println("Birthday:"+strDay+" Mar.");
        }
        if (month ==4){
            System.out.println("Birthday:"+strDay+" Apr.");}
        if (month ==5){
            System.out.println("Birthday:"+strDay+" May");}
        if (month ==6){
            System.out.println("Birthday:"+strDay+" June");}
        if (month ==7){
            System.out.println("Birthday:"+strDay+" July");}
        if (month ==8){
            System.out.println("Birthday:"+strDay+" Aug.");}
        if (month ==9){
            System.out.println("Birthday:"+strDay+" Sept.");}
        if (month ==10){
            System.out.println("Birthday:"+strDay+" Oct.");}
        if (month ==11){
            System.out.println("Birthday:"+strDay+" Nov.");}
        if (month ==12){
            System.out.println("Birthday:"+strDay+" Dec.");}
    }
}
