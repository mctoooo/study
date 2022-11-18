/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package deletingblacknumbers;

import java.util.Scanner;

/**
 *
 * @author Дракоша Тоша
 */
public class DeletingBlackNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a=0;
          try (Scanner in = new Scanner(System.in)) {
            System.out.println("Введите  число:  ");
            a = in.nextInt();
            int p = dataA(a);
            System.out.println("Ваше число"+a);
            System.out.println("Ваше число без четных цифр: "+p );
}
}
     //функция удаления четных цифр числа
public static int dataA(int Num){ 
int x = Num;
int res = 0;
int t=0;
int st=1;
while(x!=0){
t= x%10;
x= x/10;
if(t%2!=0){
res=res+t*st;
st=st*10;
}
}
    return res;
}
}
