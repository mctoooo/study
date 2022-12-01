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
Fraction drobD = null; //ссылка*/

//Fraction.Nod(45, 30);

//Fraction.setflagCl(true);
Fraction.setflagCl(false);
drobA = new Fraction(44,44);
drobA.setflagObj(true);
System.out.println(drobA.toFormatString());

drobA = new Fraction(4,44);
System.out.println(drobA.toFormatString());

drobA = new Fraction(64,12);
System.out.println(drobA.toFormatString());
//drobA.add(drobD);

drobA = new Fraction(44,23);
drobB = new Fraction(-38,-24);
drobC = new Fraction(10,40);
drobD = new Fraction(-50,40);
// изменяем флаг на уровне объекта,при этом сокрящаться будут все дроби
//без сокращения результатов математических действий

drobD.setflagObj(true);
System.out.println("drobD + flagObj=true " +drobD.toFormatString());
Fraction drobFo = drobA.multiplication(drobC);
System.out.println("drobA * drobC = " +drobFo.toFormatString());
// изменяем флаг на уровне класса,при этом сокрящаться будут все дроби 
// и результаты математических действий

drobC.setflagObj(true);
System.out.println("drobC + flagObj=true " +drobD.toFormatString());
drobFo = drobA.multiplication(drobC);
System.out.println("drobA * drobC = " +drobFo.toFormatString());

//массив объектов

Fraction[]ftArr = null;
ftArr = new Fraction[10]; // массив ссылок из 10 элементов
for (int ix=0; ix<ftArr.length;ix++)
{
ftArr[ix]= new Fraction(ix,ix+1);
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
System.out.println("drobA + drobB = " +drobF.toFormatString());
//System.out.println("Count of Objects = "+ Fraction.getCountObject());
drobF = drobA.dev(drobB);
System.out.println("drobA / drobC = " +drobF.toFormatString());
//System.out.println("Count of Objects = "+ Fraction.getCountObject());
drobF = drobA.subtraction(drobC);
System.out.println("drobA - drobC = " +drobF.toFormatString());
//System.out.println("Count of Objects = "+ Fraction.getCountObject());
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