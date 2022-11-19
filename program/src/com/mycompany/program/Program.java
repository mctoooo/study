/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.program;

/**
 *
 * @author Дракоша Тоша
 */

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
      
        int a=0;
        int b=0;
        int c=0;
        int a1=0;
        int b1=0;
        int c1=0;
        
        
        try (Scanner in = new Scanner(System.in)) {
                      
            System.out.println("Введите три целых  числа:  ");
            a = in.nextInt();
            b = in.nextInt();
            c = in.nextInt();
            System.out.println("Your number:" +a+";"+b+";"+c+";" );
        }
        a1=a;
        b1=b;
        c1=c;
         if((a==b)&&(b==c)){
          System.out.println("Введены одинаковые числа");
        }
        else{
            if ((a==b)^(a==c)^(b==c)){
            System.out.println("двa из введенных чисел одинаковы");
              if (a==b){
                  int x= b<c? (b+2):(b-2); 
                  int y= b<c? (c-2):(c+2);
                  b=x;
                  c=y;
                  a=x;         
            }
            else{
              if(a==c){
                   int x= a<b? (a+2):(a-2);
                   int y= a<b? (b-2):(b+2);
                   a=x;
                   b=y;
                   c=x;
             }
              if(b==c){
                   int x= a<b? (a+2):(a-2);
                   int y= a<b? (b-2):(b+2);
                   a=x;
                   b=y;
                   c=y;
            }
   
        
                       
         
            System.out.println("Итоговые числа:"+a+";"+b+";"+c);
              } }
        else{
              
            
             if(b>c){
              b1--;
              c1++;
              }
             
             else{
                 b1++;
                 c1--;
             }
             if(a>c){
               a1--;
               c1++;
            }
             else{
                 a1++;
                 c1--;
             }
             if(a>b){
               a1--;
               b1++;
            }       
             else{
                 a1++;
                 b1--;
             }
           
              
   System.out.println("Итоговые числа :"+a1+";"+b1+";"+c1);
        }
    }
}}

             
 

  
