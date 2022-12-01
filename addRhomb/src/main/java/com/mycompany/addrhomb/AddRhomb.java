/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.addrhomb;

/**
 *
 * @author Администратор
 */
public class AddRhomb {

    public static void main(String[] args) {

int [][]Mx = {{1,2,3,4,5,6},{1,2,3,4,5,6},{1,2,3,4,5,6},{1,2,3,4,5,6},{1,2,3,4,5,6},{1,2,3,4,5,6}};
int j=0;
int i=0;

int sum =0;
int row = 0;
row=Mx.length;
int column = Mx[0].length;
System.out.print( "\n ");
    for (i = 0; i < row; i++)
    {
        for (j=0 ;j<row; j++)
        {
            System.out.print( Mx[i][j]+" ; ");// Распечатываем матрицу
        } 
    System.out.print( "\n ");
    }
System.out.print( "\n ");
sum=Sum(Mx);
System.out.println("Сумма элементов матрицы 'Ромб' = "+sum);
}
    
// Функция суммы элементов матрицы "ромб"
public static int Sum (int [][]Mx){
int i =0;
int j=0;
int k=0;
int sum =0;
int row = 0;
row=Mx.length;
for(i=(row-1)/2,j=row-row/2; j<row && i>=0; j++,i--)
{ 
    for(k=(j-i)/2;k<=row-1-(j-i)/2;k++){
    sum=sum+Mx[i][k]+Mx[j][k];     
    }
}
return sum;
}
}
