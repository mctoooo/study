/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package program;

/**
 *
 * @author Дракоша Тоша
 */
public class Program {

public static void main(String[] args) {
int [][]Mx =null;
int summa=0;
int repM=0;
Mx = CreateArray(20, 1,30);
PrintArrayToConsole(Mx);
summa=Watch(Mx);
System.out.println( "\n Summ is : "+ summa);
}    


/*Функция создания и заполнения одномерного массива случайными значениями с заданными диапазоном
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

//функция распечатки массива
public static void PrintArrayToConsole(int [][]Mx){
if(Mx != null){
for(int ix = 0;ix < Mx.length; ix++){
    System.out.println();
    for(int jx = 0;jx < Mx.length; jx++){
System.out.print(Mx[ix][jx]+" ");
}
}
}
else{
System.out.print("Array is empty");
}
}


//Функция суммы элементов матрицы песочные часы
public static int Watch(int [][]Mx){

int j=0;
int i=0;
int m=0;
int n=0;
int k=0;
int L=0;
int sum =0;
int row = Mx.length;
for (i=0,j=row-1-i;(i<=(row-1)/2) && (j>=(row-1)/2); i++, j--) {    //Считаем сумму матрицы "часы"
for(k=i,L=i;L<=row-1-i&& k<=j;L++, k++){
   if(i==j){
       sum=sum+Mx[i][k];
   }   
else{
sum=sum+Mx[i][k]+Mx[j][k];
}
}
}
return sum;
}
}

