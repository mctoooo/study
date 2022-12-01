/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
*/
package com.mycompany.chekway;
import java.util.Scanner;
public class Chekway {
public static void main(String[] args) {
//int [][]Mx = {{1,1,0,0,0,1,0},{1,0,0,1,0,1,1},{0,1,0,0,1,1,0},{0,0,0,0,0,1,0},{0,0,1,1,0,0,0},{0,1,0,0,1,1,1},{1,1,0,0,0,0,1}};
//int [][]Mx = {{1,1,1,1,1,1,1},{1,1,1,1,1,1,1},{1,1,1,1,1,1,1},{1,1,1,1,1,1,1},{1,1,1,1,1,1,1},{1,1,1,1,1,1,1},{1,1,1,1,1,1,1}};
//int [][]Mx ={{0,0,0,0,0,0,0},{0,0,0,0,0,0,0},{0,0,0,0,0,0,0},{0,0,0,0,0,0,0},{0,0,0,0,0,0,0},{0,0,0,0,0,0,0},{0,0,0,0,0,0,0}};
int [][]Mx = {{1,1,0,0,0,1,0},{1,1,0,1,0,1,0},{1,1,0,0,0,1,0},{1,1,0,0,1,1,0},{1,1,0,0,0,1,0},{1,1,0,0,0,1,0},{1,1,0,0,0,1,0}};
int j=0;
int i=0;
int rx=0;
int k=0;
int row = 0;
int T1=0,T2=0;
boolean road=false;
row=Mx.length;
int column = Mx[0].length;
int[]Mx1= new int[row*column];
int[]Road= new int[row*column];

System.out.print( "\n ");
    for (i = 0; i < row; i++){
        for (j=0 ;j<column; j++){
            System.out.print( Mx[i][j]+" ; ");// Распечатываем матрицу
        }
    System.out.print( "\n ");
    }
Scanner myScnr = new Scanner(System.in);
System.out.print( "Введите номер города отправления из "+row +" \n ");
T1 = myScnr.nextInt();
System.out.print( "Введите номер города прибытия из "+column +" \n ");
T2 = myScnr.nextInt();
    if((T1>=row)^(T1<0)^(T2>=column)^(T2<0)){
        System.out.println("Введен неверный город. ");
    }
else if(T1==T2)
    {
     System.out.println("Введен один и тот-же город");
    }
else if(Mx[T1][T2]>0)
    {
    System.out.println("Существует прямое сообщение");
    }
else 
    {
    for(i=0;i<column;i++){
        if(Mx[i][T2]>0)
        {
            Mx1[k]=i; //записываем индексы города прибытия
            k++;
        }
    }
    Road[rx]=T2;
    while((Mx1!=null)^(k>0)^(road!=true))
    {
        rx++;
        k--;
        Road[rx]=Mx1[k];
            for(i=0;i<column;i++) 
            {
                if(Mx[i][Mx1[k]]==Mx[T1][i]) //сверяем индексы города отправления с городом прибытия
                { 
                    road=true;
                }
                else if(Mx[i][Mx1[k]]>0) // разворачиваем строку (отправления)в столбец(прибытия) и проверяем
                {                     
                    Mx1[k]=i;        //записываем индекс строки Mx[i][k](прибытия)
                    k++;
                }
            }
    }
    rx++;
    Road[rx]=T1;
        if(road==true)
        {
            System.out.println("между "+T1+" и "+T2+" существует составной путь \n ");
            for(i=rx;i>=0;i--)
            {
                System.out.print(Road[i]+" . ");
            }
        }
    else
        {
        System.out.println("между "+T1+" и "+T2+" путь не существует");
        }
    }
}
}
