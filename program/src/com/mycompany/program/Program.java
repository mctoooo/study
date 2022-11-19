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
System.out.println(" " );
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
int [][]Mx =null;
Mx = CreateArray(15, 1,30);
PrintArrayToConsole(Mx);
System.out.println();
double rez = Composition(Mx);
System.out.println("произведение элементов равно = " +rez);
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
public static double Composition(int [][]Mx) // функция произведения элементов массива
{
double com = 1;
int row = Mx.length;
for(int i = 0;i<row;i++){
for(int j = 0;j<row;j++){
com = com*Mx[i][j];
}
}
return com;
}
}
