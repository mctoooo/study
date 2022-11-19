/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.program;

/**
 *
 * @author Дракоша Тоша
 */


public class Program {
    public static void PrintArrayToConsole(int []Mx){
if(Mx != null){
for(int ix = 0;ix < Mx.length; ix++) //функция распечатки массива
System.out.print(Mx[ix]+" ");
}
else{
System.out.print("Array is empty");
}
}

    public static void main(String[] args) {

int []Mx =null;
Mx = CreateArray(20, 1,30);

PrintArrayToConsole(Mx);
System.out.println();

}
/*
Функция создания и заполнения одномерного массива случайными значениями с заданными диапазоном
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


}
