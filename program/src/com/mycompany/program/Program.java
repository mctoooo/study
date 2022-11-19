/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
*/
package com.mycompany.program;
import java.util.Scanner;
/**
*
* @author Дракоша Тоша
*/

public class Program {
public static void main(String[] args) {
int []arr =null;
int type=0;
int repM=0;
arr = CreateArray(20, 1,30);
PrintArrayToConsole(arr);
type=Type(arr);
switch(type){
    case 1:
        System.out.println("\n Массив упорядочен по возрастанию.");
        break;
    case 2:
        System.out.println("\n Массив упорядочен по убыванию.");
        break;
    case 3:
        System.out.println(" \n цифры одинаковы.");
        break;
    case 4:
        System.out.println("\n Массив не упорядочен.");
        break;
}    
}

/*Функция создания и заполнения одномерного массива случайными значениями с заданными диапазоном
int size - количество элементов массива
int rangeA - верхняя граница диапазона
int rangeB - нижняя граница диапазона
*/
public static int[] CreateArray(int size, int rangeA,int rangeB){
int[] arr = null;//Объявляем массив
arr = new int [size];// Создаем массив размерности size
for(int ix=0;ix<size;ix++){

arr[ix] = rangeA + (int) (Math.random() * rangeB);// Записываем значение, полученное в результате вычисления выражения, в ячейку
}

return arr;// Возвращаем массив(ссылку)
}

//функция распечатки массива
public static void PrintArrayToConsole(int []Mx){
if(Mx != null){
for(int ix = 0;ix < Mx.length; ix++){ 
System.out.print(Mx[ix]+" ");
}
}
else{
System.out.print("Array is empty");
}
}


//Функция проверки типа массива.возврашает одно цифровое значение
// 1:(" Массив упорядочен по возрастанию.");
// 2:(" Массив упорядочен по убыванию.");
// 3:(" цифры одинаковы.");
// 4:(" Массив не упорядочен.");

public static int Type(int []arr){
int type=0;
int j=0;  // переменная цикла
int size=0; // переменная для определения длинны массива
boolean s=true,s1=false,t=false,t1=false;
size=arr.length;
for(j=size-1;j>1;j--){
if(s==arr[j]>arr[j-1]){     //упорядочен по возрастанию 
   s1=!false;
}
else if(s==arr[j]<arr[j-1]){  //упорядочен по убыванию
   t1=!false;              
}
 else{  //Цифры одинаковы
   t=!false;
}
}
if((s==s1)&&(s!=t1)&&(s!=t)){
  type=1;
}
else if((s!=s1)&&(s==t1)){
  type =2;
    }
else if ((s==t)&&(s!=s1)&&(s!=t1)){
  type=3;
}
else if((s==s1)&&(s==t1)){
  type=4;
}
return type;
}
}
