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
    public static void PrintArrayToConsole(int [][]Mx){
if(Mx != null){
for(int ix = 0;ix < Mx.length; ix++){ //функция распечатки массива
System.out.println("   " );
    for(int jx=0;jx<Mx.length;jx++){
    System.out.print(Mx[ix][jx]+" ");
}
}
}
else{
System.out.print("Array is empty");
}
}

    public static void main(String[] args) {
Scanner myScnr = new Scanner(System.in);
int [][]Mx =null;
Mx = CreateArray(20, 1,30);
int []Rez=new int[3];

PrintArrayToConsole(Mx);
System.out.println();
System.out.println("введите целое число ");
int x = myScnr.nextInt();

FindX(Mx,x);
if (Rez[0]==1){
    System.out.println("Число "+x+" найденно в ячейке [ "+Rez[1]+ " ][ "+Rez[2]+" ]" );
}
else{
    System.out.println("Число "+x+" не найденно ");
}
}
/*
Функция создания и заполнения одномерного массива случайными значениями с заданными диапазоном
int size - количество элементов массива
int rangeA - верхняя граница диапазона
int rangeB - нижняя граница диапазона
*/
public static int[][] CreateArray(int size, int rangeA,int rangeB){
int[][] arr = null;//Объявляем массив
arr = new int [size][size];// Создаем массив размерности size
for(int ix=0;ix<size;ix++){
    for(int jx=0;jx<size;jx++){
        
        
    
arr[ix][jx] = rangeA + (int) (Math.random() * rangeB);// Записываем значение, полученное в результате вычисления выражения, в ячейку
}
}
return arr;// Возвращаем массив(ссылку)
}
public static  void FindX(int [][]arr,int Num){ //Функция поиска элемента в массиве
if(arr!=null){ // Возвращаем массив из трех элементов,где нулевой если равен нулю то такого элемента нет.
    // первый и второй  это индексы найденного элемента

 int[]Rez={0,0,0};
for (int i=0;i<arr[0].length;i++){
    for (int j=0;j<arr[0].length;j++){
if(arr[i][j]==Num){
  Rez[0]=1;
  Rez[1]=i;
  Rez[2]=j;  
}
}
}
}
}
}