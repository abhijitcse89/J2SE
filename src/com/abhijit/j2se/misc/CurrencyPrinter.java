package com.abhijit.j2se.misc;
import java.text.NumberFormat; 
import java.util.Locale; 

public class CurrencyPrinter { 

    public static void main(String[] args) { 
        double amount = 1234567.8901234; 
        NumberFormat nf = NumberFormat.getCurrencyInstance(); 
        System.out.println(nf.format(amount)); 
        System.out.println(); 

        nf = NumberFormat.getCurrencyInstance(Locale.ENGLISH); 
        System.out.println(nf.format(amount)); 
        System.out.println(); 

        System.out.println(nf.getClass().getName()); 
    } 

} 


/*
  # Issue found
  Locale.CANADA_FRENCH
  Locale.FRANCE
  Locale.FRENCH
  Locale.JAPAN
  Locale.KOREA
  
  # ("." and ","  need to be swapped)
  Locale.GERMAN 
  Locale.GERMANY
  Locale.ITALIAN
  Locale.ITALY
  
  
 */
