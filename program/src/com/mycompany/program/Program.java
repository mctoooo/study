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

try (Scanner in = new Scanner(System.in)) {

System.out.println("Введите целое положительное число: ");
a = in.nextInt();

String p = prime(a);
System.out.println("Ваше число "+p );
}
}
public static String prime(int Num){// функция проверки простого числа
if (Num < 0){
String pr =" меньше ноля.";
return pr;
}
int x=Num;
int k=0;
String pr;
for (int i=1;(i<=x)&&(x>=1) ;i++){
if(x%i==0){
k++;
}
}
if(k==2){
pr = " простое.";
}
else{
pr = " не простое.";
}
return pr;
}
}