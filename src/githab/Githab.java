/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
*/
package githab;
/**
*
* @author Student
*/
public class Githab {

public static void main(String[] args) {
try{
Fraction drobA = null; //ссылка
Fraction drobB = null; //ссылка
Fraction drobC = null; //ссылка
Fraction drobD = null; //ссылка

//drobA.add(drobD);

drobA = new Fraction(4,2);
drobB = new Fraction(-3,-2);
drobC = new Fraction(1,4);
drobD = new Fraction(-5,4);

//массив объектов

Fraction[]ftArr = null;
ftArr = new Fraction[10]; // массив ссылок из 10 элементов
for (ix-0; ix<ftArr.length;ix++)
{
ftArr[ix]= new Fraction[ix];
}
//  for-each

for( Fraction fx : ftArr)
{
    if(fx==null)
        System.out.println("null");
   else             
 System.out.println(fx.toFormatString());
}

System.out.println("Count of Objects = "+ Fraction.getCountObject());

if(drobA == drobB)
System.out.println("Equal");
else
System.out.println("Not Equal");

if(drobA.isEqual(drobB))
System.out.println("Equal");
else
System.out.println("Not Equal");



Fraction drobF = drobA.add(drobB);
System.out.println("Count of Objects = "+ Fraction.getCountObject());
drobF = drobA.dev(drobB);
System.out.println("drobA / drobC = " +drobF.toFormatString());
System.out.println("Count of Objects = "+ Fraction.getCountObject());
drobF = drobA.subtraction(drobC);
System.out.println("drobA + drobC = " +drobF.toFormatString());
System.out.println("Count of Objects = "+ Fraction.getCountObject());
drobF = drobA.multiplication(drobC);
System.out.println("drobA * drobC = " +drobF.toFormatString());

drobF = drobA.add(drobB.add(drobC.add(drobD)));
drobF = ((drobA.add(drobB)).add(drobF)).add(drobF);//.add(drobC.add(drobD)));
System.out.println("Count of Objects = "+ Fraction.getCountObject());
System.out.println( drobF.toFormatString());

drobD = drobF;
System.out.println( drobD.toFormatString());
drobD.setCh(1);
drobD.setZn(2);
System.out.println( drobF.toFormatString());
drobD.CopyFraction(drobF);


//System.out.println("Count of Objects = "+ Fraction.getCountObject());


// System.out.println("Count of Objects = "+ Fraction.getCountObject());

}
catch(Exception e){
System.out.println("The Error detectid "+e.getMessage());
}
}
}