/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tekciftmetod;
import java.util.*;

public class TekCiftMetod {

    public static void main(String[] args) {
        System.out.println("Hosgeldiniz ");
       
    Scanner kla= new Scanner(System.in);
     System.out.println("Lütfen bir sayı giriniz : ");
     int sayi=kla.nextInt();
     boolean kontrol=sayıtekcift(sayi);
     if (kontrol==true){
       System.out.println("Sayı Çift Bir Sayıdır .");
     }else {
      System.out.println("Sayı Tek Bir Sayıdır .");
    }
    }
    public static boolean sayıtekcift(int sayi){
        if(sayi%2==0){
            return true;
        }else{
            return false;
        }
    
}
}
