/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
*/
package com.mycompany.program1;
import java.util.Scanner;
/**
*
* @author Дракоша Тоша
*/
public class Program1 {
public static void main(String[] args) {
int []arr =null;
int repM=0;
arr = CreateArray(20, 1,30);
PrintArrayToConsole(arr);
repM=Repit(arr);
System.out.println(" \n элемент, встречающийся максимальное количество раз : "+repM);
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
//Функция поиска элемента встречающегося максимальное количество раз
public static int Repit(int []Mx){
int []repit =new int [Mx.length-1];
repit=Mx;
int k=1;
int i=0;
int L=1;
int n=1;
int max=repit[0];
for (i=1;i<repit.length;i++){// находим максимальное число
if(max<repit[i]){
max=repit[i];
}
}
int x=repit[0];
do{
for (i=n;i<repit.length;i++){
if ((repit[n-1]==repit[i])&&(repit[i]<max+1)){
k++;
repit[i]=max+1;
}
}
if(L<k){
L=k;
x=repit[n-1];
}
k=1;
n++;
}
while(n<repit.length-1);
return x;
}
}